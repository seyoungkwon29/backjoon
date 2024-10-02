package z.array;

import java.io.*;

public class NotSubmit {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int[] students = new int[31];

        for (int i = 1; i < students.length - 2; i++) {
            students[Integer.parseInt(bf.readLine())] = 1;
        }

        for (int i = 1; i < students.length; i++) {
            if (students[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
