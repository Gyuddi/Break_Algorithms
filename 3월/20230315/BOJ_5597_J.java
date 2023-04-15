import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_5597_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[31]; //출석번호가 0이 없기때문에 31개의 배열 생성
        for(int i=0; i<28; i++){ //28번 입력 받음
            int value = Integer.parseInt(br.readLine());
            arr[value]=1;
        }
       for(int j=1; j<=30; j++){
           if(arr[j]!=1){
               System.out.println(j);
           }
       }
    }
}
