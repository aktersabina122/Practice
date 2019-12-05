function fact(n) {
    var f;
    f = 1;
    for (var i = 1; i <= n; i++) {
        f = f * i;
    }
    return f;
}
function ncr(n, r) {
    return (fact(n) / (fact(n - r) * fact(r)));
}
console.log(ncr(5, 2));
