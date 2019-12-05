var Crud;
(function (Crud) {
    Crud[Crud["INSERT"] = 2] = "INSERT";
    Crud[Crud["UPDATE"] = 4] = "UPDATE";
    Crud[Crud["DELETE"] = 6] = "DELETE";
    Crud[Crud["SELECT"] = 8] = "SELECT";
})(Crud || (Crud = {}));
function show(op) {
    var c;
    if (op == "INSERT") {
        c = Crud.INSERT;
    }
    if (op == "DELETE") {
        c = Crud.DELETE;
    }
    if (op == "SELECT") {
        c = Crud.SELECT;
    }
    if (op == "UPDATE") {
        c = Crud.UPDATE;
    }
    return c;
}
var res = show("INSERT");
console.log(res);
