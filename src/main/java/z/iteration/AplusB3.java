package z.iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AplusB3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());
        int[] answer = new int[testCase];

        for(int i = 0; i < testCase; i++) {
            String s = bf.readLine();
            int A = Integer.parseInt(s.split(" ")[0]);
            int B = Integer.parseInt(s.split(" ")[1]);
            answer[i] = A + B;

            if (i == testCase - 1) {
                for (int j = 0; j < testCase; j++) {
                    System.out.println(answer[j]);
                }
            }
        }
    }
}
