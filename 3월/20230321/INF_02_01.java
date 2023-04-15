import java.util.Scanner;

public class INF_02_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int tmp = 0;
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            if (a > tmp) System.out.print(a+ " ");
            tmp = a;
        }
    }
}
