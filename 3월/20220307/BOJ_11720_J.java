import java.util.Scanner;

public class BOJ_11720_J {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        String a = in.next();
        in.close();

        int sum=0;
        for(int i=N-1; i>=0; i--){
            sum += a.charAt(i)-48;
        }
        System.out.println(sum); 
    }
}
