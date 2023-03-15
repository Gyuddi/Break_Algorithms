var input = require("fs")
  .readFileSync("20230315/example6.txt")
  .toString()
  .trim()
  .split("\n");


let reportNum = input[1].split(" ");
let max = Math.max(...reportNum);

let newReport = reportNum.map((num) => {
  return (num / max) * 100;
});

let sum = newReport.reduce((acc, cur) => {
  return acc + cur;
});

console.log(sum / input[0]);
