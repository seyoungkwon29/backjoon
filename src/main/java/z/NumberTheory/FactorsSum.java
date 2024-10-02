package z.NumberTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FactorsSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String ans = "";
            int n = Integer.parseInt(st.nextToken());
            if (n == -1) break;
            int temp = n;

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    temp -= i;
                    if (i == 1) ans = n + " = " + 1;
                    else ans += " + " + i;
                }
            }

            if (temp != 0) System.out.println(n + " is NOT perfect.");
            else System.out.println(ans);
        }
    }
}
