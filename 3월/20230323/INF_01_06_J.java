import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class INF_01_06_J {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));

    }

    public String solution(String str) {
        String answer = "";
        for (int i=0; i<str.length(); i++){
//            System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));
            if(str.indexOf(str.charAt(i))==i){
                answer += str.charAt(i);
            }
        }
        return answer;
    }
}
