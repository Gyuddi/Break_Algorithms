import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_3052_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[42]; //42로 나누면 나올 수 있는 나머지는 0~41개
        int count=0;
        for(int i=0; i<10; i++){ //10번 입력 받음
            int value = Integer.parseInt(br.readLine());
            arr[value%42]=1;
        }
       for(int j=0; j<42; j++){
           if(arr[j]==1){
               count++;
           }
       }
        System.out.println(count);
    }
}
