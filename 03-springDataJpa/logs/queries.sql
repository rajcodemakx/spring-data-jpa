create table student (
    student_id integer not null,
    guardian_email_address varchar(255) not null,
    contact varchar(255) not null,
    guardian_name varchar(255),
    student_age integer,
    student_email_address varchar(255) not null,
    student_name varchar(255),
    primary key (student_id)
    )