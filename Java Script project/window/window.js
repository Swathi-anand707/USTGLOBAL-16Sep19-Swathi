console.log('window object', window)
console.log('this keyword', this)
console.log(this === window)

//window.alert('welcome to javascript class')
//alert('welcome to UST global and Test Yantra')

//let confirmDelete = confirm('Are you sure you want to delete')
//console.log('confirm Delete', confirmDelete)

let userName= prompt('what is your name', 'swathi')
console.log('user name',userName) // In output command if we give ok then it display name orelse name


console.log("==================================")

const person = {
    firstName : 'Swathi',
    age:22,
    lastName: 'Anand',
    getName : function(){
        console.log('this keyword', this)//which display complete object, becz here we invoked method using object reference
        return this.firstName + ' ' + this.lastName
    }

}

let fullName = person.getName()
console.log('Full Name', fullName)