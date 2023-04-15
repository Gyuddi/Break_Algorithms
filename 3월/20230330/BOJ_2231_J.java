import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BOJ_2231_J {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int result = 0;

        for(int i = 0; i < N; i++) {
            int number = i;
            int sum = 0; // 각 자릿수 합
            while(number != 0) {
                sum += number % 10;	// 각 자릿수들을 더하기
                number /= 10;
            }
            if(sum + i == N) { //생성자를 찾았을 때
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
