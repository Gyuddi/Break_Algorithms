import java.util.Scanner;

public class BOJ_2566_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int max = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                int tmp = sc.nextInt();
                if (tmp > max){
                    max = tmp;
                    a = i;
                    b = j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a+1)+" "+(b+1));
    }
}
