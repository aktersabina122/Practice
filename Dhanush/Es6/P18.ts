function attendance(...names:string[]) {
    for(let s in names) {
        console.log(names[s]);
    }
}

attendance();
attendance("Himani","Prasanna");
attendance("Himani","venu","raj","Vik");