CREATE TABLE fabricante (
  id INT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  id INT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio NUMBER NOT NULL,
  id_fabricante INT NOT NULL,
  FOREIGN KEY (id_fabricante) REFERENCES fabricante(id)
);

INSERT INTO fabricante VALUES(1, 'Asus');
INSERT INTO fabricante VALUES(2, 'Lenovo');
INSERT INTO fabricante VALUES(3, 'Hewlett-Packard');
INSERT INTO fabricante VALUES(4, 'Samsung');
INSERT INTO fabricante VALUES(5, 'Seagate');
INSERT INTO fabricante VALUES(6, 'Crucial');
INSERT INTO fabricante VALUES(7, 'Gigabyte');
INSERT INTO fabricante VALUES(8, 'Huawei');
INSERT INTO fabricante VALUES(9, 'Xiaomi');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, 6);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

/*Comandos para mostrar campos de la tabla*/
SELECT * FROM producto;
SELECT id_fabricante FROM producto;
SELECT id_fabricante Fabricante FROM producto;
SELECT nombre FROM fabricante;
SELECT nombre,precio FROM producto;
SELECT * FROM producto WHERE (id_fabricante = 1) AND (precio > 203);
SELECT * FROM producto WHERE precio < 100;
SELECT * FROM fabricante WHERE nombre= 'Samsung';
SELECT * FROM producto order by precio DESC;
SELECT * FROM producto order by id_fabricante, precio DESC;
SELECT id_fabricante, AVG(precio) FROM producto group by id_fabricante;
SELECT COUNT(*), id_fabricante FROM producto group by id_fabricante;
SELECT id_fabricante, COUNT(*) FROM producto group by id_fabricante;
SELECT id_fabricante Fabricante, SUM(precio) SUMA FROM producto group by id_fabricante;

SELECT id_fabricante Fabricante, AVG(precio) Media
FROM producto
GROUP BY id_fabricante
HAVING id_fabricante = &idFab;

/*Si un valor es NULL todo el resultado será NULL*/
select 5+NULL from producto
where
id_fabricante
IN (4,5,6);

select id, nombre 
from fabricante 
where nombre in ('Lenovo','Huawei','Xiaomi');

/*Para redondear un precio hay que usar ROUND(valor, cuantos decimales quieres)*/
select nombre, precio, ROUND(precio/1.21, 2)precio_sin_iva
from producto;

/*Para concatenar resultados se usa doble pipie (||)
Al concatenar se van a unir todos los resultados en una sola columna*/
select nombre || precio 
from producto;

select nombre ||' pepino ' || precio || '€' descripcion
from producto;

select nombre ||' - ' || precio || '€' descripcion
from producto;

select nombre ||' - ' || precio|| '€' descripcion
from producto
where precio BETWEEN 100 AND 200;

/*Mostrar las fechas con los meses (para mostrar las fechas sin los meses solo se usa SYSDATE)*/
select nombre, precio, add_months(sysdate, id_fabricante)
from producto;

/*1. Realizar una búsqueda de los empleados cuyos nombres sean “Jack”, “Jane” o “Brad”.*/
SELECT first_name, last_name
FROM employees 
WHERE first_name IN ('Jack','Jane','Brad');

/*2. Realizar una búsqueda de los empleados cuyos salarios sean superiores a 60000 y cuyo departamento sea el 500.*/
SELECT first_name, last_name, salary, dept_id
FROM employees
WHERE dept_id = 500 AND salary > 60000;

/*3. Realizar una búsqueda de los empleados y mostrar en una sola columna llamada “Empleado” tanto su nombre como su apellido.*/
SELECT first_name || last_name Empleados
FROM employees;

/*4. Realizar una búsqueda de los empleados y mostrar su nombre, apellido, salario y añadir una columna al resultado con la fecha actual.*/
SELECT first_name, last_name, salary, 
sysdate Fecha
FROM employees;

/*5. Igual que la búsqueda anterior pero añadir al mes, de la fecha actual, el índice del número de cada empleado.*/
SELECT first_name, last_name, salary, employee_number,
add_months (sysdate, employee_number) Fecha
FROM employees;

/*//////////////////////////////////////*/

DECLARE
    TYPE Persona IS RECORD (
        CODIGO INTEGER(2),
        NOMBRE VARCHAR(20),
        EDAD NUMBER(3)
    );
    Juan Persona;
BEGIN
    Juan.CODIGO := 1;
    Juan.NOMBRE := 'Juan';
    Juan.EDAD := 33;
    INSERT INTO PRUEBA VALUES Juan;
END;

/*Ejemplo pizarra*/
SET SERVEROUTPUT ON;
DECLARE
    TYPE employee_record IS RECORD(
        employee_id NUMBER,
        last_name VARCHAR(200),
        first_name VARCHAR(200),
        salary NUMBER,
        dept_id NUMBER
    );
    new_employee employee_record:=employee_record();
BEGIN
   select * into new_employee from employees where employee_num=1004;
   dbms_output.put_line(new_employee.employee_id||' : '||new_employee.first_name||' : '||new_employee.last_name||' : '||new_employee.salary||' : '||new_employee.dept_id);
END;

SET SERVEROUTPUT ON;

DECLARE 
type employee_record IS RECORD(
    employee_id number,
    last_name varchar(200),
    first_name varchar(200),
    salary number, 
    dept_id number
);
    new_employee employee_record:=employee_record();
BEGIN
   select * into new_employee from employees where employee_number=1004;
   dbms_output.put_line(new_employee.employee_id||' : '||new_employee.first_name||' : '||new_employee.last_name||' : '||new_employee.salary||' : '||new_employee.dept_id);
   
END;

SET SERVEROUTPUT ON
DECLARE
new_employee3 EMPLOYEES %ROWTYPE;

BEGIN
new_employee3.employee_number:=1006;
new_employee3.last_name:='gomez';
new_employee3.first_name:='lucas';
new_employee3.salary:=54300;
new_employee3.dept_id:=502;

INSERT INTO employees values new_employee3;

dbms_output.put_line(new_employee3.employee_number||' : '||new_employee3.first_name||' : '||new_employee3.last_name||' : '||new_employee3.salary||' : '||new_employee3.dept_id);
END;

/* Asignacion de arrays u palabras clave */
/*Extend*/
prueba1.EXTEND(1); -- Se añade un elemento nulo
prueba1.EXTEND(5); -- Se añaden 5 elementos nulos
prueba1.EXTEND(5,2); -- Se añaden 5 copias del elemento 2

/*Count*/
-- LIMIT
-- FIRST
-- LAST
-- PRIOR
-- NEXT

SET SERVEROUTPUT ON;
DECLARE
    TYPE array_number_type IS VARRAY (100) OF number;
    array_number array_number_type:= array_number_type();
BEGIN
    FOR i in 1..100 loop
    array_number.EXTEND;
    array_number(i):=i;
    dbms_output.put_line(array_number(i));
    end loop;
END;

/**/
SET SERVEROUTPUT ON
DECLARE
name varchar(255);
BEGIN
    FOR i IN 1..5 LOOP
        IF (i != 4) THEN
        SELECT first_name INTO name FROM
        employees WHERE employee_number = i+1000;
        dbms_output.put_line(name);
        END IF;
    END LOOP;
END;

/*Cursores*/
SET SERVEROUTPUT ON
DECLARE
    CURSOR prueba IS
    SELECT first_name, salary FROM employees;
        
    first_name VARCHAR2(20);
    salary NUMBER;
BEGIN
    OPEN prueba;
    LOOP
        FETCH prueba INTO first_name, salary;
        --Se muestran los 5 primeros
        EXIT WHEN (prueba%ROWCOUNT>5);
    END LOOP;
    CLOSE prueba;
END;

SET SERVEROUTPUT ON
DECLARE
CURSOR prueba IS
SELECT first_name, salary FROM employees;

first_name VARCHAR2(20);
salary NUMBER;
BEGIN
OPEN prueba;
LOOP
FETCH prueba INTO first_name, salary;
EXIT WHEN (prueba%ROWCOUNT >5);
END LOOP;
CLOSE prueba;
END;

/*Actividades Tema 16*/
DROP TABLE employees;

DROP TABLE department;

CREATE TABLE department
( id int PRIMARY KEY,
  name VARCHAR(50) NOT NULL
);

CREATE TABLE employees
( employee_number int PRIMARY KEY,
  last_name VARCHAR(50) NOT NULL,
  first_name VARCHAR(50) NOT NULL,
  salary int,
  dept_id int,
  CONSTRAINT fk_idDept
  FOREIGN KEY (dept_id) REFERENCES department(id)
);

INSERT INTO department VALUES (500, 'Superheroes');
INSERT INTO department VALUES (501, 'Fantasy');
INSERT INTO department VALUES (502, 'Daily issues');
INSERT INTO department VALUES (503, 'Mecha');

INSERT INTO employees VALUES (1001, 'Wayne', 'Bruce', 62000, 500);
INSERT INTO employees VALUES (1002, 'Prince', 'Diana', 57500, 500);
INSERT INTO employees VALUES (1003, 'Bolson', 'Frodo', 71000, 501);
INSERT INTO employees VALUES (1004, 'El Gris', 'Gandalf', 42000, 501);
INSERT INTO employees VALUES (1005, 'Connor', 'John', 85000, null);

/*1. Hacer uso de las cláusulas %TYPE o %ROWTYPE para definir una variable, llamada info_employee, 
que contenga todos los campos de la tabla EMPLOYEES. Recorrer en bucle (da igual cual usar) la tabla 
de empleados almacenando su información en la nueva variable definida.

Definir otra variable nombre_departamento donde, en cada iteración del bucle, deberá consultarse 
la tabla DEPARTMENT para obtener el nombre del departamento en función de la id almacenada en nuestra variable.*/
SET SERVEROUTPUT ON
DECLARE
    info_employee employees%ROWTYPE;
    
BEGIN
    info_employee.employee_number:=1006;
    info_employee.last_name:='gomez';
    info_employee.first_name:='lucas';
    info_employee.salary:=54300;
    info_employee.dept_id:=502;
    
    INSERT INTO employees values info_employee;
    dbms_output.put_line('El empleado '||info_employee.first_name||' '||info_employee.last_name||' pertenece al departamento '||info_employee.dept_id||' y tiene un salario de '||info_employee.salary||'.');

END;



