DROP DATABASE IF EXISTS BANK_DB;
CREATE DATABASE BANK_DB;
USE BANK_DB;
CREATE TABLE Client(
    nid INT(11) PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(127) UNIQUE,
    country VARCHAR(64)
);

CREATE TABLE Account(
    id INT PRIMARY KEY AUTO_INCREMENT,
    nid INT(11),
    balance DOUBLE,
    FOREIGN KEY (nid) REFERENCES Client(nid)
);

-- Insert clients
INSERT INTO Client (nid, name, email, country)
VALUES (23890429, 'Edu Martorell Ortuño', 'edu.maor@gmail.com', 'SPAIN'),
       (123456789, 'John Smith', 'john.smith@example.com', 'FRANCE'),
       (234567890, 'Jane Doe', 'jane.doe@example.com', 'SPAIN'),
       (345678901, 'Bob Johnson', 'bob.johnson@example.com', 'ITALY');

-- Insert accounts
INSERT INTO Account (nid, balance)
VALUES (23890429, 2003.1208),
       (123456789, 1000.58123),
       (123456789, 5034.326),
       (234567890, 20354.524),
       (345678901, 1500.235),
       (345678901, 2500.252);