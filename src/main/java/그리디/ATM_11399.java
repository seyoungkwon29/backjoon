package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class ATM_11399 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        List<Integer> time = new ArrayList<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            time.add(Integer.parseInt(st.nextToken()));
        }

        Collections.sort(time);

        int answer = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += time.get(i);
            answer += sum;
        }
        System.out.println(answer);
    }
}
