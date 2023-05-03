let num = 8;
let array = [1, 2, 3, -3, -2, 5, 6, -6];

for (let i = 0; i < num - 1; i++) {
  for (let j = 0; j < num - 1 - i; j++) {
    if (array[j] > 0 && array[j + 1] < 0) {
      [array[j], array[j + 1]] = [array[j + 1], array[j]];
    }
  }
}
console.log(array);

//Special Sort
// [Solved✌🏻]낙준_특별정렬
