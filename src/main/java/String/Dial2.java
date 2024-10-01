package String;

import java.io.IOException;
import java.util.Scanner;

public class Dial2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            int a = str.charAt(i);
            System.out.println("a = " + a);

            if (a == 83 || a == 86 || a == 89 || a == 90) {
                count += (a - 65) / 3 + 2;
            } else {
                count += (a - 65) / 3 + 3;
            }
        }
        System.out.print(count);
    }
}
