const input = require("fs")
  .readFileSync("20230409/example8.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);

let sWord = input[0];
let tWord = input[1];

let th = new Map();

for (let i of tWord) {
  if (th.has(i)) {
    th.set(i, th.get(i) + 1);
  } else {
    th.set(i, 1);
  }
}
let sh = new Map();

for (let i = 0; i < tWord.length - 1; i++) {
  if (sh.has(sWord[i])) {
    sh.set(sWord[i], sh.get(sWord[i]) + 1);
  } else {
    sh.set(sWord[i], 1);
  }
}

let lt = 0;
let answer = 0;

for (let rt = tWord.length - 1; rt < sWord.length; rt++) {
  if (sh.has(sWord[rt])) {
    sh.set(sWord[rt], sh.get(sWord[rt]) + 1);
  } else {
    sh.set(sWord[rt], 1);
  }
  if (compareHandler(sh, th)) answer++;

  sh.set(sWord[lt], sh.get(sWord[lt]) - 1);
  if (sh.get(sWord[lt]) === 0) sh.delete(sWord[lt]);
  lt++;
}

log(answer);

function compareHandler(sWord, tWord) {
  //지우지 않으면 사이즈에서 다 걸림
  if (sWord.size !== tWord.size) return false;
  for (let [key, val] of tWord) {
    // sword일 경우 지워지지 않는 경우는 x tword로 하는게 지워지지 않았을때보다 더 잘잡아냄
    if (!sWord.has(key)) return false;
    if (sWord.get(key) !== val) return false;
  }

  return true;
}

//비교를 먼저하고,
// 빼고 넣는다 -> 마지막에 넣는다.
// 빼고 넣고 비교한다.
// 마지막에 비교한다.

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
