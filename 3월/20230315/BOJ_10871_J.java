import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void BOJ_10871_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //st에서 1개 가져온 후 int로 변환
        int X = Integer.parseInt(st.nextToken()); // 그 다음 가져오기

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine()); // X개 정수 받아오기

        for (int i = 0; i < N; i++) {
            int value = Integer.parseInt(st.nextToken()); // int로 바꿈

            if (value < X)
                sb.append(value).append(' ');
        }
        System.out.println(sb);
    }
}
