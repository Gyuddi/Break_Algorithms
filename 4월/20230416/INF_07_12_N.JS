let horse = [1, 2, 8, 4, 9];

let count = 3;
horse.sort((a, b) => a - b);
let lt = 1;
let rt = horse[horse.length - 1];
let answer = 0;
while (lt <= rt) {
  let mid = parseInt((lt + rt) / 2); //사거리를 의미함
  if (checking(horse, mid) >= count) {
    //만약에 4마리면, 거리를 늘려줘야하고,
    //3마리인 경우에는 늘려줘야함 최대거리라서
    //만약에 2마리면, 거리를 줄여야한다.
    //목표는 3마리의 말을 배치해야하고,
    //거리가 최대어야함

    answer = mid;
    lt = mid + 1;
  } else {
    rt = mid - 1;
  }
}
console.log(answer);

function checking(arr, mid) {
  //거리에 따른 배치한 말의 수를 정의함
  let cnt = 1;
  let ef = arr[0];

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] - ef >= mid) {//텀이 더 클때는 넣어줘야함 
      cnt++;
      ef = arr[i];
    }//작을때는 흘려보낸다.
  }

  return cnt;
}

//마구간 정하기
//[Solved✌🏻]낙준_마구간 정하기
