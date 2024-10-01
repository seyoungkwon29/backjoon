package array;

import java.io.*;

public class Rest {
    public static void main(String[] args) throws IOException {
        // 42로 나눈 나머지 0~41 까지 배열 만든 후 해당되는 값에 +1
        // 이미 1이라면 패스
        // 혹은 0 초과하는 값의 인덱스 출력해도 됨
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int size = 42;
        int[] arr = new int[size];

        for (int i = 0; i < 10; i++) {
            int idx = Integer.parseInt(bf.readLine()) % size;
            arr[idx] += 1;
        }

        for (int rest : arr) if (rest > 0) count++;

        System.out.println(count);
    }
}
