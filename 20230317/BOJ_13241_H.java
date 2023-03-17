import java.util.Scanner;

public class BOJ_13241_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        System.out.println((A*B)/gcd(A,B));
    }
    private static long gcd(long A, long B){
        if (B == 0) return A;
        return gcd(B,A%B);
    }
}
