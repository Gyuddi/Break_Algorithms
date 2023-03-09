import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class BOJ_9093_J {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 0;
        String input = "";
        N = Integer.parseInt(br.readLine()); //BufferedReader는 String을로 입력을 받기 때문에 int로 변환 후 넣기.

        for (int i=0; i<N; i++){
            input = br.readLine();
            String[] split = input.split(" "); // 공백을 기준으로 단어 나누기
            StringBuilder sb = new StringBuilder();

            for(String s : split) {
                StringBuilder sb2 = new StringBuilder(s);
                sb.append(sb2.reverse()); // 단어 뒤집어서 sb에 넣기
                sb.append(' '); // 단어 append 후 공백 넣기
            }

            sb.deleteCharAt(sb.length()-1); // 마지막 공백 제거
            System.out.println(sb); 
        }
    }
}
