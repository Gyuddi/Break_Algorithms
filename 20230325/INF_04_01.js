const input = require("fs")
  .readFileSync("20230324/example.txt")
  .toString()
  .trim()
  .split("\n");

const isNum = Number(input[0]);
const numArray = input[1].split(" ").map(Number); //숫자로 만들면 안됨
let max = Number.MIN_SAFE_INTEGER;
let value = 0; //i값 할당
let saveNum = 0; // 저장
let result = 0;
for (let i of numArray) {
  saveNum = 0;
  value = i;
  while (value) {
    saveNum += value % 10;
    value = Math.floor(value / 10);
  }
  if (saveNum > max) {
    max = saveNum;
    result = i;
  } else if (saveNum === max && result < i) {
    max = saveNum;
    result = i;
  } //3번쨰

  //   let isSum = i 2번 강의
  //     .split("")
  //     .map(Number)
  //     .reduce((a, b) => a + Number(b), 0);

  //   if (isSum > max) {
  //     max = isSum;
  //     value = i;
  //   } else if (isSum === max && i > value) {
  //     max = isSum;
  //     value = i;
  //   }

  //   let sumNum = 0; 1번방법
  //   for (let j of isSum) {
  //     sumNum += j;
  //   }

  //   if (sumNum > max) {
  //     max = sumNum;

  //     value = i; //128 , 131그리고 sumnum
  //   } else if (sumNum === max && i > value) {
  //     max = sumNum;

  //     value = i;
  //   }
}

console.log(max, result);

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
