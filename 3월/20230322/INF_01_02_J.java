import java.util.Scanner;

public class INF_01_02_J{
    public String solution(String str){
        String answer="";

        for(char x : str.toCharArray()){
//            if(Character.isLowerCase(x)) answer+=Character.toUpperCase(x);
//            else answer+=Character.toLowerCase(x);
            //대문자는 65-90
            //소문자는 97-122
            //32 차이 소문자에서 32를 빼면 대문자

            if(x>=97 && x<=122) answer+=(char)(x-32);
            else answer+=(char)(x+32);
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
