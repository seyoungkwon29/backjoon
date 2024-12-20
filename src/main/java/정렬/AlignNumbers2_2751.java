package 정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlignNumbers2_2751 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number).append('\n');
        }
        System.out.println(sb);
    }
}
