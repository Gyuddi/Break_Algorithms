import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;

public class INF_04_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] S = sc.next().split("");
        String[] T = sc.next().split("");


        HashMap<String, Integer> hashMap1 = new HashMap<>();
        for (int i = 0; i < T.length; i++) {
            hashMap1.put(T[i], hashMap1.getOrDefault(T[i], 0)+1);
        }

        int count = 0;

        for (int i = 0; i <= S.length-T.length; i++) {
            HashMap<String, Integer> hashMap2 = new HashMap<>();
            String[] tmp = Arrays.copyOfRange(S, i, i + T.length);
            for (int j = 0; j < tmp.length; j++) {
                hashMap2.put(tmp[j], hashMap2.getOrDefault(tmp[j], 0)+1);
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
            if (answer) count ++;
        }
        System.out.println(count);
    }
}
