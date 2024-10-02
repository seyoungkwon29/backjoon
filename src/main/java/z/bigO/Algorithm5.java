package z.bigO;

import java.io.*;

public class Algorithm5 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        bf.close();

        bw.write(n * n * n + "\n" + 3);
        bw.flush();
        bw.close();
    }
}
