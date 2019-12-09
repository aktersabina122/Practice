enum Status { 
    Active = 'ACTIVE', 
    Deactivate = 1, 
    Pending = 5
}

function check(st : string) : Status {
    let res : Status;
    if(st=="Active") {
        res = Status.Active;
    }
    if(st=="Deactivate") {
        res=Status.Deactivate;
    }
    if(st=="Pending") {
        res=Status.Pending;
    }
    return res;
}

let res1 : Status = check("Active");
console.log(res1);
let res2 : Status = check("Deactivate");
console.log(res2);