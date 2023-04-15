import java.util.Scanner;

public class INF_01_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        change(S);
    }
    private static void change(String S){
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isUpperCase(S.charAt(i))) answer.append(Character.toLowerCase(S.charAt(i)));
            else answer.append(Character.toUpperCase(S.charAt(i)));
        }
        System.out.println(answer);
    }
}
