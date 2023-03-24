import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_13241_J {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        System.out.println(lcm(a,b));

    }

    /**
     * 최대공약수, 유클리드 호제법으로 구하기
     */
    static long gcd(long a, long b){
        while(b != 0){
            long d = a % b;
            a = b;
            b = d;
        }
        return a;
    }

    /**
     * 최소공배수
     */
    static long lcm(long a, long b){
        return a*b/gcd(a,b);
    }

}
