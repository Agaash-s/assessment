// let q=[2,3,5,1,3,4];
// q.sort();
// q.reverse();
// console.log(q)


let input=document.getElementById("txt");
let divArea=document.getElementById("divele");
function result(){
    let str=input.value;
    let arr=str.split("");
    // console.log(arr);
    // console.log(arr.reverse());
    arr.reverse()
    let res=arr.join("")
    console.log(res.split(" ").reverse().join(" "));
    let k=res.split(" ").reverse().join(" ");

    divArea.innerHTML+= k;
}
result();