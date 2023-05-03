const input = require("fs")
  .readFileSync("20230409/example7.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);

let obj = new Map();

for (let el of input[0]) {
  if (obj.has(el)) {
    obj.set(el, obj.get(el) + 1);
  } else {
    obj.set(el, 1);
  }
}

for (let el of input[1]) {
  if (!obj.has(el) || obj.get(el) === 0) {
    log("NO");
    return;
  } else {
    obj.set(el, obj.get(el) - 1);
  }
}

log("YES");
// '/dev/stdin'
// [Solved✌🏻]낙준_최대, 최소

// BOJ_10818_N.java
