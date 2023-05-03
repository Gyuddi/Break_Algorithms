let arr = [1, 2, 5];

function solution(m, arr) {
  let n = arr.length;
  let answer = Number.MAX_SAFE_INTEGER;

  function DFS(L, sum) {
    if (sum > m) return;
    if (answer <= n) return;
    if (m === sum) {
      answer = Math.min(answer, L);
    } else {
      for (let i = 0; i < n; i++) {
        DFS(L + 1, sum + arr[i]);
      }
    }
  }
  DFS(0, 0);
  return answer;
}

console.log(solution(15, arr));
