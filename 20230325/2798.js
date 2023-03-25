const input = require("fs")
  .readFileSync("20230324/example6.txt")
  .toString()
  .trim()
  .split("\n");

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
let turn = input[0].split(" ").map(Number);

let number = turn[1];

turn = turn[0];

let max = Number.MIN_SAFE_INTEGER;
let numArray = input[1].split(" ").map(Number);

for (let i = 0; i < turn; i++) {
  for (let j = i + 1; j < turn; j++) {
    for (let k = j + 1; k < turn; k++) {
      if (
        number >= numArray[i] + numArray[j] + numArray[k] &&
        max < numArray[i] + numArray[j] + numArray[k]
      ) {
        max = numArray[i] + numArray[j] + numArray[k];
      }
    }
  }
}
console.log(max);

