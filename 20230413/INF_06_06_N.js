let [n, k] = [8, 3];

let queue = Array.from({ length: n }, (n, v) => v + 1); //복습

while (queue.length) {
  for (let i = 1; i < k; i++) queue.push(queue.shift());
  queue.shift();
  if (queue.length === 1) console.log(queue.shift());
}
