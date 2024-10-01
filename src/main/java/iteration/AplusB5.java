package iteration;

import java.io.*;
import java.util.StringTokenizer;

public class AplusB5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            if (A == 0 && B == 0) break;
            else bw.write(A + B + "\n");
        }
        bw.flush();
        bf.close();
    }
}
