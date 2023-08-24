/* EJERCICIOS - Tema 18/19/20: Bases de datos objeto - relacionales */

-- 1. Definir un nuevo tipo para crear un objeto llamado �OB_SERIE� que contenga los campos indicados en el cuadro de abajo
CREATE OR REPLACE TYPE ob_serie AS OBJECT(
Nombre varchar2(50),
Puntuacion number,
Categoria varchar2(50),
NumTemp number,
Animacion number,
MEMBER function getNombre RETURN varchar2,
MEMBER FUNCTION getPuntuacion RETURN number,
MEMBER FUNCTION getCategoria RETURN varchar2,
MEMBER FUNCTION getNumTemp RETURN number,
MEMBER FUNCTION getAnimacion RETURN number,
MEMBER PROCEDURE toString
);

/* 2. A�adir a la definici�n del objeto (CREATE OR REPLACE) los siguientes m�todos
(procedimientos) y desarrollar el BODY con los nuevos m�todos a�adiendo la funcionalidad
que se indica abajo */

CREATE OR REPLACE TYPE BODY ob_serie AS 
    MEMBER FUNCTION getNombre RETURN varchar2 is BEGIN
    return Nombre;
    END getNombre;
    MEMBER FUNCTION getPuntuacion RETURN number is BEGIN
    return Puntuacion;
    END getPuntuacion;
    MEMBER FUNCTION getCategoria RETURN varchar2 is BEGIN
    return Categoria;
    END getCategoria;
    MEMBER FUNCTION getNumTemp RETURN number is BEGIN
    return NumTemp;
    END getNumTemp;
    MEMBER FUNCTION getAnimacion RETURN number is BEGIN
    return Animacion;
    END getAnimacion;
    
    MEMBER PROCEDURE toString is BEGIN
    dbms_output.put_line('Nombre: ' || Nombre || '; Puntuacion: '|| Puntuacion ||'; Categoria: '|| Categoria ||'; NumTemp: '|| NumTemp);
    END toString;
END;

-- 3. Crea una tabla en base al objeto OB_SERIE
CREATE TABLE ob_serie_table OF ob_serie;

-- 4. Insertar los siguientes registros a la nueva tabla creada, haciendo uso de comandos INSERT simples, sin crear bloque de c�digo DECLARE/BEGIN
INSERT INTO ob_serie_table VALUES ('JoJos Bizarre Adventure', 7, 'Accion', 5, 1);
INSERT INTO ob_serie_table VALUES ('The Last of Us', 7.8, 'Drama', 1, 0);
INSERT INTO ob_serie_table VALUES ('The White Lotus', 7, 'Comedia', 2, 0);
INSERT INTO ob_serie_table VALUES ('Star Wars Visions', 6.2, 'Ciencia Ficcion', 2, 1);
    
-- 5. Crear un bloque de c�digo principal donde se realice la siguiente l�gica
/*
- Crear una lista (tabla anidada), llamada �tipo_series� que tenga como tipo el
OB_SERIE.
- Crear una variable del tipo lista llamada �series�.
- Crear una variable del tipo OB_SERIE llamada �serie�.
- Crear un cursor llamado �cursor_series� que realice una b�squeda de toda la informaci�n de la tabla.
- Recorrer en bucle, hasta que el cursor no tenga m�s resultados, e ir insertando el registro encontrado en cada iteraci�n del bucle en la variable �serie�. Insertar en
bucle dicha variable en nuestra lista �series�.
- En cada iteraci�n del bucle se deber� llamar al m�todo toString del elemento insertado. Este m�todo sacar� el mensaje por pantalla seg�n lo definido arriba.
*/

SET SERVEROUTPUT ON
DECLARE

TYPE tipo_series IS TABLE OF ob_serie;
series tipo_series := tipo_series();
serie ob_serie;
CURSOR cursor_series IS SELECT * FROM ob_serie_table;
NumFilas NUMBER;

Nombre VARCHAR2(50);
Puntuacion NUMBER;
Categoria VARCHAR(100);
NumTemp NUMBER;
Animacion NUMBER;

BEGIN
SELECT COUNT(*) INTO NumFilas FROM ob_serie_table;
OPEN cursor_series;

FOR i IN 1..NumFilas LOOP
FETCH cursor_series INTO Nombre,Puntuacion,Categoria,NumTemp,Animacion;
serie := ob_serie(Nombre,Puntuacion,Categoria,NumTemp,Animacion);
series.EXTEND;
series(i) := serie;
series(i).toString;
END LOOP;

CLOSE cursor_series;
END;



