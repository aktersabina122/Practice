function attendance(dayNo) {
    var names = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        names[_i - 1] = arguments[_i];
    }
    console.log(dayNo);
    var res = "";
    for (var s in names) {
        res += names[s] + ' ';
    }
    console.log(res);
}
attendance(1, "Himani");
attendance(2, "Himani", "Kulkarni");
attendance(3, "Prasanna", "Himani", "Kulkarni", "venu");
