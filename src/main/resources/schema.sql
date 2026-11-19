
CREATE DATABASE IF NOT EXISTS rpms;

USE rpms;

CREATE TABLE students (
    student_id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(15)
);

CREATE TABLE companies (
    company_id INT PRIMARY KEY AUTO_INCREMENT,
    company_name VARCHAR(100),
    location VARCHAR(100)
);

CREATE TABLE offers (
    offer_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    company_id INT,
    package DECIMAL(10,2)
);

CREATE TABLE interviews (
    interview_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    company_id INT,
    interview_date DATE
);

CREATE TABLE placements (
    placement_id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    company_id INT,
    status VARCHAR(50)
);
