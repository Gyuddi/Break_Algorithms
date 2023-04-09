const input = require("fs")
  .readFileSync("20230409/example2.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);
let num = input[0].split(" ").map(Number);

num = num[1];

let numArray = input[1].split(" ").map(Number);

let left = 0;
let sum = 0;
let answer = 0;

for (let right = 0; right < numArray.length; right++) {
  sum += numArray[right];
  if (sum === num) {
    answer++;
  }

  while (sum >= num) {
    sum -= numArray[left++];
    if (sum === num) answer++;
  }
}
log(answer);
