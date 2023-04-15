import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class INF_01_05_J {
    public String solution(String str){
        String answer;
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length()-1;
        while(lt<rt){
            if(!Character.isAlphabetic(s[lt])){ // 특수문자면 
                lt++;
            }else if(!Character.isAlphabetic(s[rt])){ // 특수문자면
                rt--;
            }else{
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s); // char[]을 String으로 변경
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        String str = kb.next();

        System.out.println(T.solution(str));
    }
}
