var input = require("fs")
  .readFileSync("20230315/example.txt")
  .toString()
  .split("\n");

let num = input[0].split(" ")[1];

let numArray = input[1].split(" ");
numArray = numArray.filter((el) => {
  return num > Number(el);
});
console.log(numArray.join(" "));

//숫자가 스트링으로 인지되었음 주의 할것
