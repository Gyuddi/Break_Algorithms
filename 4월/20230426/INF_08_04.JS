// let num = 3;

// function solution(v) {
//   let anwser = [];
//   let ch = Array.from({ length: v + 1 }, () => 0); //틀림

//   function DFS(s) {
//     if (s === v + 1) {
//       //틀림

//       let tmp = "";
//       for (let i = 1; i <= v; i++) {
//         if (ch[i] === 1) tmp += i + " ";
//       }

//       if (tmp.length > 0) anwser.push(tmp.trim());
//     } else {
//       console.log(s);
//       ch[s] = 1;
//       DFS(s + 1); //틀림
//       ch[s] = 0;
//       DFS(s + 1);
//     }
//   }

//   DFS(1); //틀림
//   console.log(anwser);
// }
// solution(num);

let num = 3;

function solution(num) {
  let ch = Array.from({ length: num + 1 }, () => 0);
  let anwser = [];

  function DFS(n) {
    if (n === num + 1) {
      let tmp = "";
      for (let i = 1; i <= num; i++) {
        if (ch[i] === 1) tmp += i + " ";
      }

      if (tmp.length > 0) anwser.push(tmp.trim());
    } else {
      ch[n] = 1;
      DFS(n + 1);
      ch[n] = 0;
      DFS(n + 1);
    }
  }
  DFS(1);
  return anwser;
}
console.log(solution(num));

//[Solved✌🏻]낙준 부분집합 구하기
