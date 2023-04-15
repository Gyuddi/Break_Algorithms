const input = require("fs")
  .readFileSync("20230324/example5.txt")
  .toString()
  .trim()
  .split("\n");

let num = input[0].split(" ").map(Number);
let numNumber = num[1];
num = num[0];

let numArray = input[1].split(" ").map(Number);

let answer = 0;
let tmp = new Set(); //중복 제거 객체 뱉음
for (let i = 0; i < num; i++) {
  for (let j = i + 1; j < num; j++) {
    for (let k = j + 1; k < num; k++) {
      tmp.add(numArray[i] + numArray[j] + numArray[k]);
    }
  }
}
let process = Array.from(tmp).sort((a, b) => b - a);
console.log(process[numNumber - 1]); // length 값 -1

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
