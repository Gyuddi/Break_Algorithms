import java.util.Scanner;

public class INF_01_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] arr = S.split(" ");
        int max = 0;
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > max) {
                max = arr[i].length();
                answer = i;
            }
        }
        System.out.println(arr[answer]);
    }
}
