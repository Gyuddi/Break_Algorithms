let ps = [10, 25, 15, 6, 7]; // 점수
let pt = [5, 12, 8, 3, 4]; //걸리는 시간
let num = 5;
let time = 20;
function solution(ps, pt, time) {
  let answer = Number.MIN_SAFE_INTEGER;
  let M = ps.length;

  function DFS(L, sum, t) {
    if (t > time) return;
    if (L === M) {
      answer = Math.max(answer, sum);
    } else {
      DFS(L + 1, sum + ps[L], t + pt[L]);
      DFS(L + 1, sum, t);
    }
  }
  DFS(0, 0, 0);
  console.log(answer);
}

solution(ps, pt, time);

//[Solved✌🏻]최대점수 구하기
