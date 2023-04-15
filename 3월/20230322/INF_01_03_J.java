import java.util.Scanner;

public class INF_01_03_J{
    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE, pos;
        while((pos=str.indexOf(' '))!=-1){
            String tmp = str.substring(0,pos); //0부터 pos 전까지
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }
            str=str.substring(pos+1); // 잘라내서 다시 대입
            if(str.length()>m) answer = str; // 마지막 단어까지 포함시키키 위해서 필요
        }
//        String[] s = str.split(" ");
//        for(String x : s){
//            int len = x.length();
//            if(len>m){
//                m=len; // 문자열의 길이 대입
//                answer=x; //단어교체
//            }
//        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner kb=new Scanner(System.in);
        String str = kb.nextLine();
        System.out.print(T.solution(str));
    }
}
