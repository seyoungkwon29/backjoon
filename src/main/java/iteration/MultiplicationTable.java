package iteration;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        // BufferedReader 사용
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        for (int i = 1; i < 10; i++) {
            System.out.printf("%s * %s = %s\n", n, i, n * i);
        }
        
        /*// Scanner 사용
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단 입력 : ");
        int n = scanner.nextInt();

        for (int i = 1; i < 10; i++) {
            System.out.printf("%s * %s = %s\n", n, i, n * i);
        }*/
    }
}
