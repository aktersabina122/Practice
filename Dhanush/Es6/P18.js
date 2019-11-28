function attendance() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var s in names) {
        console.log(names[s]);
    }
}
attendance();
attendance("Himani", "Prasanna");
attendance("Himani", "venu", "raj", "Vik");
