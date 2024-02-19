package cond;

public class Cond0p1 {

    public static void main(String[] args) {

    // * 단순히 참과 거짓에 따라 특정 값을 구하는 경우 *
        // if문
    /*  int age = 18;
        String status;
        if(age >= 18){
            status = "성인";
        } else {
            status = "미성년자";
        }
        System.out.println("age = " + age + " status = " + status);
    */

        // if문과 비교해서 코드를 단순화 할 수 있다.
        // 삼항연산자(항이 세개)-> (조건) ? 참_표현식 : 거짓_표현식
        // 단 if문처럼 코드 블럭을 넣을 수 있는 것이 아닌 단순 표현식만 넣을 수 있다.
    int age = 18;
    String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + "status = " + status);
    }
}
