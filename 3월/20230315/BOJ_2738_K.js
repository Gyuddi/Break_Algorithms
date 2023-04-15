let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let num = input[0].trim().split(" ");
let n = Number(num[0]);
let m = Number(num[1]);
let aArr = [];
let bArr = [];

for (let i = 0; i < input.length; i++) {
  aArr.push(input[i].trim().split(" "));
  bArr.push(input[i].trim().split(" "));
}

aArr.shift();
bArr.shift();

for (let i = 0; i < n; i++) {
  aArr.pop();
}

for (let i = 0; i < n; i++) {
  bArr.shift();
}

for (let i = 0; i < n; i++) {
  let arr = [];
  let result = "";
  for (let j = 0; j < m; j++) {
    arr.push(Number(aArr[i][j]) + Number(bArr[i][j]));
    result += arr[j] + " ";
  }
  console.log(result.substring(0, result.length - 1));
}
