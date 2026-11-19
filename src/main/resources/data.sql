
USE rpms;

INSERT INTO students (name, email, phone)
VALUES ('Rahul Patil', 'rahul@gmail.com', '9876543210');

INSERT INTO companies (company_name, location)
VALUES ('TCS', 'Pune');

INSERT INTO offers (student_id, company_id, package)
VALUES (1, 1, 450000);

INSERT INTO interviews (student_id, company_id, interview_date)
VALUES (1, 1, '2026-12-01');

INSERT INTO placements (student_id, company_id, status)
VALUES (1, 1, 'Selected');
