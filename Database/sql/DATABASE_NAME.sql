CREATE TABLE Customers ( /*Crear una tabla*/
    ID int NOT NULL PRIMARY KEY,
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int
);

DROP TABLE Customers; /*Borrar una tabla*/

ALTER TABLE Customers DROP (FirstName); /* Quita una columna de la tabla */

ALTER TABLE Customers MODIFY (Age DEFAULT 0); /*Poner un valor default en los datos*/

ALTER TABLE Customers ADD (amount int  /*Añadir un nuevo campo en la tabla*/
CHECK (amount BETWEEN 0 AND 10000));
