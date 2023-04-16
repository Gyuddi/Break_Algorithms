let num = 5;

let arr = [
  [2, 7],
  [1, 3],
  [1, 2],
  [2, 5],
  [3, 6],
];

arr.sort((a, b) => {
  if (a[0] === b[0]) return a[1] - b[1];
  else {
    return a[0] - b[0];
  }
});

console.log(arr);

//좌표정렬
// [Solved✌🏻]낙준_좌표정렬
