let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let num = input[0];
let given = input[1].split(" ");
let max = Number(given[0]);
let min = Number(given[0]);

for (let i = 0; i < num; i++) {
  if (max < Number(given[i])) {
    max = given[i];
  }
  if (min > Number(given[i])) {
    min = given[i];
  }
}
console.log(min + " " + max);
