const input = require("fs")
  .readFileSync("20230403/example.txt")
  .toString()
  .trim()
  .split("\n");

let num1 = Number(input[0]);
let num2 = Number(input[2]);
let first = input[1].split(" ").map(Number);
let second = input[3].split(" ").map(Number);
let result = [];
// let result = [...first, ...second];

let j = 0;
let i = 0;

while (true) {
  if (num1 - 1 === i || num2 - 1 === j) {
    result = [...result, ...first.slice(i), ...second.slice(j)];
    break;
  }

  if (first[i] < second[j]) {
    result.push(first[i]);

    i++;
  } else {
    result.push(second[j]);

    j++;
  }
  console.log(first[i], second[j], result);
}
console.log(result);
// console.log(result.sort((a, b) => a - b));

