function solution(N, M) {
  let tmp = Array.from({ length: M }, () => 0);
  let answer = [];
  function DFS(n, m) {
    if (n === M) {
      answer.push(tmp.slice());
    } else {
      for (let i = m; i <= N; i++) {
        tmp[n] = i;
        DFS(n + 1, i + 1);
      }
    }
  }
  DFS(0, 1); //첫번째 인자는 횟수 두번째 인자는 시작하는 수를 의미함
  for (let i = 0; i < answer.length; i++) {
    console.log(answer[i]);
  }
}

solution(4, 2);
//[Solved✌🏻]낙준_조합 구하기
