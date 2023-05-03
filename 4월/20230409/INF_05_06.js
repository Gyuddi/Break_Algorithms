const input = require("fs")
  .readFileSync("20230409/example6.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;

let countObj = new Map(); // 복습할 것

for (let el of input[0]) {
  if (countObj.has(el)) {
    countObj.set(el, countObj.get(el) + 1); //복습
  } else {
    countObj.set(el, 1);
  }
}

let answer = "";
let max = Number.MIN_SAFE_INTEGER;

for (let [key, value] of countObj) {
  if (value > max) {
    max = value;
    answer = key;
  }
}

log(answer);
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
