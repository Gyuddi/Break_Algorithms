const input = require("fs")
  .readFileSync("20230319/example3.txt")
  .toString()
  .trim()
  .split("\n");

let num = Number(input[0]);
var i = 2;
var primes = [];
while (true) {
  if (num % i === 0) {
    num = num / i;
    primes.push(i);
    i = 1;
  }
  i++;
  if (i > num) {
    break;
  }
}

console.log(primes.join("\n"));

// let isPrimaArray = [];
// let result = [];
// for (let j = 2; j < Math.floor(num / 2); j++) {
//   let isPrima = true;
//   for (let i = 2; i <= Math.floor(Math.sqrt(j)); i++) {
//     if (j % i === 0) {
//       isPrima = false;
//       break;
//     }
//   } //소수 거름

//   if (isPrima) {
//     isPrimaArray.push(j);
//   }
// }

// while (num !== 1) {
//   if (num % isPrimaArray[0] !== 0) {
//     isPrimaArray.shift();
//   } else {
//     num = num / isPrimaArray[0];

//     result.push(isPrimaArray[0]);
//   }
// }

// for (let i of result) {
//   console.log(i);
// }

// 36/2 18/2 9
// 18/2 9
// 9/2 4...1
