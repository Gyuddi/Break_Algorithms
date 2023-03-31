const input = require("fs")
  .readFileSync("20230330/example3.txt")
  .toString()
  .trim()
  .split("\n");

let num = Number(input[0]);

let numArray = new Array(num).fill(0);
numArray[3] = 1;
numArray[5] = 1;

for (let i = 6; i <= num; i++) {
  let tmp = Math.min(numArray[i - 3], numArray[i - 5]);

  if (!tmp) {
    if (!numArray[i - 3] && !numArray[i - 5]) {
      //2개다 0인경우
      numArray[i] = 0;
    } else if (!numArray[i - 3]) {
      numArray[i] = 1 + numArray[i - 5];
    } else if (!numArray[i - 5]) {
      numArray[i] = 1 + numArray[i - 3];
    }
  } else {
    numArray[i] = tmp + 1;
  }
}

if (numArray[num]) {
  console.log(numArray[num]);
} else {
  console.log(-1);
}

//1이 하나인 경우
// 찾아서 1 올려주고 넣어줌

//0이 두개인 경우
//-1 반환

//1이 두개인 경우
//2 올려줌
// 9
// 6은 2임
// 15 12 10
// 12 =4
// 10 = 2;
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
