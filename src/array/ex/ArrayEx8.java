package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요:");
        int count = scanner.nextInt();

        int[][] scores = new int[count][3];

        for(int i = 0; i < scores.length; i++) {
            System.out.println((1+i) + "번 학생의 성적을 입력하세요:");
            System.out.print("국어 점수:");
            scores[i][0] = scanner.nextInt();
            System.out.print("영어 점수:");
            scores[i][1] = scanner.nextInt();
            System.out.print("수학 점수:");
            scores[i][2] = scanner.nextInt();
        }


        for(int i = 0; i<scores.length; i++) {
            int total = 0;
            for(int j = 0; j<scores[i].length; j++) {
                total += scores[i][j];
            }
            double avg = (double) total / 3;
            System.out.println((1+i)+"번 학생의 총점 : " + total + ", 평균 : " + avg);
        }
    }
}
