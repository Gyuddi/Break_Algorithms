const input = require("fs")
  .readFileSync("20230324/example4.txt")
  .toString()
  .trim()
  .split("\n");

let isNum = input[0].split(" ").map(Number);
let isMoney = isNum[1];
isNum = isNum[0];

let moneyArray = input
  .slice(1)
  .map((el) => el.split(" ").map(Number))
  .sort((a, b) => a[0] + a[1] - (b[0] + b[1]));

let count = 0;

for (let i = 0; i < isNum; i++) {
  let moneyResult = isMoney - (moneyArray[i][0] / 2 + moneyArray[i][1]);
  let cnt = 1;
  for (let j = 0; j < isNum; j++) {
    if (i !== j && moneyResult >= moneyArray[j][0] + moneyArray[j][1]) {
      moneyResult -= moneyArray[j][0] + moneyArray[j][1];
      cnt++;
    }
  } //같은 경우에도 뺴줄 수 있음

  count = Math.max(cnt, count);
}

// for (let i = 0; i < isNum; i++) {
//   let backUp = moneyArray[i][0];
//   moneyArray[i][0] = moneyArray[i][0] / 2; //기존 배열은 살려야함

//   let newArray = [];

//   for (let j = 0; j < isNum; j++) {
//     //각각 더할거야
//     newArray.push(moneyArray[j][0] + moneyArray[j][1]);
//   }
//   newArray.sort((a, b) => a - b); //큰순서대로 정렬

//   let sumResult = 0;
//   let blockCount = 0;

//   for (let j = 0; j < isNum; j++) {
//     // 더해보기
//     sumResult += newArray[j];

//     if (sumResult > isMoney) {
//       break;
//     }
//     blockCount++;
//   }

//   if (blockCount > count) count = blockCount; // 가장큰 카운트

//   moneyArray[i][0] = backUp;
// }

console.log(count);
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java

//50% 쿠폰이 있다.
