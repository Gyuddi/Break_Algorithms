import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class Main {
    public static void BOJ_2675_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 0;
        N = Integer.parseInt(br.readLine());
        for (int i=0; i<N; i++) {
            String[] str = br.readLine().split(" "); //공백으로 분리
            int M = Integer.parseInt(str[0]); //숫자만 가져오기
            String S = str[1]; // 뒤의 문자 가져오기

            for(int j=0; j<S.length(); j++){
                for(int k=0; k<M; k++){
                    System.out.print(S.charAt(j));
                }
            }
            System.out.println(); //n번쨰 테스케이스 받기 전 행 바꿈
        }
    }
}
