package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Average {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer subjectToken = new StringTokenizer(bf.readLine());
        int subject = Integer.parseInt(subjectToken.nextToken());
        int maxScore = Integer.MIN_VALUE;

        StringTokenizer scoreToken = new StringTokenizer(bf.readLine());
        List<Integer> scoreList = new ArrayList<>();

        // 최고점 구하기
        for (int i = 0; i < subject; i++) {
            int score = Integer.parseInt(scoreToken.nextToken());
            maxScore = Math.max(maxScore, score);
            scoreList.add(score);
        }

        // 새로운 평균 구하기
        double total = 0.0;
        for (int currentScore : scoreList) {
            double newScore = ((double) currentScore / maxScore) * 100;
            System.out.println("지금 점수 : " + currentScore);
            System.out.println("새로운 점수 : " + newScore + "\n");
            total += newScore;
        }
        System.out.println("총점 : " + total);

        double average = total / subject;
        System.out.println(average);
    }
}
