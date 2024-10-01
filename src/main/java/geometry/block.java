package geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class block {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(4 * Long.parseLong(bf.readLine()));
    }
}
