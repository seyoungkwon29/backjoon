package bigO;

import java.io.*;
import java.util.StringTokenizer;

public class Algorithm7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(bf.readLine());
        int d = Integer.parseInt(bf.readLine());

        if (c >= a && b <= (c - a) * d){
            System.out.println(1);
        } else System.out.println(0);
    }
}
