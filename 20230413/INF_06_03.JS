let a = [
  [0, 0, 0, 0, 0],
  [0, 0, 1, 0, 3],
  [0, 2, 5, 0, 1],
  [4, 2, 4, 4, 2],
  [3, 5, 1, 3, 1],
];

let b = [1, 5, 3, 5, 1, 2, 1, 4];

let stack = [];
let answer = 0;
b.forEach((v) => {
  for (let i = 0; i < a.length; i++) {
    if (a[i][v - 1] !== 0) {
      let tmp = a[i][v - 1];
      a[i][v - 1] = 0;
      if (stack[stack.length - 1] === tmp) {
        stack.pop();
        answer += 2;
      } else stack.push(tmp);

      break;
    }
  }
});

console.log(answer);

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
