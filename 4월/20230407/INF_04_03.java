import java.util.*;

public class INF_04_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] arr = new Integer[N];  
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < K-1; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        int p1 = 0;
        for (int i = K-1; i < N; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
            System.out.print(hashMap.size()+" ");
            hashMap.put(arr[p1], hashMap.get(arr[p1])-1);
            if (hashMap.get(arr[p1]) == 0) hashMap.remove(arr[p1]);
            p1++;
        }
    }
    // 아니 왜 IDE에선 컴파일 에러 안나는데ㅠㅠㅠㅠ
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int K = sc.nextInt();
//        Integer[] arr = new Integer[N];
//        for (int i = 0; i < N; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i <= N - K; i++) {
//            Integer[] tmp = Arrays.copyOfRange(arr, i, i + K);
//            Set<Integer> set = new HashSet<>(List.of(tmp));
//            System.out.print(set.size() + " ");
//        }
//    }
}
