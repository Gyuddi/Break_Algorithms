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

