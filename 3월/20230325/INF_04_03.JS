const input = require("fs")
  .readFileSync("20230324/example3.txt")
  .toString()
  .trim()
  .split("\n");

let people = input[0].split(" ").map(Number);
let num = people[1];
people = people[0];
let numArray = [];
for (let i = 1; i < people; i++) {
  numArray[i - 1] = input[i].split(" ").map(Number);
}

let counting = 0;
let countArray = [];

for (let i = 1; i <= people; i++) {
  //사람 순회
  for (let j = 1; j <= people; j++) {
    let count = 0;
    for (let k = 0; k < num; k++) {
      //박스 순회
      let first = 0;
      let second = 0;
      for (let s = 0; s < people; s++) {
        if (numArray[k][s] === i) {
          first = s;
        }
        if (numArray[k][s] === j) {
          second = s;
        }
      }
      if (first < second) {
        count++;
      }
    }
    if (count === num) {
      counting++;
      countArray.push(i, j);
    }
  }
}

console.log(counting, countArray);

// [3,4,1,2]

// 3 0

// 2 3

//먼저 첫번째 배열에 가장 첫번째 숫자를 찾는다.
//replace로 삭제

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java

//43
//42
//41
//32
//31
//21
//16개 다하는 이유는 무엇이 크다고 가젖ㅇ하고 풀수 없고,
//if문을 써서 거르는 것보다 더 시간 복잡도가 좋기 때문이다.
