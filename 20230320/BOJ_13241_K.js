let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let given = input[0].split(" ");
let min = 1;

realA = given[0];
realB = given[1];
if (realA < realB) {
  realA = given[1];
  realB = given[0];
}

let a = realA;
let b = realB;

while (a % b !== 0) {
  min = a % b;
  a = b;
  b = min;
}

console.log((realA * realB) / b);
