import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_2563_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int size=0;

        int arr[][] = new int[150][150];

        for(int i=0; i<N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            for(int j=a; j<10+a; j++){
                for(int k=b; k<10+b; k++){
                    if(arr[j][k]==0) { //a=3, b=3 j=0 k=0;
                        arr[j][k] = 1; // arr[3][3] [3][4] 4 4
                    }else{
                        size++;
                    }
                }
            }
        }
        int total = 100 * N;
        System.out.println(total-size);
    }
}
