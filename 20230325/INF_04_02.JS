const input = require("fs")
  .readFileSync("20230324/example2.txt")
  .toString()
  .trim()
  .split("\n");

//만들어 놓고 하느냐
// 바로 확인하느냐
// let num = Number(input[0]);
// let answer = [];
// let numArray = input[1]
//   .split(" ")
//   .map((el) => Number(el.split("").reverse().join("")));
// let maxNum = Math.max(...numArray);
// let isPrime = new Array(maxNum + 1).fill(true, 2); // fill

// for (let i = 2; i * i <= maxNum; i++) {
//   //   if (!isPrime[i]) continue;
//   for (let j = i * i; j <= maxNum; j += i) {
//     isPrime[j] = false;
//   }
// }

// // 1 2 3 4 5 6 7 8 9 10  <10
// //
// for (let i of numArray) if (isPrime[i]) console.log(answer);

// console.log(answer);
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java

function isPrime(num) {
  if (num === 1) return false;
  for (let i = 2; i < parseInt(Math.sqrt(num)); i++) {
    if (num % i === 0) {
      return false;
    }
  }
  return true;
}

let numArray = input[1].split(" ");
let answer = [];
for (let i of numArray) {
  let num = i;
  let result = Number(num.split("").reverse().join(""));
  //   while (num) {
  //     let rest = num % 10;
  //     result = result * 10 + rest;
  //     num = Math.floor(num / 10);
  //   }
  if (isPrime(result)) {
    answer.push(result);
  }
}

// console.log(answer.join(" "));
