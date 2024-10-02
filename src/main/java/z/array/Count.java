package z.array;

import java.io.*;

public class Count {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(bf.readLine());
        String[] arr = bf.readLine().split(" ");
        int v = Integer.parseInt(bf.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (v == Integer.parseInt(arr[i])) count++;
        }
        bw.write(Integer.toString(count)); // write() 메소드는 문자열을 출력할 수 있다.
        bw.flush();
    }
}
