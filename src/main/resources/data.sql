USE rpms;

INSERT INTO students
(id, name, email, department, cgpa, active_backlogs)
VALUES
(1, 'Rahul Patil', 'rahul@gmail.com', 'Computer Science', 8.5, 0);

INSERT INTO companies
(id, name, role, location, package_lpa, min_cgpa)
VALUES
(1, 'TCS', 'Software Developer', 'Pune', 4.5, 6.0);

INSERT INTO offers
(student_id, company_id, package_lpa, offer_date, status)
VALUES
(1, 1, 4.5, '2026-11-20', 'Active');

INSERT INTO interviews
(student_id, company_id, interview_date)
VALUES
(1, 1, '2026-12-01');

INSERT INTO placements
(student_id, company_id, placed_on)
VALUES
(1, 1, '2026-11-20');
