let num = 6;
let arr = [11, 7, 5, 6, 10, 9];

for (let i = 0; i < num; i++) {
  let tmp = arr[i],
    j;
  for (j = i - 1; j >= 0; j--) {
    if (tmp < arr[j]) {
      arr[j + 1] = arr[j];
    } else break;
  }
  //마지막에 나갈때  --, ++ 가 적용이 됨
  // 그전까지는for밖을 생각하지 않았지만 for 밖을 나갈떄도 적용이 된다.

  arr[j + 1] = tmp;
}
console.log(arr);

//삽입정렬
// [Solved✌🏻]낙준_삽입정렬
