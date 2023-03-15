var input = require("fs")
  .readFileSync("20230315/example4.txt")
  .toString()
  .split("\n");



let numArray = new Array(30).fill(1);
numArray = numArray.map((_, index) => {
  return String(index + 1);
}, 1);

numArray = numArray.filter((el) => {
  return input.indexOf(el) === -1;
});

console.log(numArray[0]);
console.log(numArray[1]);
//indexof는 문자만 찾음
