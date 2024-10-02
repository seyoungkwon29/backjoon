package z.mathmeticalThinking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Planina {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int vertex = 2;

        for (int i = 0; i < n; i++) {
            vertex += (int) Math.pow(2, i);
        }
        System.out.println((int) Math.pow(vertex, 2));
    }
}
