import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class BOJ_9012_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            System.out.println(vps(br.readLine()));
        }
    }
    private static String vps(String str){
        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') arrayList.add('(');
            else {
                if (arrayList.isEmpty()) {
                    return "NO";
                }
                arrayList.remove(arrayList.size()-1);
            }
        }
        if (arrayList.isEmpty()) return "YES";
        else return "NO";
    }
}
