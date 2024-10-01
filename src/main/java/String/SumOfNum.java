package String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SumOfNum {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int total = 0;

        int n = Integer.parseInt(bf.readLine());
        String number = bf.readLine();

        for (int i = 0; i < n; i++) {
            total += Integer.parseInt(number.split("")[i]);
        }
        System.out.println(total);
    }
}
