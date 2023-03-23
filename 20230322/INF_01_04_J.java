import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class INF_01_04_J {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }
        for(String x : str){
            char[] s = x.toCharArray();
            int lt = 0;
            int rt = x.length()-1;
            while(lt<rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s); // char[] -> String으로 변환
            answer.add(tmp);//ArrayList에 추가.
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){ 
            str[i] = kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }
    }
}
