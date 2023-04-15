var input = require("fs")
  .readFileSync("20230319/example2.txt")
  .toString()
  .trim()
  .split("\n");

let num = Number(input.shift());

let numArray = input[0].split(" ").map(Number);

let count = new Array(num).fill(true);

// 1부터 찾기
// 2, 3, 5,7
//짝수 거르기

for (let i = 0; i < numArray.length; i++) {
  let num = numArray[i];
  if (num === 1) {
    count[i] = false;
    continue;
  }

  for (let j = 2; j <= Math.floor(Math.sqrt(num)); j++) {
    if (num % j === 0) {
      count[i] = false;
      break;
    }
  }

}

console.log(count.filter((e) => e).length);
