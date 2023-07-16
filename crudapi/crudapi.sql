CREATE DATABASE crudapi;

USE crudapi;

CREATE TABLE tbl_employee
(
	id_persona INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255),
    apellido VARCHAR(255),
    edad VARCHAR(255),
    numero_cuenta INT,
);