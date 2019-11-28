let employeeName:string = "John Smith"; 
let employeeDept:string = "Finance"; 

let employeeDesc1: string = employeeName + " works in the " + employeeDept + " department."; 
let employeeDesc2: string = `${employeeName} works in the ${employeeDept} department.`; 
console.log(employeeDesc1);
console.log(employeeDesc2);