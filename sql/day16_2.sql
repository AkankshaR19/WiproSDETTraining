CREATE DATABASE EcommerceWeb;

USE EcommerceWeb;

CREATE TABLE Customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100),
    city VARCHAR(50)
);
select * from Customers;
CREATE TABLE Products (
    product_id INT PRIMARY KEY,
    product_name VARCHAR(100),
    price DECIMAL(10,2)
);
select * from Products;
CREATE TABLE Orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    product_id INT,
    order_date DATE
);
select * from Orders;
CREATE TABLE Payments (
    payment_id INT PRIMARY KEY,
    order_id INT,
    payment_method VARCHAR(50),
    amount DECIMAL(10,2)
);
select * from Payments;
INSERT INTO Customers VALUES
(1, 'Akanksha', 'Bhubaneswar'),
(2, 'Rahul', 'Delhi'),
(3, 'Priya', 'Mumbai');

INSERT INTO Products VALUES
(101, 'Laptop', 55000),
(102, 'Phone', 25000),
(103, 'Headphones', 3000);

INSERT INTO Orders VALUES
(1001, 1, 101, '2025-05-10'),
(1002, 2, 102, '2025-05-11'),
(1003, 1, 103, '2025-05-12');

INSERT INTO Payments VALUES
(501, 1001, 'UPI', 55000),
(502, 1002, 'Card', 25000),
(503, 1003, 'Cash', 3000);

-- INNER JOIN
-- Display customer names with their orders
SELECT Customers.customer_name,
       Orders.order_id,
       Orders.order_date
FROM Customers
INNER JOIN Orders
ON Customers.customer_id = Orders.customer_id;

-- LEFT JOIN
-- Display all customers including those without orders
SELECT Customers.customer_name,
       Orders.order_id
FROM Customers
LEFT JOIN Orders
ON Customers.customer_id = Orders.customer_id;

-- RIGHT JOIN
-- Display all payments with their related orders
SELECT Orders.order_id,
       Payments.payment_method,
       Payments.amount
FROM Orders
RIGHT JOIN Payments
ON Orders.order_id = Payments.order_id;

-- JOIN Orders and Products
-- Display ordered product details
SELECT Orders.order_id,
       Products.product_name,
       Products.price
FROM Orders
INNER JOIN Products
ON Orders.product_id = Products.product_id;

-- FULL OUTER JOIN
-- Display all customers and all orders
SELECT Customers.customer_name,
       Orders.order_id
FROM Customers
LEFT JOIN Orders
ON Customers.customer_id = Orders.customer_id
UNION
SELECT Customers.customer_name,
       Orders.order_id
FROM Customers
RIGHT JOIN Orders
ON Customers.customer_id = Orders.customer_id;

