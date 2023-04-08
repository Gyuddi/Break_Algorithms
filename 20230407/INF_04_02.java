import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class INF_04_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr1 = sc.next().split("");
        String[] arr2 = sc.next().split("");
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        HashMap<String, Integer> hashMap2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            hashMap1.put(arr1[i], hashMap1.getOrDefault(arr1[i], 0) + 1);
            hashMap2.put(arr2[i], hashMap2.getOrDefault(arr2[i], 0) + 1);
        }

        boolean answer = true;

        for (String s: hashMap1.keySet()) {
            if (!hashMap2.containsKey(s)) {
                answer = false;
                break;
            }
        }
        if (answer){
            for (String s: hashMap1.keySet()) {
                if (!Objects.equals(hashMap1.get(s), hashMap2.get(s))){
                    answer = false;
                    break;
                }
            }
        }
        if (answer) System.out.println("YES");
        else System.out.println("NO");
    }
}
