import java.util.Scanner;

public class INF_01_07_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        S = S.toLowerCase();
        String comp = "";
        double length = S.length();
        for (int i = S.length()-1; i >= length/2; i--) {
            comp += S.charAt(i);
        }
        if (S.substring(0,S.length()/2).equals(comp)) System.out.println("YES");
        else System.out.println("NO");
    }
}
