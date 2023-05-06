function solution(N, SUM) {
  let dy = Array.from(Array(N + 1), () => Array(N + 1).fill(0));
  let b = Array.from({ length: N }, () => 0);
  let answer;
  let ch = Array.from({ length: N + 1 }, () => 0);
  let a = Array.from({ length: N }, () => 0);
  function combi(n, r) {
    // nCr의 n을 고정하고 r의 값들을 차례대로 구함
    //조합 메모이제이션
    if (dy[n][r] > 0) return dy[n][r];
    if (n === r || r === 0) {
      return 1;
    } else {
      return (dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r));
    }
  }
  let flag = 0;
  function DFS(n, sum) {
    //순열
    if (flag) return;
    if (n === N && sum === SUM) {
      answer = a.slice();
      flag = 1;
    } else {
      for (let i = 1; i <= N; i++) {
        if (ch[i] === 0) {
          ch[i] = 1;
          a[n] = i;
          DFS(n + 1, sum + i * b[n]);
          ch[i] = 0;
        }
      }
    }
  }

  for (let i = 0; i < N; i++) {
    b[i] = combi(N - 1, i); // 4개면 3C0부터 시작임
  }

  DFS(0, 0); //주의

  return answer;
}

console.log(solution(4, 16));
console.log("하이");

// [Solved✌🏻] 낙준_수열 추측하기(순열, 이항계수)
