var input = require("fs")
  .readFileSync("20230315/example7.txt")
  .toString()
  .trim()
  .split("\n");

let result = [];

let numN = Number(input[0].split(" ")[0]);
let numM = Number(input[0].split(" ")[1]);
input.splice(0, 1);

let first = input.splice(0, numN);
//스플라이스는 마지막꺼 포함 안함

for (let i = 0; i < numN; i++) {
  first[i] = first[i].split(" ");
  input[i] = input[i].split(" ");

  for (let j = 0; j < numM; j++) {
    //각각 배열들을 하나씩 더해줌
    first[i][j] = Number(first[i][j]) + Number(input[i][j]);
  }
  console.log(first[i].join(" "));
}

//nxm
//n개의 줄게
//m개
//덧셈은 넘버에 주의할 것
