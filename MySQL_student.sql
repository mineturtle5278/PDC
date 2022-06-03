create database student;
use student;

create table student(
id int auto_increment primary key,
name varchar(20),
math float,
physic float,
english float,
average float,
overall float
);

describe student;

insert into student(id,name,math,physic,english,average,overall)values('18041967','Zac',100,100,100,100,400);
