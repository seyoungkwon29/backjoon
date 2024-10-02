package z.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongLong {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String answer = "";

        while (n % 4 != 0) {
            System.out.println("n은 4의 배수 입니다.");
            n = Integer.parseInt(bf.readLine());
        }

        for (int i = 1; i <= n / 4; i++) {
            answer += "long ";
        }
        System.out.println(answer + "int");
    }
}
