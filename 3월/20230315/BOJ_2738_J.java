import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_2738_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //st에서 1개 가져온 후 int로 변환
        int M = Integer.parseInt(st.nextToken()); // 그 다음 가져오기

        int[][] arr = new int[N][M]; //2차원 배열 생성
        int[][] arr2 = new int[N][M]; //2차원 배열 생성

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<M; j++){
                arr2[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                System.out.print(arr[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
