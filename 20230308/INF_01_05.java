import java.util.ArrayList;
import java.util.Scanner;

public class INF_01_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String[] arr = S.split("");
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].matches("[^a-zA-Z0-9\\s]")) {
                arrayList.add(arr[i]);
                arr[i] = "-1";
            }
        }
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("-1")){
                answer.append(arrayList.get(arrayList.size()-1));
                arrayList.remove(arrayList.size()-1);
            }
            else answer.append(arr[i]);
        }
        System.out.println(answer);
    }
}
