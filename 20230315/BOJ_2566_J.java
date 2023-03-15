import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void BOJ_2566_J(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9]; //2차원 배열 생성
        int max=0;
        int a=0;
        int b=0;

        for (int i = 0; i < 9; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j]>max) {
                    max=arr[i][j];
                    a=i;
                    b=j;
                }
            }
        }
        System.out.println(max);
        System.out.println((a+1) + " " + (b+1));

//        int max = Arrays.stream(arr)
//                .flatMapToInt(Arrays::stream)
//                .max().orElseThrow();
    }
}

//import java.io.BufferedReader;
//        import java.io.InputStreamReader;
//        import java.io.IOException;
//        import java.io.PrintStream;
//        import java.util.Arrays;
//        import java.util.StringTokenizer;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int[][] arr = new int[10][10]; //2차원 배열 생성
//        int max=0;
//        int a=0;
//        int b=0;
//
//        for (int i = 1; i < 10; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine());
//            for (int j = 1; j < 10; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        for (int i = 1; i < 10; i++) {
//            for (int j = 1; j < 10; j++) {
//                if (max < arr[i][j]){
//                    max = arr[i][j];
//                    a=i;
//                    b=j;
//                }
//            }
//        }
//        System.out.println(max);
//        System.out.println(a + " " + b);
//
////        int max = Arrays.stream(arr)
////                .flatMapToInt(Arrays::stream)
////                .max().orElseThrow();
//    }
//}


