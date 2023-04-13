let a = "CBA";
let b = "CABDGE";

console.log(solution(a, b));

function solution(a, b) {
  let need = a.split("");
  let queue = b.split("");

  for (let i of queue) {
    if (need.includes(i)) {
      if (i !== need.shift()) return "NO"; //복습
    }
  }
  if (need.length > 0) return "NO";
  return "YES";
}
