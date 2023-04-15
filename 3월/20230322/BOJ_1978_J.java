import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_1978_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int count = 0;

        x : for (int i = 0; i < T; i++) {
            int a = Integer.parseInt(st.nextToken());
            if(a==1) continue;

            for(int j=2; j<a; j++){
                if(a % j == 0) ;
            }
            count++;
        }
        System.out.println(count);
    }
}
