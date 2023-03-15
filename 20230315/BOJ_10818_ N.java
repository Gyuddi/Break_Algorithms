var input = require("fs")
  .readFileSync("20230315/example2.txt")
  .toString()
  .split("\n");

let numArray = input[1].split(" ");

let min = numArray[0];

let max = numArray[0];

for (let i = 1; i < numArray.length; i++) {
  if (min > Number(numArray[i])) {
    min = numArray[i];
  } else if (max < Number(numArray[i])) {
    max = numArray[i];
  }
}
console.log(min, max);

//number로 값 변환해줄것
//length 쓸 것
