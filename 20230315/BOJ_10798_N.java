let input = require("fs")
  .readFileSync("20230315/example9.txt")
  .toString()
  .trim()
  .split("\n");



// indexof는 문자열만 찾는다. 그리고 일반 숫자는 +1
// let result = new Array(input.length).fill([]);
//같은 주소로 만들어짐?
let inputArray = [];
let result = "";
for (let i = 0; i < input.length; i++) {
  inputArray[i] = input[i].split("");
}

let lengthMax = Math.max(
  ...input.map((el) => {
    return el.length;
  })
);
console.log(lengthMax);
console.log(inputArray);
for (let i = 0; i < lengthMax; i++) {
  for (let j = 0; j < inputArray.length; j++) {
    result += input[j][i] || "";
  }
}
console.log(result);
