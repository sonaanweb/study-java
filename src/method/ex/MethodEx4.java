package method.ex;

import java.util.Scanner;

/*
---------------------------------
1.입금 | 2.출금 | 3.잔액 확인 | 4.종료
---------------------------------
선택: 1
입금액을 입력하세요: 10000
10000원을 입금하였습니다. 현재 잔액: 10000원
 */
public class MethodEx4 {

    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("---------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("---------------------------------");
            System.out.print("선택: ");

            int choice = scanner.nextInt(); // 사용자 선택 담기
            int amount; // 사용자 금액 담기

            // 스위치문 활용
            switch (choice) {
                case 1 -> {
                    System.out.print("입금액을 입력하세요: ");
                    amount = scanner.nextInt(); // 사용자 금액 입력
                    balance = deposit(balance, amount); // 계산 메서드 호출 후 balnce에 저장
                }
                case 2 -> {
                    System.out.print("출금액을 입력하세요: ");
                    amount = scanner.nextInt();
                    balance = withdraw(balance, amount);
                }
                case 3 -> System.out.println("현재 잔액: " + balance + "원");
                // break - switch 밖
                case 4 -> {
                    System.out.println("시스템을 종료합니다");
                    return; // 메인 메서드 밖으로 빠져나가게 해서 while문도 안 돌아가게 한다.
                }
                default -> System.out.println("올바른 선택이 없습니다. 다시 선택해주세요");
            }

        }
    }

    // 입출금 메서드
    public static int deposit(int balance, int amount){
        balance += amount;
        System.out.println(amount + "원 입금 완료. 현재 잔액 : " + balance);
        return balance; //최종 값 반환 전달
    }

    // 출금
    public static int withdraw(int balance, int amount) {
        // 현재 잔액이 출금액보다 클 경우에만 출금 유효
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원 출금 완료. 현재 잔액: " + balance);
            return balance;
        } else {
            System.out.println("출금 실패. 잔액이 부족합니다.");
        }
        return balance;
    }
}
