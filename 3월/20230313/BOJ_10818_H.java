import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class BOJ_10818_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println(arr.get(0)+" "+arr.get(arr.size()-1));
    }
}
