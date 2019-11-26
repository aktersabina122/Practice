-- string functionas

-- Instr() : displays the first occurrence of given char

select instr('hello','l');

-- length() : Displays total no.of chars

select length('hello');

-- reverse() : Displays in reverse order

select reverse('hello');

-- Lower() : Displays in lower case

select lower('Hello');

-- upper() : Displays in upper case

select upper('hello');

-- substr() : displays part of string, as in that from 3rd char it prints 
-- 5 chars

select substr('welcome to sql',3,5);

-- replace() : Replaces the old value with new value in all occurrences

select replace('java training','java','sql')

