package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt();

        int[] arr = new int[count]; // 양한 센세는 numbers
        int total = 0; // 영한 센세는 sum
        double avg = 0; // 영한 센세는 average

        System.out.println(count + "개의 정수를 입력하세요");

        for(int i = 0; i < count; i++) {
            arr[i] =scanner.nextInt();
            total += arr[i];
        }

        avg = (double) total / count;

        System.out.println("입력한 정수의 합계: " + total);
        System.out.println("입력한 정수의 평균: " + avg);
    }
}
