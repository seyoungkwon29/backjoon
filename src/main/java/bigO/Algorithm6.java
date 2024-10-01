package bigO;

import java.io.*;

public class Algorithm6 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        long n = Long.parseLong(bf.readLine());
        bf.close();

        bw.write(n * (n - 1) * (n - 2) / 6 + "\n" + 3);
        bw.flush();
        bw.close();
    }
}
