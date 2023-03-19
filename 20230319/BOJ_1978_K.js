let fs = require("fs");
let input = fs.readFileSync("test.txt").toString().trim().split("\n");

let num = input[0];
let given = input[1].split(" ");
let count = 0;

for (let i = 0; i < num; i++) {
  let check = true;
  if (Number(given[i]) === 1) check = false;
  for (let j = 2; j <= Math.floor(Math.sqrt(given[i])); j++) {
    if (given[i] % j === 0) {
      check = false;
      break;
    }
  }
  if (check) count++;
}

console.log(count);
