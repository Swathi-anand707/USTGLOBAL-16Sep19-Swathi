let h1Element = document.getElementById('demo')
console.log('element = ', h1Element)
console.log('element text=', h1Element.textContent)
h1Element.textContent = "good evening"
//create element by dynamically
let buttonElement = document.createElement('button')
buttonElement.textContent = 'click me!!'
console.log('buttonElement', buttonElement)


document.body.appendChild(buttonElement)
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')


li1Element.textContent = 'JAVA'
li2Element.textContent = 'SQL'
li3Element.textContent = 'JavaScript'

ulElement.appendChild(li1Element);
ulElement.appendChild(li2Element);
ulElement.appendChild(li3Element);
document.body.appendChild(ulElement);

h1Element.style.color ='red'
h1Element.style.fontSize = '30px'

function showMessage(){
    alert('Hi Hello Welcome!!!')
}

function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'green'
}

function removeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'black'
}

function printHello(){
    console.log('hello')
    let userName = document.getElementById('userName').value //whenever we take the value from the user then use value
    document.getElementById('showUserName').textContent = userName;
}

let name = 'swathi'
let age = 22
let  phoneNumber = 86600800843
console.log('Name is' +name+ 'age is' +age+ 'phone number is' +phoneNumber);//using concatination // if we want to make simpler then we can go for bactic
console.log('Name is ${name} Age is ${age} Phone number is ${phoneNumber}')
console.log('  2 + 2= ${2+2}')







