let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let max = Number(input[0]);
let num = 1;
for (let i = 0; i < input.length; i++) {
  if (max < Number(input[i])) {
    max = Number(input[i]);
    num = i + 1;
  }
}
console.log(max);
console.log(num);
