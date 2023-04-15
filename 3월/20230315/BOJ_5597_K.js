let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let arr = [];
let max = 0;
let min = 0;

for (let i = 0; i <= 30; i++) {
  arr[i] = 0;
}
for (let i = 0; i <= 30; i++) {
  for (let j = 0; j <= input.length; j++) {
    if (i === Number(input[j])) {
      arr[i] = Number(input[j]);
    }
  }
}
arr.shift();
min = arr.indexOf(0) + 1;
max = arr.lastIndexOf(0) + 1;

console.log(min);
console.log(max);
