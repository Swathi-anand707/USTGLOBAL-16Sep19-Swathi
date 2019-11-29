const items = [{
    name : "Earring",
    id : 1,
    price :5000
},{
    name : "kajal",
    id : 2,
    price : 1000
}, {
    name : "trimmer",
    id : 3,
    price : 3000
},{
    name : "set wet",
    id : 4,
    value : 170
}

]
const updateItems = items.map(function(items , index){
    items.price = items.price + 300;
    return items.price
    
})