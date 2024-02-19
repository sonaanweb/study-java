package cond;

public class If1 {
    public static void main(String[] args) {

        // IF문은 조건이 참인 경우에만 실행된다.
        // if(조건){}
        int age = 18; //사용자 나이

/*        if ( age >= 18 ){
            System.out.println("성인입니다.");
        }

        if ( age < 18 ) {
            System.out.println("미성년자입니다.");
        }*/

        // IF else문
        // IF문의 조건이 참이면 if문이 실행되고 else문으로 넘어가지 않고, if문을 만족하는 조건이 아니면 else문 실행
        if ( age >= 18 ){
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자입니다");
        }

    }
}
