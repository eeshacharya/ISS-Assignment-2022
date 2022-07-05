USE w3schools;
CREATE TABLE eesha;
SHOW TABLES;
DESCRIBE categories;
SELECT * FROM categories;
SELECT CustomerName, City FROM Customers;
SELECT Country FROM customers;											#without DISTINCT 
SELECT DISTINCT Country FROM customers;									#with DISTINCT 
SELECT * FROM Customers WHERE Country='UK';								#WHERE
SELECT * FROM Customers WHERE CustomerID=5;								#WHERE
SELECT * FROM Customers WHERE City LIKE 'G%';							#WHERE & LIKE
SELECT * FROM Products WHERE Price BETWEEN 40 AND 65;					#WHERE & BETWEEN
SELECT * FROM Customers WHERE City IN ('Paris','London');				#WHERE & IN
SELECT * FROM Customers WHERE Country NOT IN ('Germany', 'UK');			#WHERE & NOT IN
SELECT * FROM Customers WHERE Country='Germany' 
AND City='Berlin' OR Country='UK' AND NOT City='Cowes';					#AND, OR & NOT
SELECT * FROM customers WHERE City='Berlin' AND PostalCode=12209;		#AND
SELECT * FROM Customers ORDER BY City DESC;								#ORDER BY
SELECT * FROM Customers ORDER BY Country ASC, City DESC;				#ORDER BY multiple columns
INSERT INTO Customers (CustomerName, ContactName, Address, City, PostalCode, Country)
VALUES ('Eesha', 'Aashish', 'Skagen 21', 'Mumbai', '400059', 'India');	#INSERT INTO
SELECT * FROM Customers WHERE CustomerName='Eesha';
INSERT INTO Customers (CustomerName, City, Country)
VALUES ('Aashish', 'Jaipur', 'India');									#INSERT INTO
SELECT * FROM Customers WHERE CustomerName='Aashish';
UPDATE Customers														#UPDATE
SET ContactName = 'Alfred Schmidt', City= 'Frankfurt'
WHERE CustomerID = 1;
SELECT * FROM Customers;
DELETE FROM Customers WHERE CustomerID=94;								#DELETE
SELECT * FROM Customers WHERE CustomerID=94;
#SELECT TOP 3 * FROM Customers WHERE City='London';
SELECT * FROM Customers WHERE CustomerName LIKE '%ee_%';				#LIKE $& WILDCARDS
SELECT CustomerID AS ID, CustomerName AS Customer FROM Customers;		#ALIASES
SELECT ContactName AS "Contact Person" FROM Customers;					#ALIASES
SELECT CustomerName, 													#ALIASES
CONCAT_WS(', ', Address, PostalCode, City, Country) AS Address FROM Customers;
SELECT o.OrderID, o.OrderDate, c.CustomerName, o.CustomerID				#ALIASES
FROM Customers AS c, Orders AS o
WHERE c.CustomerName='Around the Horn' AND c.CustomerID=o.CustomerID;
SELECT CustomerName, Address + ', ' + PostalCode + ' ' + City + ', ' + Country AS Address
FROM Customers;
SELECT Orders.OrderID, Customers.CustomerName, Orders.OrderDate			#INNER JOIN
FROM Orders
INNER JOIN Customers ON Orders.CustomerID=Customers.CustomerID;

SELECT Customers.CustomerName, Orders.OrderID							#LEFT JOIN
FROM Customers
LEFT JOIN Orders ON Customers.CustomerID = Orders.CustomerID
ORDER BY Customers.CustomerName;

SELECT Orders.OrderID, Employees.LastName, Employees.FirstName			#RIGHT JOIN
FROM Orders
RIGHT JOIN Employees ON Orders.EmployeeID = Employees.EmployeeID
ORDER BY Orders.OrderID;

SELECT Customers.CustomerName, Orders.OrderID							#FULL JOIN
FROM Customers
FULL JOIN Orders ON Customers.CustomerID	=Orders.CustomerID
ORDER BY Customers.CustomerName;

SELECT City, Country FROM Customers										#UNION		
WHERE Country='UK'
UNION
SELECT City, Country FROM Suppliers
WHERE Country='UK'
ORDER BY City;

INSERT INTO Customers (CustomerName, City, Country)						#INSERT INTO
SELECT SupplierName, City, Country FROM Suppliers
WHERE Country='UK';

CREATE DATABASE eeshacharaya;											#CREATE DATABASE
show databases;

CREATE TABLE NewTable AS												#CREATE TABLE
SELECT customername, contactname
FROM customers;
SELECT * FROM NewTable;

CREATE TABLE Person (													#CONSTRAINTS
    Id int NOT NULL,													#NOT NULL
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
    Age int,
    PRIMARY KEY (Id)													#PRIMARY KEY
);
SELECT * FROM Person;

CREATE TABLE Orders (													#FOREIGN KEY
    OrderID int NOT NULL,
    OrderNumber int NOT NULL,
    PersonID int,
    PRIMARY KEY (OrderID),
    FOREIGN KEY (PersonID) REFERENCES Person(Id)
);
SELECT * FROM Orders;

CREATE TABLE Student (
    ID int NOT NULL AUTO_INCREMENT,										#AUTO_INCREMENT
    LastName varchar(255) NOT NULL,
    FirstName varchar(255),
	City varchar(255) DEFAULT 'Sandnes',								#DEFAULT
    Age int,
    CHECK (Age>=18),													#CHECK
    PRIMARY KEY(Id)
);
SELECT * FROM Student;

