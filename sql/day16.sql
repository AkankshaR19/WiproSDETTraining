create database Day16;
use Day16;
Create table Employees(
emp_id int,
emp_name varchar(50),
dept_id int,
salary int
);

Create table Departments(
dept_id int,
dept_name varchar(50)
);
select * from Employees;



DELETE FROM Employees
WHERE emp_id = 4
LIMIT 1;
select * from Departments;

insert into Employees values
(1, 'Vinay', 101, 50000),
(2, 'Sonali', 102, 60000),
(3, 'Radha', 103, 55000),
(4, 'Renu', 104, 40000);

insert into Departments values
(101, 'HR'),
(102, 'IT'),
(103, 'Finance');

select e.emp_name, d.dept_name
from employees e
inner join departments d
on e.dept_id=d.dept_id;

select e.emp_name, d.dept_name
from employees e
left join departments d
on e.dept_id=d.dept_id;

select e.emp_name, d.dept_name
from employees e
right join departments d
on e.dept_id=d.dept_id;

select e.emp_name, d.dept_name
from employees e
full outer join departments d
on e.dept_id=d.dept_id;

create table EmployeeManager
(
emp_id int,
emp_name varchar(50),
manager_id int
);

insert into EmployeeManager values
(1, 'Vinay', NULL),
(2, 'Sonali', 1),
(3, 'Radha', 1);

select 
e.emp_name as Employees,
m.emp_name as Manager
from EmployeeManager e
LEFT join EmployeeManager e
on e.manager_id=m.emp_id;

