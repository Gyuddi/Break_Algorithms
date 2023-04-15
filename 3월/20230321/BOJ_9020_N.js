const input = require("fs")
  .readFileSync("20230321/example.txt")
  .toString()
  .trim()
  .split("\n")
  .map(Number);
input.shift();

console.log(input);
const MAX = Math.max(...input);
const answer = [];

//배열 생성하고 차후 소수를 판별 위해 트루로 채워줌
let prime = new Array(MAX + 1).fill(true);

//소수와 아닌수를 구한다.
for (let i = 2; i * i <= MAX + 1; i++) {
  for (let j = i * i; j <= MAX + 1; j += i) {
    prime[j] = false;
  }
} //에라토스네의 체

input.forEach((v) => {
  for (let i = Math.ceil(v / 2); i > 1; i--) {
    if (prime[i] && prime[v - i]) {
      console.log(i, v - i);
      //소수로만 이루어진 쌍을 찾기위함, 골드바흐의 파티션을 이루는 수를 찾기 위함
      answer.push(`${i} ${v - i}`);
      break;
    }
  }
});

console.log(answer.join("\n"));

//소수를 구한다

// 확인한다.

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java

//~보다 작은 소수를 구한다.
// 더했을 때 구하기 위해서
// 빼본다?
// 혹은

// 3 5

// 3 7
// 5 11
