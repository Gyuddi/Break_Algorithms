import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class INF_01_09_J {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }

    public int solution(String s) {
        String answer ="";
        for(char x : s.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }
}
