import java.util.Scanner;

public class BOJ_2562_H {
    public static void main(String[] args) {
        int max = 0;
        int idx = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            int tmp = sc.nextInt();
            if (tmp > max){
                max = tmp;
                idx = i;
            }
        }
        System.out.println(max);
        System.out.println(idx+1);
    }
}
