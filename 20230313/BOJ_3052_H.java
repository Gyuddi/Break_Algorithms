import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BOJ_3052_H {
    public static void main(String[] args) {
        Integer[] arr = new Integer[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(arr));
        System.out.println(hashSet.size());
    }
}
