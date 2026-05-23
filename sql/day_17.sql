create database Day17;
use Day17;

CREATE TABLE Employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    department VARCHAR(50),
    salary DOUBLE
);

DELIMITER //

CREATE PROCEDURE SearchEmployee(IN eid INT)
BEGIN
    SELECT * FROM Employee WHERE emp_id = eid;
END //

DELIMITER ;


CREATE TABLE Users (
    user_id INT PRIMARY KEY,
    username VARCHAR(50),
    password VARCHAR(50)
);
INSERT INTO Users VALUES
(1, 'admin', 'admin123'),
(2, 'akanksha', 'test123'),
(3, 'user1', 'pass123');
