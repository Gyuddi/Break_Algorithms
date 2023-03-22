const input = require("fs")
  .readFileSync("20230322/example5.txt")
  .toString()
  .trim()
  .split("\n");

let word = input[0];
let result = "";
let count = 1;

for (let i = 0; i < word.length; i++) {
  //   if (count === 1) {
  //     result += word[i];
  //   }

  //   if (word[i] === word[i + 1]) {
  //     count++;
  //   } else if (count > 1) {
  //     result += count;
  //     count = 1;
  //   }
  if (word[i] === word[i + 1]) {
    count++;
  } else {
    result += word[i];
    if (count > 1) {
      result += count;
    }
    count = 1;
  }
}

//답지는 안같을 경우에 결론을 넣음
//답지가 시간복잡도가 더 적다.
console.log(result);

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
