package z.array;

import java.io.*;
import java.util.StringTokenizer;

public class SmallThenX {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(token.nextToken());
        int x = Integer.parseInt(token.nextToken());
        String[] inputs = bf.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            if (Integer.parseInt(inputs[i]) < x) {
                bw.write(inputs[i] + " ");
            }
        }
        bw.flush();
    }
}
