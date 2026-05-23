Create database Employees;
Show databases;
Select database();
use Employees;

Create table Employee(
emp_id INT primary KEY,
emp_name varchar (80),
department varchar(100),
salary decimal (10, 2),
email varchar(200),
joining_date date
);

INSERT INTO Employee(emp_id, emp_name, department, salary, email, joining_date)
VALUES
(101, 'Akshat', 'IT', 40000, 'akshatit@gmail.com', '2026-06-22'),
(102, 'Amyra', 'IT', 40000, 'amyrait@gmail.com', '2026-06-22'),
(103, 'Aman', 'IT', 40000, 'amanit@gmail.com', '2026-06-22'),
(104, 'Aksh', 'IT', 40000, 'akshit@gmail.com', '2026-06-22'),
(105, 'Arushi', 'IT', 40000, 'arushiit@gmail.com', '2026-06-22'),
(106, 'Rahul', 'HR', 30000, 'rahulhr@gmail.com', '2026-06-22'),
(107, 'Raj', 'HR', 30000, 'rajhr@gmail.com', '2026-06-22'),
(108, 'Rashmi', 'Testing', 35000, 'rashmitest@gmail.com', '2026-06-22');

select * from Employee;
-- 1. Fetch all employees from the IT department
select * from Employee
WHERE department ='IT';

-- 2. Update salary for employees in the Testing department
update Employee
set salary= salary +5000
where emp_id>0
and department = 'Testing';

-- 3. Delete an employee who resigned from the company
delete from Employee
where emp_id=104;

-- 4. Display employees sorted by highest salary
select * from Employee
order by salary desc;

-- 5. Fetch the top 2 highest-paid employees
select * from Employee
order by salary desc
limit 2;

-- 6. Count total employees in the Employees table
select count(*) as total_employees
from Employee;

-- 7. Calculate average salary of employees
SELECT AVG(salary) AS average_salary
FROM Employee;

-- 8. Find highest and lowest salary in the company
SELECT 
MAX(salary) AS highest_salary,
MIN(salary) AS lowest_salary
FROM Employee;

-- 9. Count employees department-wise using GROUP BY
SELECT department, COUNT(*) AS employee_count
FROM Employee
GROUP BY department;

-- 10. Display departments having more than one employee using HAVING
SELECT department, COUNT(*) AS employee_count
FROM Employee
GROUP BY department
HAVING COUNT(*) > 1;

-- 11. Find employees whose email IDs are NULL
SELECT * FROM Employee
WHERE email IS NULL;

-- 12. Fetch employees whose names start with the letter 'R'
SELECT * FROM Employee
WHERE emp_name LIKE 'R%';

-- 13. Find employees whose salary is between 40000 and 60000
SELECT * FROM Employee
WHERE salary BETWEEN 40000 AND 60000;

-- 14. Fetch employees belonging to HR and IT departments
SELECT * FROM Employee
WHERE department IN ('HR', 'IT');

-- 15. Add a new column mobile_number to the Employees table
ALTER TABLE Employee
ADD mobile_number VARCHAR(15);

-- 16. Rename column emp_name to employee_name
ALTER TABLE Employee
RENAME COLUMN emp_name TO employee_name;

-- 17. Remove mobile_number column from Employees table
ALTER TABLE Employee
DROP COLUMN mobile_number;

-- 18. Delete all records from Employees table using TRUNCATE
TRUNCATE TABLE Employee;

-- 19. Permanently delete Employees table
DROP TABLE Employee;

-- 20. Fetch employee names along with department names using JOIN
-- Creating Department table example
SELECT e.emp_name, d.department_name
FROM Employee e
JOIN Department d
ON e.department = d.department_id;

-- 21. Find employees earning more than average salary using subquery
SELECT * FROM Employee
WHERE salary > (
    SELECT AVG(salary)
    FROM Employee
);

-- 22. Find duplicate email records in Employees table
SELECT email, COUNT(*) AS duplicate_count
FROM Employee
GROUP BY email
HAVING COUNT(*) > 1;

-- 23. Verify employee data inserted successfully after API execution
SELECT * FROM Employee;

-- 24. Delete employees having NULL email IDs
DELETE FROM Employee
WHERE emp_id > 0
AND email IS NULL;

-- 25. Create backup of Employees table
CREATE TABLE Employee_Backup AS
SELECT * FROM Employee;

--------------
-- P1: Active users without login
CREATE DATABASE CompanyDB;
USE CompanyDB;
CREATE TABLE users (
    user_id INT PRIMARY KEY,
    username VARCHAR(100),
    email VARCHAR(150),
    status VARCHAR(20),
    last_login DATE
);
INSERT INTO users VALUES
(1, 'Rahul', 'rahul@gmail.com', 'ACTIVE', NULL),
(2, 'Riya', 'riya@gmail.com', 'ACTIVE', '2026-01-10'),
(3, 'Rohan', 'rohan@gmail.com', 'INACTIVE', NULL);

SELECT username, email
FROM users
WHERE status = 'ACTIVE'
AND last_login IS NULL;

-- P2: High Value Customer
CREATE TABLE customers (
    customer_id INT PRIMARY KEY,
    customer_name VARCHAR(100)
);
CREATE TABLE orders (
    order_id INT PRIMARY KEY,
    customer_id INT,
    order_amount DECIMAL(10,2)
);
INSERT INTO customers VALUES
(1, 'Akash'),
(2, 'Priya'),
(3, 'Rohit');

INSERT INTO orders VALUES
(101, 1, 30000),
(102, 1, 25000),
(103, 2, 15000),
(104, 3, 60000);
SELECT c.customer_name, SUM(o.order_amount) AS total_purchase
FROM customers c
JOIN orders o
ON c.customer_id = o.customer_id
GROUP BY c.customer_name
HAVING SUM(o.order_amount) > 50000;

-- P3: Salary Audit Report
use Employees;
INSERT INTO employee VALUES
(109, 'Sneha', 'HR', 30000, 'snehahr@gmail.com', '2026-06-22'),
(110, 'Karan', 'IT', 60000, 'karanit@gmail.com', '2026-06-22'),
(111, 'Priya', 'HR', 50000, 'priyahr@gmail.com', '2026-06-22'),
(112, 'Riya', 'Testing', 70000, 'riyahr@gmail.com', '2026-06-22');
SELECT employee_name, salary
FROM employee
WHERE salary > (
    SELECT AVG(salary)
    FROM employee
)
ORDER BY salary DESC
LIMIT 3;

-- P4: Department wise employee count
SELECT department, COUNT(*) AS employee_count
FROM employee
GROUP BY department
HAVING COUNT(*) > 4;

-- P5: Orders without customers
use CompanyDB;
SELECT o.order_id
FROM orders o
LEFT JOIN customers c
ON o.customer_id = c.customer_id
WHERE c.customer_id IS NULL;

-- P6: Recently joined employees
use Employees;
SELECT *
FROM employee
WHERE YEAR(joining_date) = 2024
ORDER BY joining_date DESC
LIMIT 5;

-- P7: Duplicate Email Detection
use CompanyDB;
SELECT email, COUNT(*) AS duplicate_count
FROM users
GROUP BY email
HAVING COUNT(*) > 1;




