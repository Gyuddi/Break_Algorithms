var input = require("fs")
  .readFileSync("20230308/example.txt")
  .toString()
  .split("\n");

let answer = "";
let final = [];

for (let i = 0; i < input.length; i++) {
  //인풋 갯수만큼 돌림
  answer = ""; //초기화

  let result = input[i].split(" "); //문자와 숫자 분리
  if (!(result.length > 1)) continue; // 1개라면 삭제
  let word = result[1].split(""); // 문자 쪼개기
  for (
    let z = 0;
    z < word.length;
    z++ // 문자수만큼 돌림
  )
    answer = answer + word[z].repeat(result[0]); //문자 반복해서 넣어줌
  final.push(answer); // 배열에 넣기
}

console.log(final.join("\n"));
