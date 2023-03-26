let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let given = input[0]
let num = input[0].length
let toggle = true

minGiven = given - (9*num)


for(let i = Number(minGiven); i<Number(given); i++) {
  let newGiven = i;
  let sum = 0;

  for(let i =0; i<num; i++) {
    sum += newGiven % 10
    newGiven = Math.floor(newGiven / 10)
  }
  
  // 실패한 로직
  //   while(newGiven) {
  //     sum += newGiven % 10
  //     newGiven = Math.floor(newGiven / 10)
  //     console.log(i, sum, newGiven)
  // }
  
  if (Number(given) === i + sum) {
    console.log(i)
    toggle = false
    break;
  }
}

if(toggle) console.log(0)
