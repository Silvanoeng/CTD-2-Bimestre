
let a = [1,2,3,4,5,6,7,8,9,10]
let cont = 0;
let o = 0;
do{
a.map(function (num) {
    cont++
    o= num;
})
console.log(o)

}while(o!==10)

console.log(cont);
console.log(a);