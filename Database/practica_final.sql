/*Practica Final*/

/* 1. Definir un nuevo tipo para crear un objeto llamado “OB_PELICULA” que 
contenga los campos indicados en el cuadro de abajo */
CREATE OR REPLACE TYPE ob_pelicula AS OBJECT(
ID number,
Nombre varchar2(50),
Calificacion number,
Categoria varchar2(50),
Duracion number,
Lanzamiento number,
MEMBER function getID RETURN number,
MEMBER function getNombre RETURN varchar2,
MEMBER FUNCTION getCalificacion RETURN number,
MEMBER FUNCTION getCategoria RETURN varchar2,
MEMBER FUNCTION getDuracion RETURN number,
MEMBER FUNCTION getLanzamiento RETURN number,
MEMBER PROCEDURE toString
);

/*2. Añadir a la definición del objeto (CREATE OR REPLACE) los siguientes métodos
(procedimientos o funciones) y desarrollar el BODY con los nuevos métodos añadiendo
la funcionalidad que se indica abajo: */

CREATE OR REPLACE TYPE BODY ob_pelicula AS 
    MEMBER FUNCTION getID RETURN number is BEGIN
    return ID;
    END getID;
    MEMBER FUNCTION getNombre RETURN varchar2 is BEGIN
    return Nombre;
    END getNombre;
    MEMBER FUNCTION getCalificacion RETURN number is BEGIN
    return Calificacion;
    END getCalificacion;
    MEMBER FUNCTION getCategoria RETURN varchar2 is BEGIN
    return Categoria;
    END getCategoria;
    MEMBER FUNCTION getDuracion RETURN number is BEGIN
    return Duracion;
    END getDuracion;
    MEMBER FUNCTION getLanzamiento RETURN number is BEGIN
    return Lanzamiento;
    END getLanzamiento;
    
    MEMBER PROCEDURE toString is BEGIN
    dbms_output.put_line('ID: ' || ID || '; Nombre: '|| Nombre ||'; Calificacion: '|| Calificacion ||'; Categoria: '|| Categoria ||'; Duracion: '|| Duracion || '; Lanzamiento: ' || Lanzamiento);
    END toString;
    
END;

/* 3. Crear una tabla en base al objeto OB_PELICULA. */
CREATE TABLE ob_pelicula_table OF ob_pelicula;

/* 4. . Insertar los siguientes registros a la nueva tabla creada, haciendo uso de 
comandos INSERT simples, sin crear bloque de código DECLARE/BEGIN: */
INSERT INTO ob_pelicula_table VALUES (1, 'Guardianes de la galaxia Vol. 3', 7.7, 'Ciencia Ficcion', 150, 2023);
INSERT INTO ob_pelicula_table VALUES (2, 'El Rey Leon', 7.9, 'Drama', 85, 1994);
INSERT INTO ob_pelicula_table VALUES (3, 'Braveheart', 8.0, 'Historico', 177, 1995);
INSERT INTO ob_pelicula_table VALUES (4, 'Interstellar', 7.9, 'Ciencia Ficcion', 169, 2014);

/* 5. Crear un bloque de código principal donde se realice la siguiente lógica: 
- Crear una lista (tabla anidada), llamada “tipo_peliculas” que tenga como tipo el OB_PELICULA.
- Crear una variable del tipo lista llamada “peliculas ”.
- Crear una variable del tipo OB_PELICULA llamada “pelicula”.
- Crear un bucle (da igual cual) donde se realice un SELECT de la tabla y se obtengan todos los resultados.
En cada iteración del bucle se deberá obtener los datos de un registro. De forma que habrá que dar 4 vueltas
en el bucle.
- En cada iteración del bucle se deberá ir metiendo el registro encontrado en la variable “pelicula”. 
Insertar en el bucle dicha variable en nuestra lista “peliculas”.
- Crear un segundo bucle para recorrer la lista y en cada iteración se deberá llamar al método toString 
de los elementos de la tabla. Este método sacará el mensaje por pantalla según lo definido arriba. */

SET SERVEROUTPUT ON
DECLARE

TYPE tipo_peliculas IS TABLE OF ob_pelicula;
peliculas tipo_peliculas:= tipo_peliculas();
pelicula ob_pelicula;
id number;
nombre varchar2(100);
calificacion number;
categoria varchar2(100);
duracion number;
lanzamiento number;

BEGIN
FOR i IN 1..4 LOOP
SELECT * INTO id,nombre,calificacion,categoria,duracion,lanzamiento FROM ob_pelicula_table WHERE id=i;
pelicula := ob_pelicula(id,nombre,calificacion,categoria,duracion,lanzamiento);
peliculas.EXTEND;
peliculas(i) := pelicula;
END LOOP;

FOR i IN 1..4 LOOP
peliculas(i).toString;
END LOOP;

END;

