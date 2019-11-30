 let myName : string = "Swathi";
 console.log(myName, typeof myName)

 let age : number;
 console.log(age, typeof age)

 let mobileNumber = 8660800843;
 console.log(mobileNumber, typeof mobileNumber)

 let address;

 address = "udupi" ;
 address = 576234 ;
console.log(address, typeof address)

let calAge = function():void{
    console.log("swathi")

}
calAge()

console.log("+========================");

class Person{
    constructor(public name : string, public age: number){

    }
}

let person1 = new Person("swathi", 22);
console.log(person1);

class Student extends Person{
    constructor( name: string, age: number, public rollNumber: number){
        super(name, age);
    }
}

let student1 = new Student("Ammu", 23, 90);
console.log(student1);
