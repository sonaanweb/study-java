package cond;

public class Switch3 {
    public static void main(String[] args) {
        //grade 1:1000, [2:3000, 3:3000], 나머지: 500
        int grade = 2;
        int coupon;
        switch (grade) {
            case 1:
                coupon = 1000;
                break;
            case 2: // break문이 없으면 아래 case 실행
            case 3:
                coupon = 3000;
                break;
            default:
                coupon = 500;
        }
        System.out.println("발급받은 쿠폰 " + coupon);
    }

    // 정리!
    // if문과 switch문
    // switch문은 if문과 다르게 조건식 안에 단순 값만 넣을 수 있다.
}
