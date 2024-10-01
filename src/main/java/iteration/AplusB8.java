package iteration;

import java.io.*;
import java.util.StringTokenizer;

public class AplusB8 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 1; i <= testCase; i++) {
            StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            bw.write("Case #" + i + ": " + A + " + " + B + " = " + (A + B) + "\n");
        }
        bw.flush();
        bf.close();
    }
}
