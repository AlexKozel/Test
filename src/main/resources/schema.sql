CREATE SEQUENCE IF NOT EXISTS employee_id_seq;

CREATE TABLE IF NOT EXISTS employee(
    employee_id int NOT NULL DEFAULT nextval('employee_id_seq'::regclass),
    first_name varchar(40) NOT NULL ,
    last_name varchar(40) NOT NULL ,
    department_id integer ,
    job_title varchar(200) ,
    gender smallint NOT NULL ,
    date_of_birth date NOT NULL,
    PRIMARY KEY (employee_id)
);