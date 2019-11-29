const employee = new Promise(function(resolve, reject){
    if(30 > 40){
        resolve({
            name : 'Billgates',
            age : 67


        },{
            name : 'Mark Zuckerberg',
            age : 40

        },{
            name : ' Jeff Beozs',
            age :45

        })
    }else{
        resolve("failed")
    }
})

employee.then(function(data){
    console.log('success meassge:', data)
    
}).catch(function(error){
    console.log('failure message:',error)
})


//closure

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = count + 10
        return count
    }
    return innerFunction
}
let innerFunc = outerFunction(20)
    let counter = innerFunc()
    console.log('counter value', counter) 
 //object restructure

 const hobbies = ['sing', 'Dance', 'Cricket']
 let hobby = hobbies[0]
 let hobby1 = hobbies[1]
 let hobby2 = hobbies[2]

 let [hobby,hobby1] = hobbies;
 console.log(hobbies);
