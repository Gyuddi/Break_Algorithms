let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let num = input[0];

for (let i = 1; i <= num; i++) {
  let result = "";
  let str = input[i].split(" ");
  for (let j = 0; j < str.length; j++) {
    let newNum = str[j].split("");
    let revStr = newNum.reverse().join("");
    result = result + " " + revStr;
  }
  console.log(result.slice(1));
}
