package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fibo_1003 {
    static Integer[][] arr = new Integer[41][2];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        arr[0][0] = 1;
        arr[0][1] = 0;
        arr[1][0] = 0;
        arr[1][1] = 1;

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            fibonacci(n);
            sb.append(arr[n][0]).append(" ").append(arr[n][1])
                    .append("\n");
        }

        System.out.println(sb);
    }

    static Integer[] fibonacci(int n) {
        if (arr[n][0] == null || arr[n][1] == null) {
            arr[n][0] = fibonacci(n - 1)[0] + fibonacci(n - 2)[0];
            arr[n][1] = fibonacci(n - 1)[1] + fibonacci(n - 2)[1];
        }
        return arr[n];
    }
}
