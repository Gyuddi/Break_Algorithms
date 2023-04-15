let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let arr = Array.from(Array(9), () => new Array(9));
let max = -1;
let x = 0;
let y = 0;

for (let i = 0; i < 9; i++) {
  let given = input[i].split(" ");
  for (let j = 0; j < 9; j++) {
    arr[i][j] = Number(given[j]);
    if (max < arr[i][j]) {
      max = arr[i][j];
      x = i + 1;
      y = j + 1;
    }
  }
}

console.log(max);
console.log(x, y);
