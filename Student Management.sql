

create table studentInfo(
student_id int auto_increment primary key,
stu_name varchar(20),
math float,
physic float,
english float,
average float,
overall float
);

describe studentInfo;

insert into studentInfo(student_id,stu_name,math,physic,english,average,overall)values('18041967','Zac',100,100,100,100,400);