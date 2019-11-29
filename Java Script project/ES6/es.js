const message = new Promise(function(resolve, reject){
    if(30 > 10){
        resolve("success")
    }else{
        resolve("failed")
    }
})

message.then(function(msg){
    console.log('success meassge:', msg)
    
}).catch(function(error){
    console.log('failure message:',err)
})

