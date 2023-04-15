var input = require("fs")
  .readFileSync("20230315/example3.txt")
  .toString()
  .split("\n");

console.log(Math.max(...input));
console.log(input.indexOf(String(Math.max(...input))) + 1);

