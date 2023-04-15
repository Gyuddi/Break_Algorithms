import java.util.Arrays;
import java.util.Scanner;

public class BOJ_10809_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int[] arr = new int[26];
        Arrays.fill(arr, -1);
        for (int i = 0; i < S.length(); i++) {
            int a = S.charAt(i)-'a';
            if (arr[a] == -1) arr[a]= i;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
