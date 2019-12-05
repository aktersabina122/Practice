var LeaveType;
(function (LeaveType) {
    LeaveType["ML"] = "Maternity Leave";
    LeaveType["SL"] = "Sick Leave";
    LeaveType["PL"] = "Personal Leave";
    LeaveType["SSL"] = "Special Sick Leave";
})(LeaveType || (LeaveType = {}));
function applyLeave(no) {
    var lt;
    if (no == 1) {
        lt = LeaveType.ML;
    }
    if (no == 2) {
        lt = LeaveType.PL;
    }
    if (no == 3) {
        lt = LeaveType.SL;
    }
    if (no == 4) {
        lt = LeaveType.SSL;
    }
    return lt;
}
var result = applyLeave(3);
console.log(result);
