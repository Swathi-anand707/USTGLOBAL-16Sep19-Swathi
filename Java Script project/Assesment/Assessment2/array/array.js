//named function
function add(arr){
    var i, sum=0;
    for ( i = 0; i < arr.length; i++) {
       sum = sum + arr[i];
    }
    console.log(sum);

}
add([10,20,30,40]);


//expression function

var res = function(arr)
{
    var i, sum = 0;
    for ( i = 0; i < arr.length; i++) {
       sum=sum+arr[i];
    }
    console.log(sum);
  
}
add([20,20,30,40]);

//self invoking function

(function (arr) {
    var i,sum=0;
    for ( i = 0; i < arr.length; i++) {
       sum=sum+arr[i];
    }
    console.log(sum);
    
})([30,20,30,40])

 //Fat arrow function


 var add = (arr)=>
 {
    var i,sum=0;
    for ( i = 0; i < arr.length; i++) {
       sum=sum+arr[i];
    }
    console.log(sum);
    

 }
add([20,20,30,40]);

 
    

