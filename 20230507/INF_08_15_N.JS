let arr = [2, 4, 5, 8, 12];

function solution(N, M, ARR, SUM) {
  let answer = 0;
  let tmp = Array.from({ length: M }, () => 0);
  function DFS(l, n, s) {
    if (l === M) {
      if (s % SUM === 0) answer++;
      console.log(s, tmp);
    } else {
      for (let i = n; i < N; i++) {
        //0부터 시작해서 N을 포함 x
        tmp[l] = ARR[i];
        DFS(l + 1, i + 1, s + ARR[i]);
      }
    }
  }

  DFS(0, 0, 0); //level, index, sum
  console.log(answer);
}

solution(5, 3, arr, 6); //정수의 갯수, 뽑는 횟수, 배열, 합
//조합의 총 합이 6으로 나눠지는 수의 갯수를 구하여라!

//합을 따로 구하는 것이 아니라 미리 구하면서 한다.
//[Solved✌🏻]낙준_수들의 조합
