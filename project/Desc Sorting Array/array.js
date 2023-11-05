let input =document.getElementById("inputArea")
let output=document.getElementById("outputArea");

let arr=[];
function addArray(){
    arr.push(input.value);
//     console.log(arr);
}
function sortNumbers(){
    arr.sort().reverse();
    output.value=arr; 
//     console.log(arr);
}


// add each and every element by click the add and change it and atlast click result it