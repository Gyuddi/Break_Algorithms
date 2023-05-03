import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class INF_03_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrA = new int[N];
        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }
        Arrays.sort(arrA);
        int M = sc.nextInt();
        int[] arrB = new int[M];
        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }
        Arrays.sort(arrB);

        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < N && p2 < M) {
            if (arrA[p1] == arrB[p2]) {
                list.add(arrA[p1]);
                p1++;
                p2++;
            } else if(arrA[p1] < arrB[p2]) {
                p1++;
            }else {
                p2++;
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}