function first(callFunc){
    setTimeout(function(){
    console.log("First function executed")
    callFunc()
    },0)
    console.log("Executed")
}

function second(){
    console.log("second function executed")
}
first()
second()