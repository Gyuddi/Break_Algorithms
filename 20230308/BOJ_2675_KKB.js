let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");
let result = "";
let total = input[0];

for (let i = 1; i <= total; i++) {
  let result = "";
  let inputResult = input[i].split(" ");
  let num = inputResult[0];
  let str = inputResult[1].split("");
  for (let j = 0; j < str.length; j++) {
    for (let k = 0; k < num; k++) {
      result = result + str[j];
    }
  }
  console.log(result);
}
