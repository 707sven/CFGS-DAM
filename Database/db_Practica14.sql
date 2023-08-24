DECLARE
Num NUMBER:=5; --Comentario
/*A continuación comienza el bloque,
Mediante un BEGIN, y finaliza mediante un END*/
BEGIN
    Num:=num*2;
END;

SET SERVEROUTPUT ON

DECLARE
max_salary INTEGER:=65000;

BEGIN
dbms_output.put_line('El salario es: ' ||
max_salary);
END;

DECLARE
hola varchar(50):='Hola Mundo';
BEGIN
dbms_output.put_line(hola);
END;

SET SERVEROUTPUT ON
DECLARE
var_salary INTEGER:=62000;
name VARCHAR2(255);
BEGIN
SELECT first_name INTO name From employees WHere salary=var_salary;
dbms_output.put_line('El nombre es:'||name);
END;

/*Declarar una variable 'a' y una variable 'b'. Ambas numéricas y constantes con valores 10 y 20 respectivamente*/
    /*Sumar ambos valores en una variable llamada "result" y sacarla por consola*/
    /*Sacar por consola el valor más alto de las dos variables, usando una estructura IF*/
    
SET SERVEROUTPUT ON

DECLARE
a NUMBER := 10;
b NUMBER := 20;
Result NUMBER := a + b;

BEGIN
dbms_output.put_line('La suma es '||Result);
IF (a<b) THEN
dbms_output.put_line('El número más grande es '||b);
ELSE
dbms_output.put_line('El número más grande es '||a);
END IF;
END;

/*Realizar una sentencia SELECT que obtenga el nombre del empleado con identificador 1003 y lo asigne a una variable llamada "name"*/
/*Realizar una sentencia SELECT que obtenga el identificador de departamento del empleado con identificador 1003 y lo asigne a una variable llamada "dept".
Si el no tiene departamento asignar un 0*/
set serveroutput on
    DECLARE
name varchar2(20);
    BEGIN
SELECT first_name INTO name FROM employees WHERE employee_number=1003;
DBMS_OUTPUT.PUT_lINE(name);
    END;
    
set serveroutput on
    DECLARE
dept varchar2(20);
    BEGIN
SELECT dept_id INTO id FROM employees WHERE employee_number=1003;
IF (dept is null) THEN
DBMS_OUTPUT.PUT_lINE('0');
ELSE 
DBMS_OUTPUT.PUT_lINE(id);
END IF;
    END;

/*4.3 Siguiendo con el ejercicio anterior, realiza una consulta SELECT que obtenga el nombre del departamento con identificador almacenado
en "dept" y lo guarde en una variable llamada "dept_name". Si el identificador del departamento es un 0, asignar "no tiene departamento" a "dept_name"*/

//ejer 6 ejercicios anteriores pero usando un bucle

SET SERVEROUTPUT ON;

DECLARE
dept INTEGER;
name varchar2(255);
dept_name varchar2(255);
num INTEGER;
BEGIN

for num in 1001..1005
loop
  select first_name into name from employees where employee_number=num;

  
  select dept_id into dept from employees where employee_number=num;
  
  if dept IS NULL then
    dept:=0;
  END IF;
  
  DBMS_OUTPUT.PUT_LINE('Departamento: '||dept);

case dept
when 500 then dept_name:='Superheroes';  
when 501 then dept_name:='Fantasy';  
when 502 then dept_name:='Daily issues'; 
when 503 then dept_name:='Mecha';  
else dept_name:='No tiene departamento';
END CASE;
    
  DBMS_OUTPUT.PUT_LINE('El usuario '||name||' pertenece al departamento '||dept_name);
  
  END LOOP;
  
END;

/*Actividades Tema 15*/
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

/*1. Recorrer en bucle (da igual cual usar) la tabla de empleados almacenando su información en variables (nombre, apellido, id_departamento y salario) 
e imprimir por pantalla el siguiente mensaje (un mensaje por cada empleado):
El empleado [nombre] [apellido] pertenece al departamento [nombre_departamento] y tiene un salario de [salario].
En cada iteración del bucle deberá consultarse la tabla DEPARTMENT para obtener el nombre del departament en función de la id almacenada en id_departamento.*/

SET SERVEROUTPUT ON

DECLARE
nombre VARCHAR(50);
apellido VARCHAR(50);
id_departamento INTEGER;
salario INTEGER;
nombre_departamento varchar2(255);

BEGIN
for num in 1001..1005
loop
    SELECT first_name into nombre FROM employees WHERE employee_number = num;
    SELECT last_name into apellido FROM employees WHERE employee_number = num;
    SELECT dept_id into id_departamento FROM employees WHERE employee_number = num;
    SELECT salary into salario FROM employees WHERE employee_number = num;
    
    IF id_departamento IS NULL then
    dbms_output.put_line('El empleado '|| nombre ||' '|| apellido ||' no pertenece a ningun departamento y tiene un salario de '||salario);
    
    ELSE
    SELECT name into nombre_departamento FROM department WHERE id = id_departamento;    
    dbms_output.put_line('El empleado '|| nombre ||' '|| apellido ||' pertenece al departamento '|| nombre_departamento ||' y tiene un salario de '||salario);
    END IF;
    END loop;

END;
/*2. Solicitar por pantalla dos números de empleados que guardaremos en las variables usuario1 y usuario2. Realizar una consulta a la tabla para ver el 
salario de ambos empleados, los guardaremos en las variables salario1 y salario2. Ahora realizar una comparativa, consultar el nombre de ambos empleados 
e imprimir el siguiente mensaje (colocando en nombre1 el nombre del empleado que cobre más de los dos):
El empleado [nombre1] cobra más que el empleado [nombre2].*/

SET SERVEROUTPUT ON

DECLARE
usuario1 VARCHAR2(255);
usuario2 VARCHAR2(255);
salario1 INTEGER;
salario2 INTEGER;
dept VARCHAR2(255);

BEGIN
    SELECT first_name INTO usuario1 FROM employees WHERE employee_number=&numero;
    SELECT first_name INTO usuario2 FROM employees WHERE employee_number=&numero;
    SELECT salary INTO salario1 FROM employees WHERE first_name = usuario1;
    SELECT salary INTO salario2 FROM employees WHERE first_name = usuario2;
    
    IF(salario1>salario2) THEN
    dbms_output.put_line('El empleado '||usuario1||' cobra mas que el empleado '||usuario2);
    ELSE
    dbms_output.put_line('El empleado '||usuario2||' cobra mas que el empleado '||usuario1);
    END IF;
END;

/*3. Recorrer en bucle la tabla de empleados y, en cada iteración, consultar nombre y salario de cada empleado. 
Se deberá imprimir un mensaje por pantalla que quedará personalizado según unos rangos de salario. 
Haciendo uso de una estructura IF imprimimos el siguiente mensaje (según el rango en el que se encuentre el salario de cada empleado).

a) 0 - 50000 => El empleado [nombre] no tiene para llegar a final de mes.

b) 50001 - 70000 => El empleado [nombre] no se puede quejar.

c) 70001+ => El empleado [nombre] puede quemar billetes.*/

SET SERVEROUTPUT ON

DECLARE
nombre varchar2(200);
salario integer;
num integer;
BEGIN
    FOR num IN 1001..1005 LOOP
    SELECT first_name INTO nombre FROM employees WHERE employee_number=num;
    SELECT salary INTO salario FROM employees WHERE employee_number=num;
    
    IF(salario<50000)THEN
    dbms_output.put_line('El empleado '||nombre||' no llega a final de mes');
    ELSIF(salario>50000 and salario<70000)
        THEN
        dbms_output.put_line('El empleado '||nombre||' no se puede quejar');
    ELSE
    
    dbms_output.put_line('El empleado '||nombre||' puede quemar billetes');
    END IF;
    END LOOP;
END;
