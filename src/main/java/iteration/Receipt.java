package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Receipt {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(bf.readLine()); // 총 금액
        int N = Integer.parseInt(bf.readLine()); // 물건의 종류 수
        int sum = 0;
        String answer = "Yes";

        for (int i = 0; i < N; i++) {
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            sum += a * b;
        }
        if (sum != X) answer = "No";
        System.out.println(answer);
    }
}
