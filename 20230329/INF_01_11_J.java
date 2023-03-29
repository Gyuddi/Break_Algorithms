import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class INF_01_11_J {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    public String solution(String s) {
        String answer="";
        s+=" "; // 빈 문자열을 뒤에 꼭 붙히자.
        int cnt=1;
        for (int i=0; i<s.length()-1; i++){ // 빈 문자 전까지만
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else{
                answer+=s.charAt(i);
                if(cnt>1){
                    answer+=String.valueOf(cnt);
                    cnt=1;
                }
            }
        }
        return answer;
    }
}
