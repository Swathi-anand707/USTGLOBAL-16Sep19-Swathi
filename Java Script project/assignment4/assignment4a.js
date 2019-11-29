const items =[{
    name     : 'ear rings',
    id       :1,
    price    : 5000
},{
    name     : 'kajal',
    id       :2,
    price    : 1000 
},{
    name     : 'trimmer',
    id       :3,
    price    : 3000
},{
    name     : 'beardo',
    id       :4,
    price    : 170
}
    
]
const item = items.map((value)=>{
    value.price= value.price+300
return value;
})
console.log(item);

const obj = items.filter(items=>items.price>2000)
console.log('after filter  function',obj);
