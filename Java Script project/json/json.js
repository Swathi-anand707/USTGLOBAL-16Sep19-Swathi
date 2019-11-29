const person = {
    name : 'sundari',
    age : 100,
    color : 'white',
    address : { 
        city : 'Bijapur',
        State : 'Karnataka',
        pincode : 591115
    },
    hobbies : ['coding', 'bird watching', 'singing']



}
console.log('javascript person object', person)
const jsonObject = JSON.stringify(person)
console.log('Json person object', jsonObject)

console.log("++++++++++++++++++++++++++++")
const javaScriptPersonObject = JSON.parse(jsonObject)
console.log('JavaScript person object :', javaScriptPersonObject)

console.log("++++++++++++++++++++++++++++")

localStorage.setItem('email','swathi.anand97@gmail.com')
const emailID = localStorage.getItem('email')
console.log('Email ID', emailID)
localStorage.clear();
