import java.util.HashMap;
import java.util.Scanner;

public class INF_04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N  = sc.nextInt();
        String[] arr = sc.next().split("");
        HashMap<String,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < N; i++) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i], 0) + 1);
        }
        int max = 0;
        String answer = "";
        for (String s : hashMap.keySet()) {
            if (hashMap.get(s) > max) {
                max = hashMap.get(s);
                answer = s;
            }
        }
        System.out.println(answer);
    }
}
