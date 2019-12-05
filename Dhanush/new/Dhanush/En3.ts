enum LeaveType {
    ML = "Maternity Leave",
    SL = "Sick Leave",
    PL = "Personal Leave",
    SSL = "Special Sick Leave"
}

function applyLeave(no : number) : LeaveType {
    let lt : LeaveType;
    if(no==1) {
        lt=LeaveType.ML;
    }
    if(no==2) {
        lt=LeaveType.PL;
    }
    if(no==3) {
        lt=LeaveType.SL;
    }
    if(no==4) {
        lt=LeaveType.SSL;
    }
    return lt;
}

let result : LeaveType = applyLeave(3);
console.log(result);