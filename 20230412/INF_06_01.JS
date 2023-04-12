const input = require("fs")
  .readFileSync("20230412/example.txt")
  .toString()
  .trim()
  .split("\n"); //  .split(/\s+/)
const log = console.log;
log(input);
let check = true;
let answer = "YES";
stack = [];
for (let x of input[0]) {
  if (x === "(") stack.push(x);
  else {
    if (stack.length === 0) check = false;
    stack.pop();
  }
}
log(stack);
if (stack.length > 0) log("NO");
else if (check) log("YES");
else log("NO");
//가정 넣고 확인
//확인하고 넣기
