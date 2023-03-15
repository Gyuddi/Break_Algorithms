import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_2562_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int MAX=0;
        int index=0;
        for(int i=0; i<9; i++){
            int value = Integer.parseInt(br.readLine());
            if(value>MAX){
                MAX=value;
                index=i+1;
            }
        }
        System.out.println(MAX);
        System.out.println(index);
    }
}
