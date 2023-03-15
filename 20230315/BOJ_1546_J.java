import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_1546_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double[] arr = new double[N];
        double MAX=0;
        double result=0;
        for(int i=0; i<N; i++){
            arr[i] = Double.parseDouble(st.nextToken());
            if(MAX<arr[i]){
                MAX=arr[i];
            }
        }

        for(int j=0; j<N; j++){
            arr[j] = arr[j]*100/MAX;
        }

        for(int k=0; k<N; k++){
            result += arr[k];
        }

        System.out.println(result/N);
    }
}
