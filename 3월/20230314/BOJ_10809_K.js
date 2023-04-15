let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let num = input[0];
let arr = input[1].split(" ");
let result = input[2];
let count = 0;

if (Number(num) === arr.length) {
  for (let i = 0; i < num; i++) {
    if (arr[i] === result) {
      count += 1;
    }
  }
  console.log(count);
}
