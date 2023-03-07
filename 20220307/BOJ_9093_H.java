import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class BOJ_9093_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String S = br.readLine();
            reverse(S);
        }
    }
    private static void reverse(String str){
        String[] arr = str.split(" ");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String[] strArr = arr[i].split("");
            for (int j = arr[i].length()-1; j >= 0; j--) {
                answer.append(strArr[j]);
            }
            answer.append(" ");
        }
        System.out.println(answer);
    }
}
