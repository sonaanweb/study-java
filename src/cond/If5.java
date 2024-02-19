package cond;

public class If5 {

    public static void main(String[] args) {

        //서로 관련이 없는 독립 조건이면
        //`else if` 를 사용하지 않고 `if` 문을 각각 따로 사용해야 한다. -- 중복할인불가
        
        int price = 10000;
        int age = 10;
        int discount = 0; //할인 값은 0원으로 설정

        if (price >= 10000){
            discount = discount + 1000;
            System.out.println("1번 조건 완료 1000원 할인");
        } else if (age <= 10){
            discount = discount + 1000;
            System.out.println("어린이 1000원 할인");
        } else {
            System.out.println("할인 없음");
        }

        System.out.println("총 할인 금액: " + discount + "원");
    }
}
