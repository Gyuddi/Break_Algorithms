import java.util.Scanner;

public class BOJ_1436_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        int num = 665;
        while (count < N){
            num++;
            if (String.valueOf(num).contains("666")) count++;
        }
        System.out.println(num);
    }
}
