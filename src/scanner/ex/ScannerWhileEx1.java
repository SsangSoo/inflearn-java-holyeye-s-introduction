package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            System.out.print("나이릅 입력하세요: ");
            int age = input.nextInt(); // 10 \n << 숫자만 가져가고, \n 의 기호가 남아있음.
            input.nextLine(); // 따라서 이를 읽고 버리도록 하면된다.

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
    }
}
