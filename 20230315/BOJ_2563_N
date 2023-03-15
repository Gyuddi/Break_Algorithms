const input = require("fs")
  .readFileSync("20230315/example10.txt")
  .toString()
  .trim()
  .split("\n");

const n = input[0];
let ans = 0;
let arr = Array.from(Array(100), () => Array(100).fill(0));
console.log(arr.length);
for (t = 1; t <= n; t++) {
  const tmp = input[t].split(" ").map((i) => parseInt(i));
  console.log(tmp);
  let r = tmp[0];
  let c = tmp[1];
  for (i = r; i < r + 10; i++) {
    for (j = c; j < c + 10; j++) {
      arr[i][j] += 1;
      if (arr[i][j] == 1) ans++;
      //   if (++arr[i][j] == 1) ans++;
    }
  }
}
console.log(ans);
