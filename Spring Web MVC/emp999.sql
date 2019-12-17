use sqlpractice;

Create Table Emp99
(
	Id INT Primary key,
    Name varchar(30),
    Salary INT,
    Designation varchar(30)
);

insert into emp99 values(1,'bharath',66744,'Programmer'),
				(2,'Sai',65433,'Developer'),
                (3,'Manoj',66433,'Architect'),
                (4,'Naren',67222,'Expert')
                
select * from Emp99;                