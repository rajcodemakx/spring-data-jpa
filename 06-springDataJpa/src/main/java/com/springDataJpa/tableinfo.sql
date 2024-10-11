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

select * from student;
 student_id | age | guardian_email_address | guardian_mobile_number | guardian_name | student_email_address | student_mobile_number | student_name
------------+-----+------------------------+------------------------+---------------+-----------------------+-----------------------+--------------
          1 |  18 | john@gmail.com         | 9876543210             | john          | kumar@gmail.com       | 1234567890            | kumar
          2 |  20 | alice@gmail.com        | 9876543211             | alice         | anitha@gmail.com      | 1234567891            | anitha
          3 |  21 | robert@gmail.com       | 9876543212             | robert        | ravi@gmail.com        | 1234567892            | ravi
          4 |  19 | carol@gmail.com        | 9876543213             | carol         | priya@gmail.com       | 1234567893            | priya
          5 |  22 | david@gmail.com        | 9876543214             | david         | raj@gmail.com         | 1234567894            | raj
          6 |  20 | emma@gmail.com         | 9876543215             | emma          | meena@gmail.com       | 1234567895            | meena
          7 |  19 | frank@gmail.com        | 9876543216             | frank         | vijay@gmail.com       | 1234567896            | vijay
          8 |  21 | grace@gmail.com        | 9876543217             | grace         | sunitha@gmail.com     | 1234567897            | sunitha
          9 |  23 | henry@gmail.com        | 9876543218             | henry         | arjun@gmail.com       | 1234567898            | arjun
         10 |  18 | irene@gmail.com        | 9876543219             | irene         | deepa@gmail.com       | 1234567899            | deepa
         11 |  22 | jack@gmail.com         | 9876543220             | jack          | manoj@gmail.com       | 1234567800            | manoj
         12 |  19 | karen@gmail.com        | 9876543221             | karen         | shreya@gmail.com      | 1234567801            | shreya
         13 |  20 | leo@gmail.com          | 9876543222             | leo           | akash@gmail.com       | 1234567802            | akash
         14 |  21 | maria@gmail.com        | 9876543223             | maria         | reena@gmail.com       | 1234567803            | reena
         15 |  23 | nathan@gmail.com       | 9876543224             | nathan        | vinay@gmail.com       | 1234567804            | vinay
         16 |  20 | oliver@gmail.com       | 9876543225             | oliver        | lavanya@gmail.com     | 1234567805            | lavanya
         17 |  18 | peter@gmail.com        | 9876543226             | peter         | ajay@gmail.com        | 1234567806            | ajay
         18 |  19 | quinn@gmail.com        | 9876543227             | quinn         | radhika@gmail.com     | 1234567807            | radhika
         19 |  21 | richard@gmail.com      | 9876543228             | richard       | suresh@gmail.com      | 1234567808            | suresh
         20 |  22 | sarah@gmail.com        | 9876543229             | sarah         | tanya@gmail.com       | 1234567809            | tanya


public class Student {

    private Integer studentId; // student_id

    private String studentName;

    private Integer age;

    private String studentEmailId; // duplicate key

    private String studentMobileNumber; // duplicate key


    private Guardian guardian;

}


Two type custom queries
1. Find-By Methods
    //  select * from student where age =18;
    1. Iterator<Student>findByAge(18)

    // select * from student where age > 18;
    2. Iterator<Student> findByAgeGreaterThan(18)

    // select * from student where age > 18 and student_name = 'kumar';


2. Custom queries
    // @QUERES
 hql // select s1_0.student_id,s1_0.age,s1_0.guardian_email_address,s1_0.guardian_mobile_number,s1_0.guardian_name,s1_0.student_email_address,s1_0.student_mobile_number,s1_0.student_name from student s1_0 where s1_0.age>? and s1_0.student_name=?
NATIVE // select * from student where age > 18 and student_name = 'kumar';