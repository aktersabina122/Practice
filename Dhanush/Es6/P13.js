var num = 1;
function demo() {
    var num = 2;
    if (true) {
        var num_1 = 3;
        console.log(num_1); //Output: 3
    }
    console.log(num); //Output: 2
}
console.log(num); //Output: 1
demo();
