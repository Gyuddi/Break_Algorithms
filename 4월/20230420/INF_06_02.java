import java.util.Scanner;

public class INF_06_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        bubble_sort(arr, arr.length);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
    private static void bubble_sort(int[] arr, int size) {

        for(int i = 1; i < size; i++) {
            for(int j = 0; j < size - i; j++) {
                if(arr[j] > arr [j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
    private static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
