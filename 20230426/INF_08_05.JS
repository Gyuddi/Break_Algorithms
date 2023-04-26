let arr = [1, 3, 5, 6, 7, 10];

function solution(arr) {
  let total = arr.reduce((a, b) => a + b, 0);
  let answer = "NO";
  let num = arr.length;
  let flag = 0;
  function DFS(l, sum) {
    if (flag) return;
    if (l === num) {
      if (total - sum === sum) {
        answer = "YES";
        flag = 1;
      }
    } else {
      DFS(l + 1, sum + arr[l]);
      DFS(l + 1, sum);
    }
  }
  DFS(0, 0); //틀림

  return answer;
}

console.log(solution(arr));

// [Solved✌🏻]낙준 합이 같은 부분집합
