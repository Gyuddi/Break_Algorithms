function solution(N, R) {
  let dy = Array.from(Array(N + 1), () => Array(R + 1).fill(0)); //최대 범위 중요

  function DFS(n, r) {
    if (dy[n][r]) return dy[n][r];
    if (n === r || r === 0) {
      return 1;
    } else {
      return (dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r));
    }
  }

  return DFS(N, R);
}

console.log(solution(5, 3));

//[Solved✌🏻] 낙준_조합수(메모이제이션)
