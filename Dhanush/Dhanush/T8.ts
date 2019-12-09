function fact(n : number) : number {
    let f : number;
    f=1;
    for(let i=1;i<=n;i++) {
        f=f*i;
    }
    return f;
}

function ncr(n : number, r : number) : number {
    return (fact(n)/(fact(n-r) * fact(r)));
}

console.log(ncr(5,2));