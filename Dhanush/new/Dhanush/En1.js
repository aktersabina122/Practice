var Days;
(function (Days) {
    Days[Days["Monday"] = 0] = "Monday";
    Days[Days["Tuesday"] = 1] = "Tuesday";
    Days[Days["Wednesday"] = 2] = "Wednesday";
    Days[Days["Thursday"] = 3] = "Thursday";
    Days[Days["Friday"] = 4] = "Friday";
    Days[Days["Saturday"] = 5] = "Saturday";
})(Days || (Days = {}));
function show(dt) {
    var wk;
    if (dt == "Monday") {
        wk = Days.Monday;
    }
    else if (dt = "Friday") {
        wk = Days.Friday;
    }
    return wk;
}
var wk = show("Friday");
console.log(wk);
//let sname : string;
//let wk : Days = Days.Wednesday;
//console.log(wk);
