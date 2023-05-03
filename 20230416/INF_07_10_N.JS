let arr = [23, 87, 65, 12, 57, 32, 99, 81];
let lt = 0;
let rt = arr.length - 1;
let target = 32;
arr.sort((a, b) => a - b);

while (lt <= rt) {
  let mid = parseInt((lt + rt) / 2);
  if (arr[mid] === target) {
    console.log(mid + 1);
    break;
  } else if (arr[mid] > target) {
    rt = mid - 1;
  } else {
    lt = mid + 1;
  }
}

//이분검색
// [Solved✌🏻]낙준_이분검색
