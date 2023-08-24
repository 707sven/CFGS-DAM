--Practica Tema 17
DROP TABLE employees;

DROP TABLE department;

CREATE TABLE department
( id int PRIMARY KEY,1
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
select first_name INTO nombreEmpleado from employees WHERE salary = salarioMax;
dbms_output.put_line('El empleado con el salario más alto es '||nombreEmpleado);
END empleadosSalarioMax;

SET SERVEROUTPUT ON
DECLARE
BEGIN
empleadosSalarioMax;
END;

/*2. Definir una función “consultaSalario” que realice una búsqueda de la tabla en función a un parámetro. 
Ese parámetro será “employeeId” y se deberá encontrar el empleado cuyo “employee_number” coincida con dicho parámetro. 
Se deberá devolver el salario de dicho empleado. Declara un bloque donde se pida un “employeeId” por pantalla para invocar
dicha función y saque el siguiente mensaje por pantalla:
El empleado [employeeId] tiene un salario de [salario].*/
CREATE OR REPLACE FUNCTION consultaSalario(employeeId number)
RETURN number
AS
salario NUMBER;
BEGIN
select salary into salario from employees WHERE employee_number = employeeId;
return salario;
END consultaSalario;

SET SERVEROUTPUT ON
DECLARE
employeeId number := &entrada;
salario number;
BEGIN
salario := consultaSalario(employeeId);
dbms_output.put_line('El empleado '||employeeId||' tiene un salario de '||salario);
END;

/*3.Definir un trigger que se active tras un insert en la tabla “employees”. 
Deberá comprobar si el salario del nuevo insert supera los 90000 y en tal caso sacar el siguiente mensaje por pantalla:
Ojito con [first_name] que nos arruina.
Declarar un bloque donde se realice un insert en la tabla “employees” con datos inventados pero válidos. 
El único requisito es que el salario sea superior a los 90000.*/
CREATE OR REPLACE TRIGGER tr_insert_employees
AFTER INSERT ON employees
FOR EACH ROW
WHEN(new.salary > 90000)
BEGIN
dbms_output.put_line('Ojito con '||:new.first_name||' que nos arruina.');
END tr_insert_employees;

INSERT INTO employees VALUES (1006, 'Antonio', 'Jose', 98600, 501);

/*------------*/
/*1. Siguiendo el modelo de la imagen definir un objeto “employee_object” 
y otro “department_object” que tenga los mismos campos que las tablas homónimas:*/
CREATE OR REPLACE TYPE employee_object AS OBJECT(
first_name VARCHAR(50),
last_name VARCHAR(100),
employee_number NUMBER,
dept_id NUMBER,
salary NUMBER);

CREATE OR REPLACE TYPE department_object AS OBJECT(
id NUMBER,
name VARCHAR(255));

DROP TYPE employee_object;

/*2. Mediante el comando ALTER redefinir el objeto “employee_object”. 
Se deberá eliminar el campo “dept_id” y designar uno nuevo “var_department” que sea del timpo “department_object”. */
CREATE OR REPLACE TYPE employee_object AS OBJECT(
employee_number NUMBER,
last_name VARCHAR(255),
first_name VARCHAR(255),
salary NUMBER,
var_department department_object,
MEMBER FUNCTION getSalary RETURN NUMBER,
MEMBER PROCEDURE setSalary(salary NUMBER));

CREATE OR REPLACE TYPE BODY employee_object AS
    
    MEMBER FUNCTION getSalary RETURN NUMBER
    AS
    BEGIN
    RETURN salary;
    END getSalary;
    
    MEMBER PROCEDURE setSalary (salary NUMBER)
    AS
    BEGIN
    SELF.salary := salary;
    END setSalary;

END;

/*3. Mediante el comando CREATE OR REPLACE añadir un metodo "getSalary" a nuestro objeto "employee_object".
Crear un cuerpo para ese metodo donde se devuelva el salario (salary) del empleado en cuestion.*/


-- Parámetro SELF
MEMBER PROCEDURE setSalario (Salario NUMBER)
IS BEGIN
    SELF.Salario:= Salario;
END setSalario

--Ejemplo Constructores
SET SERVEROUTPUT ON
DECLARE
empleado1   employee_object:= employee_object();
empleado2   employee_object;
department1 department_object:= department_object(501, 'Profesor');
BEGIN
empleado1.last_name:= 'Canillas';
empleado2:= employee_object(1007, 'Canillas', 'Daniel'
                            10.000,
                            department_object(502, 'Alumno'));
                            
-- Constructor de objeto, ejemplos
create or replace TYPE employee_object AS OBJECT(
employee_number NUMBER,
last_name VARCHAR(255),
first_name VARCHAR(255),
salary number,
department department_object,
MEMBER FUNCTION getSalary RETURN number
);

create or replace TYPE department_object AS OBJECT(
dept_id NUMBER(38,0),
name VARCHAR(255));

-- Creacion de body con map
create or replace TYPE BODY employee_object AS
    MEMBER FUNCTION getSalary RETURN NUMBER IS BEGIN
        return salary;
    END getSalary;
    MAP MEMBER FUNCTION orden RETURN NUMBER IS BEGIN
        return employee_number;
    END orden;
END;

---
/* 1.Define un método MAP que devuelva el “employee_number” y se pueda usar para comparar los empleados. 
Este método habrá que definirlo en nuestro objeto “employee_object” y luego implementarlo en el body.
Crea un bloque de código donde se instancien dos variables del tipo “employee_object” y se realice una 
comparativa del tipo: empleado1 > empleado2 Y devuelva el nombre del empleado con el mayor “employee_number”.
*/

create or replace  TYPE employee_object AS OBJECT(
first_name VARCHAR2(50),
last_name VARCHAR(50),
employee_number NUMBER,
salary NUMBER,
var_department department_object,
MEMBER FUNCTION getSalary RETURN NUMBER,
MEMBER PROCEDURE setSalary (salary NUMBER),

MAP MEMBER FUNCTION compararEmpleados RETURN NUMBER
);

-------------------------------------------------------------------------------------

create or replace TYPE BODY employee_object AS 
    MEMBER FUNCTION getSalary RETURN NUMBER IS BEGIN
    RETURN salary; 
    END getSalary;
    MEMBER PROCEDURE setSalary (salary NUMBER) IS BEGIN
    SELF.salary:=salary;
    END setSalary;
    
    MAP MEMBER FUNCTION compararEmpleados RETURN NUMBER IS 
    BEGIN 
        RETURN(employee_number);
    END compararEmpleados;

END;
-------------------------------------------------------------------------------------
SET SERVEROUTPUT ON
    DECLARE
empleado1 employee_object;
empleado2 employee_object;

    BEGIN
empleado1:=employee_object('Sergio','Castillo',1008,50400, department_object(501,'Medac'));
empleado2:=employee_object('Raul','Perez',1009,65200, department_object(501,'Medac'));

IF (empleado1 > empleado2) THEN
DBMS_OUTPUT.PUT_lINE(empleado1.first_name);
ELSE 
DBMS_OUTPUT.PUT_lINE(empleado2.first_name);
END IF;
END;

/*
2.Define un método ORDER que devuelva ordene los empleados según el “employee_number”.
Crea un bloque de código donde se crean dos variables del tipo “employee_object” y se realice una comparativa del tipo:
empleado1.orderEmployee(empleado2) E imprima por pantalla el resultado de la llamada a dicha función.
*/

create or replace  TYPE employee_object AS OBJECT(
first_name VARCHAR2(50),
last_name VARCHAR(50),
employee_number NUMBER,
salary NUMBER,
var_department department_object,
MEMBER FUNCTION getSalary RETURN NUMBER,
MEMBER PROCEDURE setSalary (salary NUMBER),

ORDER MEMBER FUNCTION ordenarEmpleados(a employee_object) RETURN NUMBER
);

---------------------------------------------------------------------------------------


create or replace TYPE BODY employee_object AS 
    MEMBER FUNCTION getSalary RETURN NUMBER IS BEGIN
    RETURN salary; 
    END getSalary;
    MEMBER PROCEDURE setSalary (salary NUMBER) IS BEGIN
    SELF.salary:=salary;
    END setSalary;
    
    ORDER MEMBER FUNCTION ordenarEmpleados(a employee_object) RETURN NUMBER IS 
    BEGIN 
    IF (self.employee_number)<(a.employee_number) THEN
    RETURN -1;
    ELSIF (self.employee_number) > (a.employee_number) THEN
    RETURN 1;
    ELSE RETURN 0;
    END IF;
       
    END ordenarEmpleados;

END;

--------------------------------------------------------------------------------------

SET SERVEROUTPUT ON
    DECLARE
empleado1 employee_object;
empleado2 employee_object;

    BEGIN
empleado1:=employee_object('Sergio','Castillo',1008,50400, department_object(501,'Medac'));
empleado2:=employee_object('Raul','Perez',1009,65200, department_object(501,'Medac'));

DBMS_OUTPUT.PUT_lINE(empleado1.ordenarEmpleados(empleado2));
 END;

-- TEMA 20
/* 1. Introducir el código de la página anteriorpara crear una tabla en base a nuestro objeto“department_object”.Comprobar que la tabla se ha creado con los
campos correctos. */

CREATE TABLE department_object_table OF department_object;

-------------------------------------
drop type employee_object;
drop type department_object;
create or replace TYPE department_object AS OBJECT(
dept_id NUMBER,
name VARCHAR(255));
create or replace TYPE employee_object AS OBJECT(
employee_number NUMBER,
last_name VARCHAR(255),
first_name VARCHAR(255),
salary number,
department department_object,
MEMBER FUNCTION getSalary RETURN number
);
create or replace TYPE BODY employee_object AS
    MEMBER FUNCTION getSalary RETURN NUMBER IS BEGIN
        return salary;
    END getSalary;
END;
CREATE TABLE department_object_table OF department_object;
CREATE TABLE employee_object_table OF employee_object;
------------------------------

----------
drop type employee_object;
drop type department_object;
create or replace TYPE department_object AS OBJECT(
dept_id NUMBER,
name VARCHAR(255));
create or replace TYPE employee_object AS OBJECT(
employee_number NUMBER,
last_name VARCHAR(255),
first_name VARCHAR(255),
salary number,
department department_object,
MEMBER FUNCTION getSalary RETURN number
);
create or replace TYPE BODY employee_object AS
    MEMBER FUNCTION getSalary RETURN NUMBER IS BEGIN
        return salary;
    END getSala
-------------------------------
drop type employee_object;
drop type department_object;
create or replace TYPE department_object AS OBJECT(
dept_id NUMBER,
name VARCHAR(255));

-----------------------------
drop type employee_object;
drop type department_object;
create or replace TYPE department_object AS OBJECT(
dept_id NUMBER,
name VARCHAR(255));
create or replace TYPE employee_object AS OBJECT(
employee_number NUMBER,
last_name VARCHAR(255),
first_name VARCHAR(255),
salary number,
department department_object,
MEMBER FUNCTION getSalary RETURN number
);
create or replace TYPE BODY employee_object AS
    MEMBER FUNCTION getSalary RETURN NUMBER IS BEGIN
        return salary;
    END getSalary;
END

---------------------------

create or replace TYPE employee_object AS OBJECT(
employee_number NUMBER,
last_name VARCHAR(255),
first_name VARCHAR(255),
salary number,
department department_object,
MEMBER FUNCTION getSalary RETURN number
);
create or replace TYPE BODY employee_object AS
    MEMBER FUNCTION getSalary RETURN NUMBER IS BEGIN
        return salary;
    END getSalary;
END;
CREATE TABLE department_object_table OF department_object;
CREATE TABLE employee_object_table OF employee_object;

SELECT * FROM department_object_table;

----------------------------------------



