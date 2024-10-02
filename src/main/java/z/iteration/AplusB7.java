package z.iteration;

import java.io.*;
import java.util.StringTokenizer;

public class AplusB7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            bw.write("Case #" + (i + 1) + ": " + (A + B) + "\n");
        }
        bw.flush();
        bf.close();
    }
}
