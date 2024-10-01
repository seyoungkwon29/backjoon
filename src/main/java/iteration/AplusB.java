package iteration;

import java.io.*;
import java.util.StringTokenizer;

public class AplusB {
    public static void main(String[] args) throws IOException {
        long beforeTime = System.currentTimeMillis();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(bf.readLine());

        for (int i = 0; i < testCase; i++) {
            StringTokenizer token = new StringTokenizer(bf.readLine(), " ");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            bw.write(A + B + "\n");
        }
        bw.flush();

        long afterTime = System.currentTimeMillis();
        System.out.println("걸린 시간 : " + (afterTime - beforeTime));
    }
}
