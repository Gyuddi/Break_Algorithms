let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let countNum = Number(input[0]);
let sumNum = input[1].split("");
let sum = 0;

for (let i = 0; i < countNum; i++) {
  sum += Number(sumNum[i]);
}

console.log(sum);
