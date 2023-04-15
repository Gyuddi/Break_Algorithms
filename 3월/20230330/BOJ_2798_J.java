import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BOJ_2798_J {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int result = search(arr, N, M);
        System.out.println(result);
    }

    static int search(int[] arr, int N, int M) {
        int result = 0;
        for (int i = 0; i < N - 2; i++) { //첫번째 카드는 N-2까지만
            if(arr[i] > M) continue;// 첫 번째 카드가 M 보다 이미 경우의 수 탈락
            for (int j = i + 1; j < N - 1; j++) { // 두번째 카드는 첫번째 카드 다음부터 N-1 까지만
                if(arr[i] + arr[j] > M) continue; // // 두 번째 카드와 첫 번째 카드의 합이 M보다 크면 이미 탈락
                for (int k = j + 1; k < N; k++) {
                    int temp = arr[i] + arr[j] + arr[k];
                    if (M == temp) { // 세 정수의 합이 M과 일치한다면 종료.
                        return temp;
                    }
                    if(result < temp && temp < M) { // 세 카드의 합이 M보다 작고 이전 값보다 크다면 바꿔치기.
                        result = temp;
                    }
                }
            }
        }
        return result;
    }
}
