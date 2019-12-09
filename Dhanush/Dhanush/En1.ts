enum Days {
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday
}
function show(dt : string) : Days {
    let wk : Days;
    if(dt=="Monday") {
        wk=Days.Monday;
    } else if(dt="Friday") {
        wk=Days.Friday
    }
    return wk;
}
let wk : Days=show("Friday");
console.log(wk);
//let sname : string;
//let wk : Days = Days.Wednesday;
//console.log(wk);