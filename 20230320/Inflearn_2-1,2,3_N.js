//1번

let input = require("fs")
  .readFileSync("20230319/Inflearn/example.txt")
  .toString()
  .trim()
  .split("\n");

input = input[0].split(" ").map(Number);
let result = [];
result.push(input[0]);

for (let i = 1; i < input.length; i++) {
  if (input[i] > input[i - 1]) {
    result.push(input[i]);
  }
}
console.log(result.join(" "));

//앞뒤 비교하고 결과값을 남긴다.

//2번
const input = require("fs")
  .readFileSync("20230319/Inflearn/example2.txt")
  .toString()
  .trim()
  .split("\n");

let num = Number(input[0]);
let numArray = input.splice(1)[0].split(" ").map(Number);
let max = numArray[0];
let count = 1;

for (let i = 1; i < numArray.length; i++) {
  if (numArray[i] > max) {
    max = numArray[i];
    count++;
  }
}
console.log(count);

//3번

const input = require("fs")
  .readFileSync("20230319/Inflearn/example3.txt")
  .toString()
  .trim()
  .split("\n");

let first = input.slice(1, 2)[0].split(" ").map(Number);
let second = input.slice(2)[0].split(" ").map(Number);

let result = [];

for (let i = 0; i < input[0]; i++) {
  if (first[i] === second[i]) {
    result[i] = "D";
  } else if (first[i] === 2 && second[i] === 1) {
    result[i] = "A";
  } else if (first[i] === 3 && second[i] === 2) {
    result[i] = "A";
  } else if (first[i] === 1 && second[i] === 3) {
    result[i] = "A";
  } else {
    result[i] = "B";
  }
  console.log(result[i]);
}
