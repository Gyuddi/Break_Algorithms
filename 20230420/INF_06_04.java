import java.util.*;

public class INF_06_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        for (int a: arr) {
            if (list.size() == S){
                if (!list.contains(a))  {
                    list.add(0, a);
                    list.remove(list.size()-1);
                }
                else {
                    list.remove(Integer.valueOf(a));
                    list.add(0, a);
                }
            }
            else {
                if (!list.contains(a))  {
                    list.add(0, a);
                }
                else {
                    list.remove(Integer.valueOf(a));
                    list.add(0, a);
                }
            }
        }
        for (int a: list) {
            System.out.print(a + " ");
        }
    }
}
