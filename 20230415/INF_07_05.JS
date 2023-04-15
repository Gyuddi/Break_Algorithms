let [size, num] = [5, 9];
let arr = [1, 2, 3, 2, 6, 2, 3, 5, 7, 9, 10, 11, 12, 13];

let answer = Array.from({ length: size }, () => 0);

arr.forEach((x) => {
  let idx = -1;
  for (let i = size - 1; i >= 0; i--) {
    if (x === answer[i]) idx = i;
  }

  if (idx === -1) {
    // for (let i = size - 1; i >= 1; i--) {
    //   answer[i] = answer[i - 1];
    // }

    // answer[0] = x;
    answer.unshift(x);
    answer.pop();
  } else {
    // for (let i = idx; i >= 1; i--) {
    //   answer[i] = answer[i - 1];
    // }

    // answer[0] = x;
    answer.splice(idx, 1);
    answer.unshift(x);
  }
});
console.log(answer);


// [Solved✌🏻]낙준_LRU(카카오 캐시 변형 : 삽입정렬응용)
