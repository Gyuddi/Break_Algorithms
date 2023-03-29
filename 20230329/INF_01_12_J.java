import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class INF_01_12_J {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }

    public String solution(int n, String s) {
        String answer = "";
        for(int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
            int num =Integer.parseInt(tmp,2); // String 2진수를 10진수화 시킴.
            answer+=(char) num;
            s = s.substring(7); //7부터 끝까지
        }
        System.out.println();
        return answer;
    }
}
