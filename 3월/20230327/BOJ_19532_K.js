let fs = require("fs");
let input = fs.readFileSync("/dev/stdin").toString().trim().split("\n");

let [a, b, c, d, e, f] = input[0].split(" ").map(Number);

for(let i=-999; i<=999; i++) {
  for(let j=-999; j<=999; j++) {
    if(a*i+b*j===c && d*i+e*j===f){
      console.log(i,j)
      break;
    }
  }
}

// 실패한 로직
// let firstArr = given.slice(0,3)
// let secondArr = given.slice(3,6)
// let newArr = []
// let resultX
// let resultY

// // console.log(given)
// // console.log(firstArr)
// // console.log(secondArr)

// let firstX = given[0]
// let secondX = given[3]

// // console.log(firstX)
// // console.log(secondX)

// newFirstArr = firstArr.map((x)=>x*secondX)
// // console.log(newFirstArr)

// newSecondArr = secondArr.map((x)=>x*firstX)
// // console.log(newSecondArr)

// for(let i =0; i<newFirstArr.length; i++) {
//   newArr.push(newFirstArr[i] - newSecondArr[i])
// }
// // console.log(newFirstArr.length)
// // console.log("newArr : ",newArr)

// resultY = newArr[2] / newArr[1]


// // console.log(firstArr)
// resultX = (firstArr[2] - (firstArr[1]*resultY)) / firstArr[0]
// console.log(resultX)
// console.log(resultY)
