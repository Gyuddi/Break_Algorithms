const input = require("fs")
  .readFileSync("20230413/example.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);

let result = [];

// for (let i of input[0]) {
//   while (i === ")") {
//     let j = result.pop();
//     if (j === "(") {
//       break;
//     }
//   }
//   if (i !== ")") result.push(i);
// }
// log(result.join(""));

for (let i of input[0]) {
  if (i === ")") {
    while (result.pop() !== "(");
  } else {
    result.push(i);
  }
}
log(result.join(""));
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
