import java.util.Scanner;

public class BOJ_11653_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(true){
            boolean tmp = false;
            // 오름차순으로 출력해야 하기 때문에 break 후 for문을 처음부터 다시 돌린다.
            for (int i = 2; i <= num; i++) {
                if (num % i == 0){
                    System.out.println(i);
                    num = num/i;
                    tmp = true;
                    break;
                }
            }
            if (tmp == false){
                break;
            }
        }
    }
}
