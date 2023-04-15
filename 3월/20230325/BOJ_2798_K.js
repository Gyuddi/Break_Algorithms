let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let num = input[0].split(" ");
let num1 = num[0];
let num2 = num[1];
let result = 0;
let max = Number.MIN_SAFE_INTEGER

let given = input[1].split(" ").map((i)=>Number(i));

for(let i =0; i< Number(num1); i++) {
  for(let j=i+1; j<Number(num1); j++) {
    for(let k=j+1; k<Number(num1); k++) {
      result = given[i] + given[j] +given[k];
      if(max<result) {
        if(result <= Number(num2))
        max = result;
      }
    }
  }
}

console.log(max)
