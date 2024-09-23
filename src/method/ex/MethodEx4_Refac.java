package method.ex;

import java.util.Scanner;

public class MethodEx4_Refac {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("---------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("---------------------------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt();
            int amount;

            switch (choice) {
                case 1:
                    System.out.print("입금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = deposit(balance, amount);
                    break;
                case 2:
                    System.out.print("출금액을 입력하세요 : ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                    break;
                case 3:
                    System.out.println("현재 잔액 : " + balance);
                    break;
                case 4:
                    System.out.println("시스템을 종료합니다.");
                    break;
                default:
                    System.out.println("올바른 값을 입력해주세요.");
                    break;
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
