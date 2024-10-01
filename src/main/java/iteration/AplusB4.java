package iteration;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AplusB4 {
    public static void main(String[] args) throws IOException {
//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String str = "";
//
//        while ((str = bf.readLine()) != null) {
//            StringTokenizer token = new StringTokenizer(str, " ");
//            int A = Integer.parseInt(token.nextToken());
//            int B = Integer.parseInt(token.nextToken());
//            bw.write(A + B + "\n");
//        }
//        bw.flush();

        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) { // 다음 줄이 있는지 확인
            String str = scanner.nextLine(); // 다음 줄을 str 에 저장
            StringTokenizer token = new StringTokenizer(str, " ");
            int A = Integer.parseInt(token.nextToken());
            int B = Integer.parseInt(token.nextToken());
            System.out.println(A + B);
        }
    }
}
