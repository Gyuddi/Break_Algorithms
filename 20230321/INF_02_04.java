import java.util.Scanner;

public class INF_02_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[46];
        arr[1] = 1;
        arr[2] = 1;
        System.out.print(1 + " " + 1 + " ");
        for (int i = 3; i <= N; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.print(arr[i]+ " ");
        }
    }
}
