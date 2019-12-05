function demo(name : string | number |boolean ) {
    if(name=="Himani") {
        console.log("You passed String " +name);
    } 
    if(name==1) {
        console.log("You Passed Number " +name);
    }
    if(name==true) {
        console.log("You passed Boolean " +name);
    }
    if(name==false) {
        console.log("You passed Boolean " +name);
    }
    var dt=new Date("2019-12-12");
    if(name=="2019-12-12") {
        console.log("Date");
    }
}
demo("Himani");
demo(1);
demo(0);
demo(true);
demo(false);