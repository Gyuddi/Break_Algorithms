var input = require("fs")
  .readFileSync("20230309/example.txt")
  .toString()
  .split("\n");

for (let i = 1; i <= input[0]; i++) {
  //단어부터 출력
  let word = input[i].split(" ");

  word = word.map((alphabet) => {
    return alphabet.split("").reverse().join("");
  });
  console.log(word.join(" "));
}
