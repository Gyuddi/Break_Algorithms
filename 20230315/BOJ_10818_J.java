import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void BOJ_10818_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //st에서 1개 가져온 후 int로 변환

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine()); // X개 정수 받아오기
        int MIN = 1000001; //최대값 넣기
        int MAX = -1000001; // 최소값 넣기

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken());
            if(value>MAX){
                MAX=value;
            }
            if(value<MIN){
                MIN=value;
            }
        }
        sb.append(MIN).append(' ');
        sb.append(MAX);
        System.out.println(sb);
    }
}
