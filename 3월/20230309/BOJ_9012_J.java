import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = 0;
        String input = "";
        N = Integer.parseInt(br.readLine());

        for (int i=0; i<N; i++){
            Stack stack = new Stack();
            input = br.readLine();
            for(int j=0; j<input.length(); j++){
                if(input.charAt(j)=='('){
                    stack.push('('); // (이면 push
                }else{
                    try{
                        stack.pop(); // )이면 pop
                    }catch (Exception e){
                        stack.push("error"); //비어 있는 상태에서 pop을 할 경우에는 exception이 뜸. 그 때 "error" push 후 break
                        break;
                    }
                }
            }
            if(stack.isEmpty()){
                System.out.println("YES"); //스택이 비어있다면 YES
            }else{
                System.out.println("NO"); // 스택에 error가 있으므로 NO
            }
        }
    }
}
