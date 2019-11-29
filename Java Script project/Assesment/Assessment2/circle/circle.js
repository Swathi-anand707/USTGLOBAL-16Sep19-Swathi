//named function

function circumf(radius)
{
    var c, PI=3.14;
    c = 2*PI*radius;
    console.log("circumference of a circle is:",c)
}

circumf(4);

//expression function

var circumf = function(radius)
{
    var c, PI=3.14;
    c = 2*PI*radius;
    console.log("circumference of a circle is:",c)
}
circumf(4);


// self invoking function

(function(radius)
{
    var c, PI=3.14;
    c = 2*PI*radius;
    console.log("circumference of a circle is:",c)

})(4)

//Fat arrow function

var circumf = radius =>
{
    var c, PI=3.14;
    c = 2*PI*radius;
    console.log("circumference of a circle is:",c)

}
circumf(4);















