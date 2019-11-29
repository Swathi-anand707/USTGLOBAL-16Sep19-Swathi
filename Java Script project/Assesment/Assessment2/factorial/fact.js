//named function
function fact1(num)
{
    var i, fact=1;
    for(i=1;i<=num;i++)
    {
        fact = fact * i ;
    }
    console.log("Factorial of a number is:",fact);
}
fact1(6);


//expression function for factorial

var num=function(num)
{
    var i; fact = 1;
    for(i=1;i<=num;i++)
    {
        fact=fact*i;
    }
    return fact;
}
var res=num(6);
console.log("Factorial of a number is:",res);


// self invoking function

(function(num)
{
    var i; fact = 1;
    for(i=1;i<=num;i++)
    {
        fact = fact*i;
    }
    console.log("Factorial of a number is:",fact);      
})
(5)

// fat arrow function

var fact = num =>
{
    var i; fact = 1;
    for(i=1;i<=num;i++)
    {
        fact = fact*i;
    }
    console.log("Factorial of a number is:",fact); 

}
fact(5);




