CREATE TABLE department
(       dep_num SERIAL,--to employee dep
        dep_name varchar(64) NOT NULL,
        num_of_employees int NOT NULL,
        
        CONSTRAINT department_number PRIMARY KEY(dep_num)
        );
CREATE TABLE employee
(       employee_number SERIAL,-- to ass table
        last_name varchar(64) NOT NULL,
        first_name varchar(64) NOT NULL,
        gender varchar(64) NULL,
        DOB date NOT NULL,
        --HAVN"T BEEN HIRED YET
        DOH date NULL,
        department int NULL,--receive dep num
        
        CONSTRAINT pk_employee_num PRIMARY KEY (employee_number),
        CONSTRAINT fk_department_from_dep_num FOREIGN KEY (department) REFERENCES department(dep_num)
        );
CREATE TABLE project
(       project_num SERIAL,--to ass table
        name varchar (64) NOT NULL,
        start_date date NULL,
        employee_on_project int NULL,
        
        CONSTRAINT pk_project_num_to_associative PRIMARY KEY (project_num)
        );
CREATE TABLE project_employee_ass_table--associative table
(       project_num int NOT NULL,--recieve
        employee_number int NOT NULL,--recieve
        --give both back to count employees
        
        CONSTRAINT project_num FOREIGN KEY (project_num) REFERENCES project(project_num),
        CONSTRAINT employee_number FOREIGN KEY (employee_number) REFERENCES employee(employee_number),
        CONSTRAINT employee_project_count PRIMARY KEY (project_num, employee_number) 
        );
INSERT INTO department(dep_name, num_of_employees)
VALUES('Engineering',(SELECT COUNT (employee_number) FROM employee WHERE department = 1)),
('Sales',(SELECT COUNT (employee_number) FROM employee WHERE department = 2)),
('Operations',(SELECT COUNT (employee_number) FROM employee WHERE department = 3));

INSERT INTO employee(last_name, first_name, gender, DOB, DOH, department)
VALUES('Baskin','Carol','Non-Binary','1953-12-25','2020-02-15',1),
('Kinnard','Austin','Male','1995-06-01','2020-5-03',1),
('Bacon','Kevin','Male','1856-08-24','2019-03-25',1),
('Clifton','Rachel','Female','1990-05-14','2021-02-15',1),
('Brown','Zac','Male','1985-04-20','1990-05-06',2),
('Sparks','Bubba','Male','1705-05-21','1999-02-13',2),
('Bodo','Alex','Male','1952-12-02','2005-05-07',3),
('Kinnard','Nicole','Female','1996-03-14','2012-02-12',3);

INSERT INTO project (name,start_date)
VALUES('Nike','2021-02-15'),
('UnderArmor','2020-05-12'),
('Nerf','1995-05-20'),
('Acer','2015-07-16');



INSERT INTO project_employee_ass_table
VALUES (1,1),(1,2),(1,3),(2,4),(2,5),(3,6),(4,7),(4,8);

UPDATE project
SET employee_on_project = (SELECT COUNT(employee_number) FROM project_employee_ass_table WHERE project_num=1 GROUP BY project_num)
WHERE project_num = 1;

UPDATE project
SET employee_on_project = (SELECT COUNT(employee_number) FROM project_employee_ass_table WHERE project_num=2 GROUP BY project_num)
WHERE project_num = 2;

UPDATE project
SET employee_on_project = (SELECT COUNT(employee_number) FROM project_employee_ass_table WHERE project_num=3 GROUP BY project_num)
WHERE project_num = 3;

UPDATE project
SET employee_on_project = (SELECT COUNT(employee_number) FROM project_employee_ass_table WHERE project_num=4 GROUP BY project_num)
WHERE project_num = 4;

UPDATE department
SET num_of_employees = (SELECT COUNT (employee_number) FROM employee WHERE department = 1)
WHERE dep_num = 1;

UPDATE department
SET num_of_employees = (SELECT COUNT (employee_number) FROM employee WHERE department = 2)
WHERE dep_num = 2;

UPDATE department
SET num_of_employees = (SELECT COUNT (employee_number) FROM employee WHERE department = 3)
WHERE dep_num = 3;