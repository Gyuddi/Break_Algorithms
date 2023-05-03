let arr = [3, 6, 9, 5];

function solution(m, arr) {
  let n = arr.length;
  let ch = Array.from({ length: n }, () => 0); // 체크
  let tmp = Array.from({ length: m }, () => 0); // 담을 공간
  let answer = [];
  function DFS(L) {
    if (L === m) {
      answer.push(tmp.slice());
    } else {
      for (let i = 0; i < n; i++) {
        if (ch[i] === 0) {
          ch[i] = 1;
          tmp[L] = arr[i];
          DFS(L + 1);
          ch[i] = 0;
        }
      }
    }
  }

  DFS(0);
  return answer;
}

console.log(solution(2, arr));
