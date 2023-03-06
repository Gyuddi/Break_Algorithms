// 소인수분해
```java
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_11653 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int tmp = 2;

        while(N>1){
            if(N%tmp == 0){
                sb.append(tmp).append("\n");
                N = N/tmp;
            }else{
                tmp++;
            }
        }
        
        System.out.println(sb);
    }
}
```
