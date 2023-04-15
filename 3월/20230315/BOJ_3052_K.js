let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let arr = [];
let count = 0;
for (let i = 0; i < 10; i++) {
  let num = input[i] % 42;
  if (arr.indexOf(num) === -1) {
    arr.push(num);
  }
}

console.log(arr.length);
