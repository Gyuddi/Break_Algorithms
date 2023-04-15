import java.util.Scanner;

public class INF_01_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            reverse(sc.next());
        }
    }
    private static void reverse(String str){
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    }
}
