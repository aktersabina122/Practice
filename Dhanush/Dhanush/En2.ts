enum Crud {
    INSERT = 2,
    UPDATE = 4,
    DELETE = 6,
    SELECT = 8
}

function show(op : string) : Crud {
    let c : Crud;
    if(op=="INSERT") {
        c=Crud.INSERT;
    }
    if(op=="DELETE") {
        c=Crud.DELETE;
    }
    if(op=="SELECT") {
        c=Crud.SELECT;
    }
    if(op=="UPDATE") {
        c=Crud.UPDATE;
    }
     return c;
}

let res : Crud=show("INSERT");
console.log(res);