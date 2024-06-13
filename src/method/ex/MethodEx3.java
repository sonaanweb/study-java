package method.ex;

public class MethodEx3 {

    public static void main(String[] args) {
        int balance = 10000;

        // 입금 메서드
        balance = deposit(balance, 10000);
        // 출금 메서드
        balance = withdraw(balance, 4000);

        System.out.println("최종 잔액: " + balance + "원");
    }

    // 입금
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
