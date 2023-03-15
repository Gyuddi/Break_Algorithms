import java.util.Scanner;

public class INF_01_09_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        S = S.replaceAll("[^0-9]","");
        while (S.charAt(0) == '0'){
            S = S.substring(1);
        }
        System.out.println(S);
    }
}
