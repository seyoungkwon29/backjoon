package 다이나믹프로그래밍;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SugarDelivery_2839 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        System.out.println(sugar(n));
    }

    static int sugar(int n) {
        int count = 0;

        while (n >= 0) {
            if (n >= 5) {
                count += n / 5;
                n %= 5;
            } else if (n >= 3) {
                count += n / 3;
                n %= 3;
            }
            if (n > 0 && n < 3) return -1;
            if (n == 0) return count;
        }

        return 0;
    }
}
