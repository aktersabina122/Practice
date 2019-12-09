enum LeaveType {
    ML = "Maternity Leave",
    SL = "Sick Leave",
    PL = "Personal Leave",
    SSL = "Special Sick Leave"
}

enum LeaveStatus {
    APPROVED = "Leave Approved",
    PENDING = "Still Pending",
    DENIED = "Leave Rejected"
}

function approveDeny(eno : number, lt : LeaveType) : LeaveStatus {
    let lstat : LeaveStatus;
    if(eno==1 && lt==LeaveType.SL) {
        lstat=LeaveStatus.APPROVED;
    } else if(eno==2 && lt==LeaveType.SL) {
        lstat=LeaveStatus.DENIED;
    } 
    else {
        lstat=LeaveStatus.PENDING;
    }
    return lstat;
} 

let res1 : LeaveStatus = approveDeny(1, LeaveType.SL);
console.log(res1);

let res2 : LeaveStatus = approveDeny(2, LeaveType.SL);
console.log(res2);

let res3 : LeaveStatus = approveDeny(3, LeaveType.SSL);
console.log(res3);