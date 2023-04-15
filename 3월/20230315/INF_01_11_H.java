import java.util.Scanner;

public class INF_01_11_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        char tmp = S.charAt(0);
        int count = 1;
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == tmp) count++;
            else {
                if (count == 1) answer.append(tmp);
                else {
                    answer.append(tmp);
                    answer.append(count);
                }
                tmp = S.charAt(i);
                count = 1;
            }
        }
        if (S.charAt(S.length()-1) == S.charAt(S.length()-2)){
            answer.append(tmp);
            answer.append(count);
        }
        else answer.append(S.charAt(S.length()-1));
        System.out.println(answer);
    }
}
