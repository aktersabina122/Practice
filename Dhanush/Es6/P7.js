var num = 10 
function test(n) { 
   var num = 100 
   if(n >= 10) {
       var num = 50;
   } else {
       var num =10;
   }
   
   console.log("value of num in test() "+num) 
} 
console.log("value of num outside test() "+num) 
test()