DROP TABLE producto;

DROP TABLE fabricante;

CREATE TABLE fabricante (
  id INT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL
);

CREATE TABLE producto (
  id INT PRIMARY KEY,
  nombre VARCHAR(100) NOT NULL,
  precio NUMBER NOT NULL,
  id_fabricante INT,
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
INSERT INTO fabricante VALUES(10, 'LG');

INSERT INTO producto VALUES(1, 'Disco duro SATA3 1TB', 86.99, 5);
INSERT INTO producto VALUES(2, 'Memoria RAM DDR4 8GB', 120, 6);
INSERT INTO producto VALUES(3, 'Disco SSD 1 TB', 150.99, 4);
INSERT INTO producto VALUES(4, 'GeForce GTX 1050Ti', 185, 7);
INSERT INTO producto VALUES(5, 'GeForce GTX 1080 Xtreme', 755, null);
INSERT INTO producto VALUES(6, 'Monitor 24 LED Full HD', 202, 1);
INSERT INTO producto VALUES(7, 'Monitor 27 LED Full HD', 245.99, 1);
INSERT INTO producto VALUES(8, 'Portátil Yoga 520', 559, 2);
INSERT INTO producto VALUES(9, 'Portátil Ideapd 320', 444, 2);
INSERT INTO producto VALUES(10, 'Impresora HP Deskjet 3720', 59.99, 3);
INSERT INTO producto VALUES(11, 'Impresora HP Laserjet Pro M26nw', 180, 3);

/*Practica para los ejercicios Tema 11*/
/*Vincular las tablas con las llaves que las relacionan*/
select producto.nombre, fabricante.nombre
from producto
join fabricante
on producto.id_fabricante = fabricante.id;

/*Cruzar las tablas con un título*/
select producto.nombre nombreProd,
producto.precio, fabricante.nombre nombreFrab
from producto
join fabricante
on producto.id_fabricante = fabricante.id;

/*Apartado 2. T11- hay diferentes posiciones por si queremos que muestre los null para el join (Interno= inner join)(Externa= leftJoin rigth join fullouter join)*/
select producto.nombre nombreProd,
prodcto.precio, fabricante.nombre nombreFrab
from producto
rigth join fabricante
on producto.id_fabricante = fabricante.id;

/*Devolver el nombre de los productos junto al nombre de fabricante*/
select producto.nombre nombreProd, fabricante.nombre nombreFrab
from producto
join fabricante
on producto.id_fabricante = fabricante.id;

/*Devolver el nombre de todos los prodcutos y el nombre del fabricante, exista o no*/
select producto.nombre nombreProd, fabricante.nombre nombreFrab
from producto
left join fabricante
on producto.id_fabricante = fabricante.id;

/*Devolver el nombre de todos los productos y fabricantes que hay en las tablas*/
select producto.nombre nombreProd, fabricante.nombre nombreFrab
from producto
full outer join fabricante
on producto.id_fabricante = fabricante.id;

/*prueba de restricciones*/
select *
from employees
where first_name
in(select first_name from employees where salary > 60000);

/*prueba 1 del where con variables*/
select *
from producto
where precio >=
ALL(select max(precio) from producto);

/*prueba 2 del where con variables*/
select *
from producto
where precio >=
(select min(salary/100) from employees);

/*Todos los precios menos el menor precio*/
select *
from producto
where precio >=
ANY (select precio from producto);

/*Ninguno menos el mayor precio*/
select *
from producto
where precio >=
ALL (select precio from producto);

/*Devuelve el precio más bajo*/
select *
from producto
where precio <=
ALL (select precio from producto);

/*Ejercicios*/
/*Devolver el precio más alto*/
select *
from producto
where precio >=
ALL (select precio from producto);

/*Devolver los productos más caros que el producto más barato de Asus*/
select *
from producto
where precio >
(select min(precio) from producto where id_fabricante=1);

/*Forma 2*/
/*Devolver los productos más caros que el producto más barato de Asus*/
select *
from producto
where precio >
(select min(precio) from producto where id_fabricante=
(select id from fabricante where nombre = 'Asus'));

/*Devolver el nombre e id del fabricante con el precio medio más alto*/
select nombre, id
from fabricante
where id = (select id_fabricante
from producto
group by id_fabricante
having avg(precio)
<= ALL(select avg(precio) from producto group by d_fabricante));

select nombre,id
from fabricante
where id=(select id_fabricante
from producto
group by id_fabricante
having avg(precio)
>= ALL(select avg(precio) group by id_fabricante having id_fabricante));

/*Devolver el nombre y el precio de lso productos que tengan un "id_fabricante" que exista en la tabla "Fabricante"*/
select id, nombre, precio
from producto
where
exists(select id from fabricante);

/*Tema 11*/
/*Uniones entre tablas y campos en una misma consulta*/
select * from producto where precio > 205
UNION
select * from producto where id_fabricante = 1;

/*Ejercicios repaso*/
/*Ejercicio 1*/
select avg(precio) from producto
group by id_fabricante;

/*Ejercicio 2*/
select id_fabricante from producto
group by id_fabricante having avg(precio)>= 1;

/*Ejercicio 3*/
select id,nombre from fabricante
where id=2;

/*Tema 11. Practica 2*/
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

/*1. Que devuelva todos los datos de los empleados pero el nombre del departamento en lugar de su id.*/
select employees.employee_number, employees.last_name,
employees.first_name, employees.salary,
department.name Departamento
from employees
join department
on employees.dept_id = department.id;

/*2. Que devuelva el nombre de todos los empleados y el nombre de su departamento, exista o no.*/
select employees.first_name, employees.last_name,
department.name Departamento
from employees
left join department
on employees.dept_id = department.id;

/*3. Que devuelva el nombre de todos los empleados y departamentos que hay en las tablas. El resultado en dos columnas y emparejando los que tengan relación.*/
select employees.first_name, employees.last_name,
department.name Departamento
from employees
full outer join department
on employees.dept_id = department.id;

/*4. Que devuelva todos los datos del empleado con el salario más alto.*/
select *
from employees
where salary <
(select max(salary) from employees);

/*5. Que devuelva los datos de los empleados y el nombre del departamento de los empleados que cobren más que el empleado peor pagado del departamento “Superheroes”.*/
select employees.*, 
department.name Departamento
from employees
join department
on employees.dept_id = department.id
where salary >
(select min(salary) from employees where department.id= 
(select department.id from department where department.name = 'Superheroes'));

/*6. Que devuelva el nombre e identificador del departamento con peor salario medio.*/
select name, id
from department
where id = (select id
from employees
group by id
having avg (salary)
>= all(select avg(salary) from employees group by id));


/*7. Que devuelva, en la misma columna, un listado con los nombres de los empleados y, a continuación, los nombres de todos los departamentos.*/
select employees.employee_number || ' ' || employees.last_name || ' ' || department.name empleados_departamentos
from employees
join department
on employees.dept_id = department.id;

/*TEMA */
/*Insertar filas con campos*/
insert into fabricante values (11, 'Amazon');

/*insertar filas con más campos*/
insert into producto values (12, 'Alexa Echo Dot', 69.99, 11);

/*Actualizar un campo de la tabla*/
update fabricante set nombre = 'AMZN' where id = 11;

/*Borrar datos de un campo de la tabla*/
delete from producto where id = 12;

/*Actualiar varias filas con variables*/
update producto
set precio = precio * 2
where id_fabricante = 
    (select id from fabricante where nombre = 'Asus');

/*Practica*/
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

/*Actividades Tema 12 - Parte 2*/
/*1. Inserta un nuevo departamento llamado SciFi.*/
insert into department values (504, 'SciFi');

/*2. Modifica el empleado 1005 y asocialo al departamento “SciFi”.*/
update employees set dept_id = 504 where employee_number = 1005;

/*3. Inserta un nuevo empleado con tu nombre y apellidos. El resto de datos pueden ser los que sean.*/
insert into employees values (1006, 'Albarracin Martin', 'Marta', null, null);

/*4. Borra el nuevo empleado creado con tu nombre y apellidos.*/
delete from employees where employee_number = 1006;

/*5. Inserta un nuevo empleado con los siguientes datos:
    - Nombre: Samsagaz 
    - Apellido: Gamyi
    - Número de empleado: Buscar el número de empleado más alto y sumar 1.
    - Salario: La mitad de lo que cobra el usuario llamado ‘Frodo’.
    - Departamento: ‘Fantasy’
    * Todos los campos necesarios deberán ser consultados mediante sentencias SELECT y no mirando a mano en las tablas.*/
insert into employees values (
    (select max(employee_number) from employees)+1,
    'Gamyi', 'Samsagaz',
    ((select salary from employees where first_name = 'Frodo')/2 ),
    (select id from department where name = 'Fantasy'));
    
    
/*Actividades propuestas*/
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

/*Ejercicio 1*/
SELECT * FROM fabricante;

/*Ejercicio 2*/
SELECT nombre FROM producto;

/*Ejercicio 3*/
SELECT nombre || ' '|| precio || '€'
FROM producto;

/*Ejercicio 4*/
SELECT nombre || ' '|| precio || '€' Descripcion
FROM producto;

/*Ejercicio 5*/
SELECT *
FROM producto
WHERE precio >= 100;

/*Ejercicio 6*/
SELECT producto.*, fabricante.nombre
FROM producto
JOIN fabricante
on producto.id_fabricante = fabricante.id 
where fabricante.nombre = 'Asus';

/*Ejercicio 7*/
SELECT *
FROM producto
ORDER BY id_fabricante ASC;

/*Ejercicio 8*/
SELECT *
FROM producto
ORDER BY id_fabricante DESC;

/*Ejercicio 9*/
SELECT id_fabricante, AVG(precio) Media
FROM producto
group by id_fabricante;

/*Ejercicio 10*/
SELECT id_fabricante, SUM(precio) SUMA
FROM producto
group by id_fabricante;

/*Ejercicio 11*/
SELECT id_fabricante, AVG(precio) Media
FROM producto
WHERE id_fabricante =
    (select id from fabricante where nombre = 'Lenovo')
group by id_fabricante;

/*Ejercicio 12*/
SELECT *
FROM producto
WHERE id_fabricante = &idFabricante;

/*Ejercicio 13*/
SELECT id, nombre 
FROM fabricante
WHERE nombre IN ('Asus', 'LG', 'Crucial');

/*Ejercicio 14*/
SELECT nombre, precio,
(precio-precio*0.2) Precio_Rebajado
FROM producto;

/*Ejercicio 15*/
SELECT producto.nombre || ' - ' || precio || ' - ' || fabricante.nombre Nombre_Precio_Fabricante
from producto
join fabricante
on producto.id_fabricante = fabricante.id;

/*Entrega Final Segundo Trimestre*/
DROP TABLE employees;
DROP TABLE department;


/*Ejercicio 1*/
CREATE TABLE VideoGames
( id int PRIMARY KEY,
  description VARCHAR(50) NOT NULL,
  price VARCHAR(50) NOT NULL,
  category int,
  score number,
  year int
);

/*Ejercicio 2*/
CREATE TABLE categories
( id int PRIMARY KEY,
  category_name VARCHAR(50) NOT NULL
);

/*Ejercicio 3*/
DROP TABLE VideoGames;
CREATE TABLE VideoGames
( id int PRIMARY KEY,
  description VARCHAR(50) NOT NULL,
  price VARCHAR(50) NOT NULL,
  category int,
  score number,
  year int,
  CONSTRAINT VideoGames
  FOREIGN KEY (category) REFERENCES categories(id)
);

/*Ejercicio 4*/
INSERT INTO categories VALUES (501, 'Survival');
INSERT INTO categories VALUES (502, 'Action RPG');
INSERT INTO categories VALUES (503, 'Shooter');
INSERT INTO categories VALUES (504, 'RPG');
INSERT INTO categories VALUES (505, 'Metroidvania');

/*Ejercicio 5*/
INSERT INTO VideoGames VALUES (1001, 'The Callisto Protocol', 49.99, 501, 70, 2022);
INSERT INTO VideoGames VALUES (1002, 'Cyberpunk 2077', 20.00, 502, 86, 2020);
INSERT INTO VideoGames VALUES (1003, 'Valorant ', 19.99, 503, 80, 2020);
INSERT INTO VideoGames VALUES (1004, 'Final Fantasy 7', 93.95, 504, 92, 1997);
INSERT INTO VideoGames VALUES (1005, 'Metroid Prime', 35.00, 503, 97, 2002);
INSERT INTO VideoGames VALUES (1006, 'Ori and the Blind Forest', 34.99, 505, 88, 2015);

/*Ejercicio 6*/
INSERT INTO VideoGames VALUES (
(SELECT max(id)+1 FROM VideoGames), 'Minecraft', 
(SELECT max(price)*2 FROM VideoGames), 
(SELECT category FROM VideoGames WHERE category = 
(SELECT id FROM categories WHERE category_name='Survival')),
98,
2013);

/*Ejercicio 7*/
SELECT id, description, price || '€', category, score, year
FROM VideoGames;

/*Ejercicio 8*/
SELECT *
FROM categories
ORDER BY category_name;

/*Ejercicio 9*/
SELECT *
FROM VideoGames
WHERE category = 503
AND price > 20;

/*Ejercicio 10*/
SELECT category,
AVG(price) Average
FROM VideoGames
group by category;

/*Ejercicio 11*/
SELECT *
FROM VideoGames
WHERE price = (SELECT min(price)
FROM VideoGames);

/*Ejercicio 12*/
SELECT VideoGames.*, categories.category_name
FROM VideoGames
JOIN categories
on VideoGames.category = categories.id;

/*Ejercicio 13*/
SELECT categories.id, category_name
FROM categories
WHERE categories.id = ANY
(SELECT category FROM VideoGames 
GROUP BY category HAVING COUNT(category) 
>= ALL (SELECT COUNT(category)
FROM VideoGames 
GROUP BY category));

/*Ejercicio 14*/
SELECT categories.id, category_name
FROM categories
JOIN VideoGames 
ON categories.id = VideoGames.category
WHERE price =
(SELECT price FROM VideoGames 
GROUP BY price HAVING AVG(price) 
<= ALL (SELECT AVG(price)
FROM VideoGames 
GROUP BY price));