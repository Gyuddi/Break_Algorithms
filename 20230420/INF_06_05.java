import java.util.*;

public class INF_06_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        if (arr.length == set.size()) System.out.println("U");
        else System.out.println("D");
    }
}
