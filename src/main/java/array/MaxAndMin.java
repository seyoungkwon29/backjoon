package array;

import java.io.*;

public class MaxAndMin {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(bf.readLine());
        String[] inputs = bf.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (min > Integer.parseInt(inputs[i])) {
                min = Integer.parseInt(inputs[i]);
            }

            if (max < Integer.parseInt(inputs[i])) {
                max = Integer.parseInt(inputs[i]);
            }
        }
        bw.write(min + " " + max);
        bw.flush();
    }
}
