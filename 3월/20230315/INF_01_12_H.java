import java.util.Scanner;

public class INF_01_12_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        String[] arr = new String[S.length()/7];
        for (int i = 0; i < N; i++) {
            arr[i] = S.substring(i*7,(i+1)*7);
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i].replace('#','1');
            arr[i] = arr[i].replace('*','0');

            answer.append((char) Integer.parseInt(arr[i], 2));
        }
        System.out.println( answer);
    }
}
