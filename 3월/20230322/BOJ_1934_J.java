import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_1934_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(st.nextToken());

//        System.out.println(7%11);

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int result = a * b / GCD(a,b); // 최소공배수 = a * b / 최대공약수
            sb.append(result + "\n");
        }
        System.out.println(sb);

    }

    /**
     * 최대공약수 메서드
     */
    public static int GCD(int a, int b){
        int r = a % b;
        if(r == 0){
            return b;
        }
        return GCD(b, r);
    }
}
