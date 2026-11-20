CREATE DATABASE IF NOT EXISTS rpms;

USE rpms;

CREATE TABLE IF NOT EXISTS students (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    email VARCHAR(100),
    department VARCHAR(100),
    cgpa DOUBLE,
    active_backlogs INT
);

CREATE TABLE IF NOT EXISTS companies (
    id INT PRIMARY KEY,
    name VARCHAR(100),
    role VARCHAR(100),
    location VARCHAR(100),
    package_lpa DOUBLE,
    min_cgpa DOUBLE
);

CREATE TABLE IF NOT EXISTS offers (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    company_id INT,
    package_lpa DOUBLE,
    offer_date DATE,
    status VARCHAR(50),
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (company_id) REFERENCES companies(id)
);

CREATE TABLE IF NOT EXISTS interviews (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    company_id INT,
    interview_date DATE,
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (company_id) REFERENCES companies(id)
);

CREATE TABLE IF NOT EXISTS placements (
    id INT PRIMARY KEY AUTO_INCREMENT,
    student_id INT,
    company_id INT,
    status VARCHAR(50),
    FOREIGN KEY (student_id) REFERENCES students(id),
    FOREIGN KEY (company_id) REFERENCES companies(id)
);
