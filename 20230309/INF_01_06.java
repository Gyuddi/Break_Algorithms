import java.util.ArrayList;
import java.util.Scanner;

public class INF_01_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < S.length(); i++) {
            if (!list.contains(Character.toString(S.charAt(i)))) list.add(Character.toString(S.charAt(i)));
        }
        String answer = String.join("",list);
        System.out.println(answer);
    }
}
