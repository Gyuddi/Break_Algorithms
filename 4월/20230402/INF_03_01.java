import java.util.ArrayList;
import java.util.Scanner;

public class INF_03_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arrA = new int[N];
        for (int i = 0; i < N; i++) {
            arrA[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] arrB = new int[M];
        for (int i = 0; i < M; i++) {
            arrB[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        while (p1 < N && p2 < M) {
            if (arrA[p1] > arrB[p2]) {
                list.add(arrB[p2]);
                p2++;
            } else {
                list.add(arrA[p1]);
                p1++;
            }
        }
        if (p1 < N)
            for (int i = p1; i < N; i++) {
            list.add(arrA[i]);
        }
        else {
            for (int i = p2; i < M; i++) {
                list.add(arrB[i]);
            }
        }
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
