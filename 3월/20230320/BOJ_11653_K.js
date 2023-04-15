let fs = require("fs");
let input = fs.readFileSync("test.txt").toString().trim().split("\n");

let given = input[0].split(" ");
let i = 2;
let arr = [];

while (true) {
  if (given % i === 0) {
    given = given / i;
    arr.push(i);
    i = 1;
  }
  i++;

  if (i > given) {
    break;
  }
}

console.log(arr.join("\n"));

// 시간 초과된 나의 방법
// 소수를 구한 후 그 숫자로 나누었다.

// let given = input[0].split(" ");
// let arr = [];

// for (let i = 2; i < Math.floor(given / 2); i++) {
//   let toggle = true;
//   for (let j = 2; j < Math.floor(Math.sqrt(i)); j++) {
//     if (i % j === 0) {
//       toggle = false;
//       break;
//     }
//   }
//   if (toggle) arr.push(i);
// }

// while (given !== 1) {
//   for (let i = 0; i < arr.length; i++) {
//     if (given % arr[i] === 0) {
//       given = given / arr[i];
//       console.log(arr[i]);
//       break;
//     }
//   }
// }
