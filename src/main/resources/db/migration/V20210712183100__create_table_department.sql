DROP TABLE IF EXISTS department;

CREATE TABLE department
(
department_id INT PRIMARY KEY NOT NULL,
department_name VARCHAR(255) NOT NULL,
manager_id INT,
location VARCHAR(255)
);