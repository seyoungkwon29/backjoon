package 브루트_포스;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MovieDirector_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int count = 1;
        int movie = 666;

        while (n > count) {
            movie++;

            if (String.valueOf(movie).contains("666"))
                count++;
        }
        System.out.println(movie);

    }
}
