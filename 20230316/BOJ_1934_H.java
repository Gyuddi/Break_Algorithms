import java.util.Scanner;

public class BOJ_1934_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println((a*b)/gcd(a,b));
        }
    }
    private static int gcd(int a,int b){
        if (b == 0) return a;
        return gcd(b, a%b);
    }
}
