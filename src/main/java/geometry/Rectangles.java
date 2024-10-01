package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Rectangles {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int col = Integer.parseInt(bf.readLine());
        int row = Integer.parseInt(bf.readLine());

        System.out.println(col * row);
    }
}
