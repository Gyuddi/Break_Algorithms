const input = require("fs")
  .readFileSync("20230409/example.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);

let first = input[1]
  .split(" ")
  .sort((a, b) => a - b)
  .map(Number);

let second = input[3]
  .split(" ")
  .sort((a, b) => a - b)
  .map(Number);

log(second, first);
let answer = [];
let p1 = (p2 = 0);
while (p1 < first.length && p2 < second.length) {
  if (first[p1] === second[p2]) {
    answer.push(first[p1++]);
    p2++;
  } else if (first[p1] > second[p2]) {
    p2++;
  } else {
    p1++;
  }
}

log(answer);
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
