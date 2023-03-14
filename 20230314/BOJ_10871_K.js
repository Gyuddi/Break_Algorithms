let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let first = input[0].split(" ");
let num = first[0];
let target = first[1];
let arr = input[1].split(" ");
let result = "";

for (let i = 0; i < num; i++) {
  if (Number(arr[i]) < Number(target)) {
    result = result + " " + arr[i];
  }
}

console.log(result.substring(1));
