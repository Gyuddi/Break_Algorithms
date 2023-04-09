const input = require("fs")
  .readFileSync("20230409/example3.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);

let num = Number(input[0]);

let numArray = input[1].split(" ").map(Number);
let answer = 0;
let sum = 0;

let left = 0;

for (let right = 0; right < numArray.length; right++) {
  sum += numArray[right];
  while (sum > num) {
    sum -= numArray[left++];
  }
  if (sum <= num) {
    answer += right - left + 1;
  }
}
log(answer);

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
