import java.util.Scanner;

public class BOJ_11653_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        fac(N);
    }
    private static void fac(int N){
        while (N != 1){
            for (int i = 2; i <= N; i++) {
                if (N%i == 0){
                    System.out.println(i);
                    N = N/i;
                    break;
                }
            }
        }
    }
}
