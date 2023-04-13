let a = "352+*9-";
const log = console.log;
log(a);

let stack = [];

for (let i of a) {
  if (!isNaN(i)) stack.push(Number(i));
  else {
    let rt = stack.pop();
    let lt = stack.pop();
    if (i === "+") stack.push(lt + rt);
    else if (i === "-") stack.push(lt - rt);
    else if (i === "*") stack.push(lt * rt);
    else if (i === "/") stack.push(lt / rt);
  }
}

// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
