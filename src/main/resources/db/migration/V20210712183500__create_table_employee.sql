DROP TABLE IF EXISTS employee;

CREATE TABLE employee
(
employee_id INT PRIMARY KEY NOT NULL,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
email VARCHAR(250) NOT NULL,
phone_number VARCHAR(9),
hire_date DATE,
salary NUMERIC(7, 2) CHECK(salary >= 1.0),
department_id INT NOT NULL
);