let num = 3;

function solution(num) {
  function DFS(N) {
    if (N === 0) return;
    else {
      console.log(N);
      DFS(N - 1);
      console.log(N);
    }
  }

  DFS(num);
}

solution(num);

//[Solved✌🏻]낙준_재귀함수와 스택프레임
