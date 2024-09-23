package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalAmount = 0;

        while(true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택: ");
            int menu = scanner.nextInt();
            scanner.nextLine();
            if(menu == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int depositAmount = scanner.nextInt();

                totalAmount = deposit(totalAmount, depositAmount);
            } else if(menu == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int withdrawAmount = scanner.nextInt();

                totalAmount = withdraw(totalAmount, withdrawAmount);
            } else if(menu == 3) {
                System.out.println("현재 잔액 : " + totalAmount);
            } else if(menu == 4) {
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 값을 입력해주세요.");
            }
        }
    }


    public static int deposit(int totalAmount, int depositAmount) {
        totalAmount += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액 : " + totalAmount);
        return totalAmount;
    }
    
    public static int withdraw(int totalAmount, int withdrawAmount) {
        if(totalAmount < withdrawAmount) {
            System.out.println(withdrawAmount + "원을 출금하려 했으나 잔액이 부족합니다.");
            return totalAmount;
        }
        totalAmount -= withdrawAmount;
        System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액 : " + totalAmount);
        return totalAmount;
    }
}
