package 그리디;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class AlignCards_1715 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            priorityQueue.add(Integer.parseInt(br.readLine()));
        }

        int sum = 0;
        int data1, data2;
        while (priorityQueue.size() > 1) {
            data1 = priorityQueue.remove();
            data2 = priorityQueue.remove();
            sum += data1 + data2;
            priorityQueue.add(data1 + data2);
        }

        System.out.println(sum);
    }
}
