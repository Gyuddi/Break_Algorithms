const input = require("fs")
  .readFileSync("20230324/example7.txt")
  .toString()
  .trim()
  .split("\n");

const num = Number(input[0]);
const range = input[0].length;
const rangeNum = range * 9;
const newNum = num - rangeNum;

for (let i = newNum; i < newNum + rangeNum + 1; i++) {
  let getNumber = i;
  let getRest = 0;
  for (let j = 0; j < range; j++) {
    getRest += getNumber % 10;
    getNumber = Math.floor(getNumber / 10);
  }

  if (getRest + i === num) {
    console.log(i);
    break;
  }

  if (i === num) {
    console.log(0);
  }
}

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java

//333 333+9(27) 341
// 341 27
// 314 322
// 315 324
//
//
