// let arr = [
//   [1, 4],
//   [2, 3],
//   [3, 5],
//   [4, 6],
//   [5, 7],
// ];

let arr = [
  [1, 3],
  [3, 3],
  [2, 3],
];
let answer = 0;

arr.sort((a, b) => {
  if (a[1] === b[1]) return a[0] - b[0];
  else return a[1] - b[1];
});

let et = 0;

for (let el of arr) {
  if (el[0] >= et) {
    answer++;
    et = el[1];
  }
}

console.log(answer);

//자료실 배정
// [Solved✌🏻]낙준_자료실 배정
//학습 시키는게 중요하다
