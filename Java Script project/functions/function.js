// Named functions

function add(num1,num2){
    console.log('sum=', num1+num2);
}
add(10);

   
// Anonymous function

var sub = function(num1,num2)
{
    console.log('sub=', num1-num2); // or var subValue= num1- num2;
    return num1-num2;
}
var value = sub(20,10);
console.log('value', value);

//Fat Arrow Function

var div=(num1, num2) => {
    console.log('value=', num1+num2);
}
div(10,5);


var div1=num1=>{
    console.log('value=', num1);
}

//==================================

greet('Dinga');
var greet= function(msg)
{
    Console.log('hi',msg);
}

//=================================

greet(Dingi);
var greet = function(msg) => {
    Console.log('Hi', msg);

}


//calling function before declaring
welcome('swathi');
function welcome(hiii){
    console.log('hello',hii);
}