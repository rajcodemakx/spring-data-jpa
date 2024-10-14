java application(database connection)  ->   (HQL QUERY) --> dialect -> Mysql,postgres,Oracles (rdbms)


 \d student
                              Table "public.student"
         Column         |          Type          | Collation | Nullable | Default
------------------------+------------------------+-----------+----------+---------
 student_id             | integer                |           | not null |
 age                    | integer                |           |          |
 guardian_email_address | character varying(255) |           | not null |
 guardian_mobile_number | character varying(255) |           | not null |
 guardian_name          | character varying(255) |           | not null |
 student_email_address  | character varying(255) |           | not null |
 student_mobile_number  | character varying(255) |           | not null |
 student_name           | character varying(255) |           |          |
Indexes:
    "student_pkey" PRIMARY KEY, btree (student_id)
    "guardian_unique" UNIQUE CONSTRAINT, btree (guardian_email_address, guardian_mobile_number)
    "student_unique" UNIQUE CONSTRAINT, btree (student_email_address, student_mobile_number)



Student(studentId=2,
age=20, guardianEmailAddress=alice@gmail.com, guardianMobileNumber=9876543211,
guardianName=alice, studentEmailAddress=anitha@gmail.com, studentMobileNumber=1234567891, studentName=anitha)

update student set guardianName = 'rahul', guardian_email_address='rahul@gmail.com' where student_id = 2;