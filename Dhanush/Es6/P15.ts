let str: string = 'Hello TypeScript';
console.log(str.charAt(2));

let str1: string = 'Hello';
let str2: string = 'TypeScript';
str1.concat(str2); // returns 'HelloTypeScript'
str1.concat(' ', str2); // returns 'Hello TypeScript'
console.log(str1.concat(' ',str2));
console.log(str1);

 let str3: string = 'TypeScript';

 let student:string='Himani';
 console.log(student.indexOf('i'));
 console.log(student.lastIndexOf('i'));
 let students:string="Himani, Preethi, Kulkarni, Shravya";
 console.log(students.split(','));
 let name1="HimanI";
 console.log(name1.toUpperCase());
 let name2="HimanI";
 console.log(name2.toLowerCase());
//str3.indexOf('T'); // returns 0
//str3.indexOf('p'); // returns 2
//str3.indexOf('e'); // returns 3
//str3.indexOf('T', 1); // returns -1
//str3.indexOf('t', 1); // returns 9
/*
let str1: string = 'Apple, Banana, Orange';
let str2: string = ',';

str1.split(str2) // returns [ 'Apple', ' Banana', ' Orange' ]
str1.split(',') // returns [ 'Apple', ' Banana', ' Orange' ]
str1.split(',', 2) // returns [ 'Apple', ' Banana' ]
str1.split(',', 1) // returns [ 'Apple']

let str: string = 'Hello Typescript';
str.toUpperCase(); // returns 'HELLO TYPESCRIPT'
'hello typescript'.toUpperCase(); // returns 'HELLO TYPESCRIPT'

*/