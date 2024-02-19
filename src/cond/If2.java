package cond;

public class If2 {

    public static void main(String[] args) {
        int age = 14;

        // 아래 코드는 불필요한 조건 검사를 포함한다.
/*        if (age <= 7){
            System.out.println("미취학");
        }
        if (age >= 8 && age <= 13){
            System.out.println("초등학생");
        }
        if (age >= 14 && age <= 16){
            System.out.println("중학생");
        }
        if (age >= 17 && age <= 19){
            System.out.println("고등학생");
        }
        if (age >= 20){
            System.out.println("성인");
        }                                       */

        // else if문은 앞선 if문의 조건이 거짓일 때 다음 조건을 검사한다. 앞선 if문이 참이라면 실행되지 않는다.
/*          if (condition1) {
            조건1이 참일 때 실행되는 코드
                } else if (condition2) {
            조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
                } else if (condition3) {
            조건2이 거짓이고, 조건3이 참일 때 실행되는 코드
                } else {
            모든 조건이 거짓일 때 실행되는 코드 (else 는 생략가능)
                }*/
    }
}
