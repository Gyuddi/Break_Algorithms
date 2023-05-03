let num = 5;
let arr = [
  [14, 18],
  [12, 15],
  [15, 20],
  [20, 30],
  [5, 16],
];

let answer = Number.MIN_SAFE_INTEGER;

let T_arr = [];

for (let el of arr) {
  T_arr.push([el[0], "s"]);
  T_arr.push([el[1], "e"]);
}

T_arr.sort((a, b) => {
  if (a[0] === b[0]) return a[1].charCodeAt() - b[1].charCodeAt(); // 기억할 것
  else return a[0] - b[0];
});
let cnt = 0;

for (let el of T_arr) {
  if (el[1] === "s") cnt++;
  else cnt--;

  answer = Math.max(answer, cnt);
}
console.log(answer);
console.log("a".charCodeAt(), "s".charCodeAt());

//결혼식 그리디 알고리즘
// [Solved✌🏻]낙준_결혼식
