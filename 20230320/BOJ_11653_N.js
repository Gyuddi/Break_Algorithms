const input = require("fs")
  .readFileSync("20230319/example4.txt")
  .toString()
  .trim()
  .split("\n");

let numArray = input[0]
  .split(" ")
  .map(Number)
  .sort((a, b) => a - b);
let big = numArray[1];
let small = numArray[0];

while (big % small !== 0) {
  let rest = big % small;
  big = small;
  small = rest; // 최대공약수가 될 숫자
}
let result = (numArray[1] * numArray[0]) / small;
console.log(result);
