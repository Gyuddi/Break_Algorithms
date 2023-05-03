let num = 6;
let array = [13, 5, 11, 7, 23, 15];

//삽입 정렬도 가능

for (let i = 0; i < num - 1; i++) {
  for (let j = 0; j < num - 1 - i; j++) {
    if (array[j] > array[j + 1]) {
      [array[j], array[j + 1]] = [array[j + 1], array[j]];
    }
  }
}

console.log(array);
//버블정렬  여러번 바꾸면 성능이 떨어진다~

//어떤 경우에 보내는지 잘생각하자
// [Solved✌🏻]낙준_버블정렬
