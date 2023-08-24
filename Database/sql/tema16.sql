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
    TYPE info_employee IS RECORD(
    employee_id NUMBER,
    last_name VARCHAR2(255),
    first_name VARCHAR2(255),
    salary NUMBER,
    dept_id NUMBER);
    TYPE employees_table IS TABLE OF info_employee;
    employees_list employees_table:=employees_table();
BEGIN
    FOR i IN 1..5 LOOP
    employees_list.EXTEND();
    SELECT * INTO employees_list(i) FROM employees WHERE
    employee_number=i+1000;
    dbms_output.put_line('El empleado '||employees_list(i).first_name||' '||employees_list(i).last_name||' pertenece al departamento '||employees_list(i).dept_id||' y tiene un salario de '||employees_list(i).salary||'.');
    END LOOP;
END;

/*2. Definir un array de tipo number llamada numbers_type con un tamaño límite de 10. 
Definir una variable del tipo numbers_type.

Crear un bucle (da igual cual sea) para realizar 10 iteraciones donde se insertarán en el array 
los 10 primeros números pares, empezando por 0.

Crear otro bucle donde se imprima el contenido del array fijando como límite de iteraciones 
el tamaño del mismo.
*/
SET SERVEROUTPUT ON;
DECLARE
    TYPE numbers_type IS VARRAY (10) OF number;
    array_number numbers_type:= numbers_type();
BEGIN
    FOR i in 1..10 loop
    array_number.EXTEND;
    array_number(i):=i;
    dbms_output.put_line(array_number(i));
    end loop;
END;



/*
3. Crear un cursor donde se haga un SELECT de todos los campos de todos los empleados.

Crear un tipo tabla anidada llamada employees_table_type que tenga como tipo todos los 
campos de la tabla.

Crear un bucle que terminará cuando se hayan analizado todos los resultados obtenidos por el cursor. 

En cada iteración del bucle se deberá añadir un elemento nuevo a nuestra tabla anidada que 
hayamos definido del tipo employees_table_type. */
SET SERVEROUTPUT ON
DECLARE
    CURSOR employees_table_type IS SELECT * FROM employees;
    numFilas NUMBER;
    employee employees%ROWTYPE;
BEGIN
    SELECT COUNT(*) INTO numFilas FROM employees;
    OPEN employees_table_type;
        LOOP
        FETCH employees_table_type INTO employee;
        dbms_output.put_line(employee.first_name||' '||employee.last_name||' '||employee.salary||' '||employee.dept_id);
        EXIT WHEN(employees_table_type%ROWCOUNT>5);
    END LOOP;
    CLOSE employees_table_type;
END;


--Tema 16 BBDD

--creación de los procedimientos (como los métodos)
CREATE OR REPLACE PROCEDURE imprimirNombre (nombre VARCHAR2)
AS
BEGIN
dbms_output.put_line('Nombre '||nombre);
END imprimirNombre;

--uso del método 
SET SERVEROUTPUT ON
DECLARE
BEGIN
imprimirNombre('EjemploNombre');
END imprimirNombre;

--Ejercicios
--Definir un procedimiento donde se reciba un nombre por parámetro, consulte el salario de dicho nombre en la tabla EMPLOYEES y lo imprima por pantalla.

CREATE OR REPLACE PROCEDURE imprimirNombre (nombre VARCHAR2)
AS
salario number;
BEGIN
select salary INTO salario from employees where first_name = nombre;
dbms_output.put_line('Nombre '||nombre ||' Salario '||salario);
END imprimirNombre;

--Declarar un bloque donde se invoque dicho procedimiento pasándole un nombre que pertenezca a la tabla.

SET SERVEROUTPUT ON;
DECLARE
BEGIN
imprimirSalario('Diana');
END;

--Definir una función que reciba un nombre, consulta la tabla EMPLOYEES y devuelva un registro con todos los datos de dicho empleado.

--Declarar un bloque donde se invoque dicha función pasándole un nombre que pertenezca a la tabla

CREATE OR REPLACE FUNCTION buscarEmpleado (nombre VARCHAR2)
return Employees%ROWTYPE
AS
datos Employees%ROWTYPE;
BEGIN
select * INTO datos from employees where first_name = nombre;
return datos;
END buscarEmpleado;

--Imprimir por pantalla todos los datos de dicho empleado

SET SERVEROUTPUT ON
DECLARE
datos Employees%ROWTYPE;
BEGIN
datos := buscarEmpleado('John');
dbms_output.put_line('Modificar para mostrar los datos');
END imprimirNombre;


--Practica Tema 17
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

/*1. Definir una función “empleadoSalarioMax” que realice una búsqueda de la tabla y encuentre al empleado con salario más alto.
Esta función deberá devolver el nombre de dicho usuario. Declarar un bloque donde se invoque dicha función e imprima por pantalla el siguiente mensaje:
El empleado con el salario más alto es [nombreEmpleado].*/
CREATE OR REPLACE PROCEDURE empleadosSalarioMax
AS
nombreEmpleado VARCHAR(50);
salarioMax number;
BEGIN
select MAX(salary) INTO salarioMax from employees;
select first_name INTO nombreEmpleado from employees WHERE salary = salario;
dbms_output.put_line('El empleado con el salario más alto es '||nombreEmpleado);
END empleadosSalarioMax;

SET SERVEROUTPUT ON
DECLARE
BEGIN
empleadosSalarioMax;
END;