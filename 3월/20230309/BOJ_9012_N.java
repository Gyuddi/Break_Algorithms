var input = require("fs")
  .readFileSync("20230309/9012.txt")
  .toString()
  .split("\n");

let result = true;

for (let i = 1; i <= input[0]; i++) {
  result = true;
  if (input[i].length % 2 === 1) {
    result = false;
  }

  if (result) {
    while (input[i].indexOf("()") !== -1) {
      input[i] = input[i].replace("()", "");
    }
    if (input[i].length > 0) {
      result = false;
    }
  }
  if (result) {
    result = "YES";
  } else {
    result = "NO";
  }

  console.log(result);
}
