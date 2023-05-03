let arr = [81, 58, 42, 33, 61];
let weight = 259;

function solution(w, arr) {
  let answer = Number.MIN_SAFE_INTEGER;
  let length = arr.length;

  function DFS(n, s) {
    if (s > w) return;
    if (length === n) {
      answer = Math.max(s, answer);
    } else {
      DFS(n + 1, s + arr[n]);
      DFS(n + 1, s);
    }
  }
  DFS(0, 0);
  console.log(answer);
}

solution(259, arr);


// [Solved✌🏻]낙준_바둑이 승차
