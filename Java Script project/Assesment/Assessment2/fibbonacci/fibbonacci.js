//named fuction
function fib(num)
{
    var a=0, b=1,i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;

    }

}
fib(10);


//expression function

var fib = function(num)
{
    var a=0, b=1,i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;
    }
   
}
fib(10);


//self invoking function

( function(num){
    var a=0, b=1,i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;
    }    

})(10)

//fat arrow function

var fib = num =>
{
    var a=0, b=1, i;
    for(i=0;i<=num;i++)
    {
        var c=a+b;
        console.log(a);
        a=b;
        b=c;

    }
}
fib(10);
































