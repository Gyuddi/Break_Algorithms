import java.util.Scanner;

public class INF_06_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        insertion_sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static void insertion_sort(int[] a, int size) {
        for(int i = 1; i < size; i++) {
            int target = a[i];
            int j = i - 1;
            while(j >= 0 && target < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = target;
        }
    }
}