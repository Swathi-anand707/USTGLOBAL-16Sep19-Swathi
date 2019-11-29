//named function
function checkPrime(num)
{
var num, flag = false;
if(num==0||num==1)
{
    console.log("not a prime number");
}else
{
    for(i=2;i=num/2;i++)
    if(num%i==0)
    {
        console.log("not a prime number");
        flag=true;
        break;
    }
    if(flag==false)
    {
        console.log("prime number")
    }
}
}
checkPrime(3);

// expression function

var checkprime = function(num)
{
    for(i=2;i=num/2;i++)
    if(num%i==0)
    {
        console.log("not a prime number",num);
    }else{
        console.log("prime number", num);

    }
    

}
checkPrime(4);

//self invoking function

(function(num)
{
    
    for(i=2;i=num/2;i++)
    if(num%i==0)
    {
        console.log("not a prime number",num);
    }else{
        console.log("prime number", num);
    }


})(4)

//fat arrow function

var prime = num =>
{
    
    for(i=2;i=num/2;i++)
    if(num%i==0)
    {
        console.log("not a prime number",num);
    }else{
        console.log("prime number", num);
    }
}
checkPrime(4);












































































































