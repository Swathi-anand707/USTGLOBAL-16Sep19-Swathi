const hobbies = ['sleeping', 'cricket', 'eating', 'coding', 'roaming']
console.log(typeof hobbies);

const isArrayOrNot = Array.isArray(hobbies)
console.log('hobbies array or not', isArrayOrNot)
const hasCricket = hobbies.includes('cricket')
console.log('using includes method', hasCricket)
hobbies.push('guitar', 'valleyball')
console.log('after pushing method', hobbies)
hobbies.pop()
console.log('after pop method', hobbies)
hobbies.unshift('numismatics','Singing')
console.log('after unshift method', hobbies)
hobbies.shift()
console.log('after shift method', hobbies)

const hobbies1 =['sleeping', 'eating', 'roaming','cricket','coding']
hobbies1.splice(1,2,'bird watching','pubg')


const hobbies2 =['sleeping', 'eating', 'roaming','cricket','coding']
hobbies2.splice(1,0,'bird watching','pubg')

const hobbies3 =['sleeping', 'eating', 'roaming','cricket','coding']
hobbies3.splice(1,2)


const hobbies4 =['sleeping', 'eating', 'roaming','cricket','coding']
console.log('after splice method', hobbies4)
const afterSlice=hobbies4.slice(2,4)
console.log('after slice method', hobbies4)
console.log('after slice method', afterSlice)


const hobbies5 =['sleeping', 'eating', 'roaming','cricket','coding']
const indexOf = hobbies5.indexOf('cricket',2)
console.log('index of coding is:',indexOf)


const hobbies6 =['sleeping', 'eating', 'roaming','cricket','coding']
const join = hobbies6.join("-")
console.log('join of coding',join)


console.log("=====================")
const numbers= [100,200,300,400]
const nums1 = numbers.map(function(value,index){
    let newValue = value+50;
    return newValue;

})
console.log('after map method', nums1)
console.log("=====================")
const nums2 = numbers.map(value=>value+50)
console.log('after map arrow function', nums2)



// if the number greater than 200 then push to new array
const numbers2= [100,200,300,400]
const num2 = numbers2.filter(function(value,index){
    if(value>200){
        return true;
    }else{
        return false;
    }
    
})
console.log('after filter method using arrow', num2)

console.log("=====================")
const filterNumArrow = numbers.filter(value => value > 200)
console.log('after filter method using fat arrow ',filterNumArrow)







