package z.iteration;

import java.util.Scanner;

public class SpiralArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("n x n 배열의 n을 입력하세요 : ");
        int n = scanner.nextInt();
        int[][] answer = new int[n][n];
        int value = 1;
        int row = 0;
        int col = 0;
        int direction = 0; // 0: 오른쪽, 1: 아래쪽, 2: 왼쪽, 3: 위쪽

        while (value <= n * n) {
            System.out.println("val : " + value + " | [" + row + "][" + col + "]");
            answer[row][col] = value++; // 배열에 value 채우고 value + 1
            // 오른쪽
            // 오른쪽이 차있거나 배열의 마지막일 때 : 아래쪽
            if (direction == 0) {
                if (col == n - 1 || answer[row][col + 1] != 0) {
                    direction = 1;
                    row++;
                } else {
                    col++;
                }
            }
            // 아래쪽
            // 아래쪽이 차있거나 배열의 마지막일 때 : 왼쪽
            else if (direction == 1) {
                if (row == n - 1 || answer[row + 1][col] != 0) {
                    direction = 2;
                    col--;
                } else {
                    row++;
                }
            }
            // 왼쪽
            // 왼쪽이 차있거나 배열의 마지막일 때 : 위쪽
            else if (direction == 2) {
                if (col == 0 || answer[row][col - 1] != 0 ) {
                    direction = 3;
                    row--;
                } else {
                    col--;
                }
            }
            // 위쪽
            // 위쪽이 차있거나 배열의 마지막일 때 : 오른쪽
            else if (direction == 3) {
                if (row == 0 || answer[row - 1][col] != 0) {
                    direction = 0;
                    col++;
                } else {
                    row--;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(answer[i][j] + "\t");
            }
            System.out.println();
        }
    }
}