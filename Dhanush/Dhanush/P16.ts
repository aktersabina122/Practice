function letDemo(a: number ) { 
    let a:number = 10 ; //Compiler Error: TS2300: Duplicate identifier 'a'
    let b:number = 20 ; 

    return a + b ;
}