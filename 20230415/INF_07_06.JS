let num = 6;

let arr = [120, 130, 150, 150, 130, 150];

let answer = [];
let sortArr = arr.slice().sort((a, b) => a - b);
for (let i = 0; i < num; i++) {
  if (arr[i] !== sortArr[i]) {
    answer.push(i + 1);
  }
}

console.log(answer);

// [Solved✌🏻]낙준_장난꾸러기 현수
