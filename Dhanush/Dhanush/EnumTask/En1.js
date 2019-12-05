var LeaveType;
(function (LeaveType) {
    LeaveType["ML"] = "Maternity Leave";
    LeaveType["SL"] = "Sick Leave";
    LeaveType["PL"] = "Personal Leave";
    LeaveType["SSL"] = "Special Sick Leave";
})(LeaveType || (LeaveType = {}));
var LeaveStatus;
(function (LeaveStatus) {
    LeaveStatus["APPROVED"] = "Leave Approved";
    LeaveStatus["PENDING"] = "Still Pending";
    LeaveStatus["DENIED"] = "Leave Rejected";
})(LeaveStatus || (LeaveStatus = {}));
function approveDeny(eno, lt) {
    var lstat;
    if (eno == 1 && lt == LeaveType.SL) {
        lstat = LeaveStatus.APPROVED;
    }
    else if (eno == 2 && lt == LeaveType.SL) {
        lstat = LeaveStatus.DENIED;
    }
    else {
        lstat = LeaveStatus.PENDING;
    }
    return lstat;
}
var res1 = approveDeny(1, LeaveType.SL);
console.log(res1);
var res2 = approveDeny(2, LeaveType.SL);
console.log(res2);
var res3 = approveDeny(3, LeaveType.SSL);
console.log(res3);
