import java.util.Scanner;

public class INF_07_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        fibo(arr, 1, N);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void fibo(int[] arr, int point, int N) {
        if (point > N) return;
        if (point == 1) arr[point] = 1;
        else if (point == 2) arr[point] = 1;
        else {
            arr[point] = arr[point - 1] + arr[point - 2];
        }
        fibo(arr, point + 1, N);
    }
}
인프런 07-09번 뮤직비디오(결정알고리즘)
        인프런 07-10번 마구간 정하기(결정알고리즘)
