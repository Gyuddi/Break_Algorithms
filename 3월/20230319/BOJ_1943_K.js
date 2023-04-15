let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let num = input[0];
let max = 0;
for (let i = 1; i <= num; i++) {
  let given = input[i].split(" ");
  let realA = given[0];
  let realB = given[1];
  if (realA < realB) {
    realA = given[1];
    realB = given[0];
  }

  let a = realA;
  let b = realB;
  let rest = b;

  // 큰수에서 작은수 나눈다 나머지 구함
  // 작은수 나머지 나눈다 나머지 구함
  while (a % b !== 0) {
    rest = a % b;

    if (rest !== 0) {
      a = b;
      b = rest;
    }
  }
  max = (realA * realB) / rest;
  console.log(max);
}
