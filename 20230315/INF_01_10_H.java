import java.util.Scanner;

public class INF_01_10_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        char t = sc.next().charAt(0);
        int[] arr = new int[S.length()];
        int tmp = 100;
        // 앞에서 뒤로 t와의 거리 계산
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == t) tmp = 0;
            arr[i] = tmp;
            tmp ++;
        }
        tmp = 100;
        // 뒤에서 앞으로 t와의 거리 계산 후 갱신
        for (int i = S.length()-1; i >= 0; i--) {
            if (S.charAt(i) == t) tmp = 0;
            if (arr[i] > tmp)arr[i] = tmp;
            tmp ++;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
