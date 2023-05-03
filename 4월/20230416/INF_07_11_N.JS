let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
let num = 3;

function count(arr, mid) {
  let cnt = 1;
  let sum = 0;

  for (let x of arr) {
    if (sum + x > mid) {
      //더하기전에 확인함
      cnt++;
      sum = x;
    } else {
      sum += x;
    }
  }

  return cnt;
}

function solution(arr, m) {
  let answer = 0;
  let lt = Math.max(...arr);
  let rt = arr.reduce((a, b) => a + b, 0);
  while (lt <= rt) {
    let mid = parseInt((lt + rt) / 2);
    if (count(arr, mid) <= m) {
      answer = mid;
      rt = mid - 1;
    } else {
      lt = mid + 1;
    }
  }

  return answer;
}

console.log(solution(arr, num));

//많은 장수가 나온다는 것은 시간이 너무 적어서 늘려ㅑ줘야함
//적은 장수가 나온다는 것은 시간이 너무 많아서 줄여줘야함

//parameter, argument 오류로 고생함

//함수 두개로 나눠 푸는거 기억할 것
//뮤직비디오
//[Solved✌🏻]낙준_뮤직비디오
