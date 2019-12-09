var Status;
(function (Status) {
    Status["Active"] = "ACTIVE";
    Status[Status["Deactivate"] = 1] = "Deactivate";
    Status[Status["Pending"] = 5] = "Pending";
})(Status || (Status = {}));
function check(st) {
    var res;
    if (st == "Active") {
        res = Status.Active;
    }
    if (st == "Deactivate") {
        res = Status.Deactivate;
    }
    if (st == "Pending") {
        res = Status.Pending;
    }
    return res;
}
var res1 = check("Active");
console.log(res1);
var res2 = check("Deactivate");
console.log(res2);
