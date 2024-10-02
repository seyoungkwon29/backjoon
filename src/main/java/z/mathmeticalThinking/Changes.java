package z.mathmeticalThinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Changes {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());
        int[] changes = {25, 10, 5, 1};

        for (int i = 0; i < testCase; i++) {
            int total = Integer.parseInt(bf.readLine());
            for (int change : changes) {
                System.out.print(total / change + " ");
                total %= change;
            }
            System.out.println();
        }
    }
}
