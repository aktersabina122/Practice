use sqlpractice;

select * from Dept;

select * from Emp;

select * from Dept NATURAL JOIN EMP;

select * from Dept, emp
WHERE Dept.Deptno=Emp.Deptno;

select * from Dept INNER JOIN EMP
ON Dept.Deptno=Emp.Deptno

select * from Dept LEFT JOIN EMP
ON Dept.Deptno=Emp.Deptno

select * from Dept Cross Join Emp;

select max(sal) from Emp;


select ename from emp where sal=max(sal);

select ename from emp where sal=(select max(sal) from Emp)

select max(sal) from Emp where sal < (select max(sal) from Emp);

select ename from emp where sal=(
select max(sal) from Emp where sal < (select max(sal) from Emp))

For every INNER Query, the outer Query needs to be executed, 
then it is called Correlated SubQuery.

