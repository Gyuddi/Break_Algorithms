import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class INF_01_10_J {
    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); //문자 하나 받기
        for(int x : T.solution(str, c)){
            System.out.print(x+" ");
        }
    }

    public int[] solution(String s, char t) {
        int[] answer = new int[s.length()];
        int p = 1000;
        /**
         * 왼쪽부터
         */
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == t) p=0;
            else{
                p++;
                answer[i] = p;
            }
        }
        /**
         * 오른쪽부터
         */
        p=1000;
        for (int j=s.length()-1; j>=0; j-- ){
            if(s.charAt(j) == t){
                p=0;
                answer[j]=p;
            }else{
                p++;
                answer[j] = Math.min(answer[j],p); // 둘 중 작은 값
            }
        }
        return answer;
    }
}
