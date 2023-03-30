const input = require("fs")
  .readFileSync("20230330/example.txt")
  .toString()
  .trim()
  .split("\n");

const first = ["W", "B", "W", "B", "W", "B", "W", "B"];
const second = ["B", "W", "B", "W", "B", "W", "B", "W"];

let numYX = input[0].split(" ").map(Number);

let numArray = input.slice(1, numYX[0] + 1);
//numArray 가공

//->
// 아래로
let countNum = 0;
let numArrayResult = [];
for (let i = 0; i < numYX[1] - 7; i++) {
  // x
  for (let j = 0; j < numYX[0] - 7; j++) {
    //y
    let arrayTemporary = [];
    countNum++;

    for (let k = 0; k < 8; k++) {
      arrayTemporary.push(numArray[k + j].slice(i, 8 + i));
    }

    numArrayResult.push(arrayTemporary);
  }
}

//8이면 한번 돌아감?

// 3x6
// 8 9 10 11 12 13
// 9
// 10
//i는 x값

//INPUT으로 넘겨주면됨

let countArray = [];
for (let c = 0; c < numArrayResult.length; c++) {
  let input = numArrayResult[c];
  let count = 0;
  let count2 = 0;
  let num = 1;

  for (let i = 0; i < input.length; i++) {
    let chess = input[i].split("");

    let sum = num + i;

    for (let j = 0; j < 8; j++) {
      if (first[j] !== chess[j] && sum % 2 !== 0) {
        count++;
        continue;
      } else if (second[j] !== chess[j] && sum % 2 === 0) {
        count++;
        continue;
      }
    }

    sum = sum + 1;
    for (let j = 0; j < 8; j++) {
      if (first[j] !== chess[j] && sum % 2 !== 0) {
        count2++;
        continue;
      } else if (second[j] !== chess[j] && sum % 2 === 0) {
        count2++;
        continue;
      }
    }
  }
  countArray.push(Math.min(count, count2));
}

console.log(Math.min(...countArray));

//num을 통해 w시작 b시작 비교
//w시작일 경우second부터 비교해야함 그럴경우에 num은 짝수여야함

//짝수 홀수 비교를 잘못했음

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
