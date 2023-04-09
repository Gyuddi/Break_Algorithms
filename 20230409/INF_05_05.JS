const input = require("fs")
  .readFileSync("20230409/example5.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);

let num = Number(input[0]);
let numArray = input[1].split(" ").map(Number);

let sum = (answer = 0);

for (let i = 0; i < num; i++) {
  sum += numArray[i];
}
answer = sum;

for (let i = num; i < numArray.length; i++) {
  sum += numArray[i] - numArray[i - num];
  if (sum > answer) answer = sum;
}
log(answer);
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
