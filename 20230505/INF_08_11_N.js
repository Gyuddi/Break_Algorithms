function solution(N) {
  let answer;

  function DFS(n) {
    if (n === 1) {
      return 1;
    } else {
      return n * DFS(n - 1);
    }
  }

  answer = DFS(N);
  return answer;
}

console.log(solution(5));

// [Solved✌🏻] 낙준_팩토리얼
