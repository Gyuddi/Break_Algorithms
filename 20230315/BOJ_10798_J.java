import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_10798_J(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][15]; //2차원 배열 생성

        for (int i = 0; i < 5; i++) {
            String s = sc.nextLine();
            for(int j=0; j<s.length(); j++){
                arr[i][j]=s.charAt(j);
            }
        }

        for (int j = 0; j < 15; j++) {
            for(int i=0; i<5; i++){
                if(arr[i][j]!=0) {
                    System.out.print((char) arr[i][j]);
                }else{
                    continue; //0이면 아무것도 하지말고 반복문 처음으로
                }
            }
        }
    }
}
