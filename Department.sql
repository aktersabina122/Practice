use sqlpractice;

drop table if exists department;

create table Department
(
  Deptno INT primary key,
  Dname varchar(30),
  Loc varchar(30),
  City varchar(30),
  Head varchar(30)
);

insert into Department 
values(1,'Sql','Electronic City','Bangalore',
'Srinivas');

commit;