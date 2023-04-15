var input = require("fs")
  .readFileSync("20230315/example5.txt")
  .toString()
  .trim()
  .split("\n");


let result = [];

for (let i = 0; i < input.length; i++) {
  let remainder = input[i] % 42;
  if (result.indexOf(remainder) === -1) {
    result.push(remainder);
  }
}

console.log(result.length);

