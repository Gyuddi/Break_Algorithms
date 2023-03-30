const input = require("fs")
  .readFileSync("20230330/example2.txt")
  .toString()
  .trim()
  .split("\n");

let num = Number(input[0]);
let count = 0;
let growingNum = 666;

while (true) {
  if (String(growingNum).includes(666)) count++;

  if (count === num) {
    console.log(growingNum);
    break;
  }
  growingNum++;
}

//while문은 트루일때만..
// 666 1 5666 6 6660~6669 16 / 7666 / 10666 14666
// 그냥 666 들어가있으면 맞도 ㄱ ㄱㄱ
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
