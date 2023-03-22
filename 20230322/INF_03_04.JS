const input = require("fs")
  .readFileSync("20230322/example4.txt")
  .toString()
  .trim()
  .split("\n");

let garbage = input[0].split(" ")[0];
let alphabet = garbage[garbage.length - 1];
let result = [];
let count = 1001;

for (let i of garbage) {
  if (i === alphabet) {
    count = 0;
    result.push(0);
  } else {
    count++;
    result.push(count);
  } //한번 돔
}
count = 1001;
for (let i = garbage.length - 1; i >= 0; i--) {
  if (garbage[i] === alphabet) {
    count = 0; // 다시넣을필요 x
  } else {
    count++;
    result[i] = Math.min(count, result[i]);
  }
}

console.log(result.join(" "));
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
