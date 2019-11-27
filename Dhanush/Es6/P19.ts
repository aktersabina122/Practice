function attendance(dayNo:number,...names:string[]) {
    console.log(dayNo);
    let res="";
    for(let s in names) {
        res+=names[s] + ' ';
    }
    console.log(res);
}

attendance(1,"Himani");
attendance(2,"Himani","Kulkarni");
attendance(3,"Prasanna","Himani","Kulkarni","venu");