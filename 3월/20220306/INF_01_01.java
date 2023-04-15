import java.util.Scanner;

public class INF_01_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String s = sc.nextLine();
        str = str.toLowerCase();
        char c = s.toLowerCase().charAt(0);
        int answer = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) answer ++;
        }
        System.out.println(answer);
    }
}
