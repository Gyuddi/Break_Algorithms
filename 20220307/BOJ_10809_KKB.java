let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim();

const alphabet = input.split("");
let result = "";

for (let i = 97; i <= 122; i++) {
  let num = alphabet.indexOf(String.fromCharCode(i));
  result = result + " " + num;
}

console.log(result.substring(1));
