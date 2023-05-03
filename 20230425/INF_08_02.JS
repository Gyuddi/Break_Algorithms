let num = 11;
let answer = "";

function solution(n) {
  function DFS(num) {
    if (num === 0) return;
    else {
      DFS(parseInt(num / 2));
      answer += String(num % 2);
    }
  }
  DFS(n);
}
solution(num);
console.log(answer);

// 11 /2 = 5...1
// 5 /2 = 2...1
// 2 /2 = 1...0
// 1 /2 = 0...1
// 1011 거꾸로 올라간다.

//[Solved✌🏻]낙준_이진수 출력
