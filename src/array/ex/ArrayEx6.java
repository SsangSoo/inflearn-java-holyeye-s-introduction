package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int count = scanner.nextInt(); // 영한센세는 n

        int[] arr = new int[count]; // 영한 센세는 numbers

        System.out.println(count + "개의 정수를 입력하세요");

        for(int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = arr[0]; // 영한 센세는 maxNumber
        int min = arr[0]; // 영한 센세는 minNumber

        // 영한 센세는 다음처럼 선언
        int minNumber, maxNumber;
        // 다음 처럼도 가능
        minNumber = maxNumber = arr[0];
        
        // 영한 센세 for문
//        for(int i = 1; i < count; i++) {
//            if(arr[i] < minNumber) {
//                minNumber = arr[i];
//            }
//            if(arr[i] > maxNumber) {
//                maxNumber = arr[i];
//            }
//        }
        
        // 큰 수 , 작은 수 구하기 > 내 for문
        for(int num : arr) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        

        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);


    }
}
