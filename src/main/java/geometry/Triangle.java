package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        int b = Integer.parseInt(bf.readLine());
        int c = Integer.parseInt(bf.readLine());

        if ((a + b + c) != 180) {
            System.out.println("Error");
        } else {
            if (a == b && b == c) System.out.println("Equilateral");
            else if (a == b || a == c || b == c) System.out.println("Isosceles");
            else System.out.println("Scalene");
        }
    }
}
