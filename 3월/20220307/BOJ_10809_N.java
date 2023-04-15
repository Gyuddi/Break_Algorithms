var input = require("fs")
  .readFileSync("20230307/example.txt")
  .toString()
  .split("\n");
const t0 = performance.now();
let word = input[0].split("");

const alphabet = "abcdefghijklmnopqrstuvwxyz";
const checkArray = new Array(26).fill(-1);

for (let i = 0; i < word.length; i++) {
  // i는 문자의 index값
  // 알파벳은 몇번째 순서에 들어가야할지 알려준다.
  if (checkArray[alphabet.indexOf(word[i])] === -1)
    checkArray[alphabet.indexOf(word[i])] = i;
}
const t1 = performance.now();
console.log(t1 - t0, "milliseconds");
console.log(checkArray.join(" "));
