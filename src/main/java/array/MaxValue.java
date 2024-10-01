package array;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class MaxValue {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = Integer.MIN_VALUE;
        String number;
        ArrayList<String> numbers = new ArrayList<>();

        while ((number = bf.readLine()) != null) {
            numbers.add(number);
            max = Math.max(max, Integer.parseInt(number));
        }
        bw.write(max + "\n" + (numbers.indexOf(String.valueOf(max)) + 1));

//        String[] numbers = new String[9];
//
//        for (int i = 0; i < 9; i++) {
//            numbers[i] = bf.readLine();
//            max = Math.max(max, Integer.parseInt(numbers[i]));
//        }
//
//        bw.write(max + "\n" + (Arrays.asList(numbers).indexOf(String.valueOf(max)) + 1));
        bw.flush();
    }
}
