//The Let and Block Scope
//The block scope restricts a variable’s access to the block in which it is declared. The var keyword assigns a function scope to the variable. Unlike the var keyword, the let keyword allows the script to restrict access to the variable to the nearest enclosing block.

"use strict" 
function test() { 
   let num = 100 
   console.log("value of num in test() "+num); 
   { 
      console.log("Inner Block begins") 
      let num = 200 
      console.log("value of num : "+num)  
   } 
} 

test()