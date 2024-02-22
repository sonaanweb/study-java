package scope;

public class Scope1 {

    public static void main(String[] args) {
        int m = 10; // m 생존 시작
        if (true){
            int x = 20; // x 생존 시작 --> if문 안에 선언된 변수
            System.out.println("if m = " + m); // if문 밖에 선언 된 변수이므로 생존
            System.out.println("if x = " + x);
        } // x 생존 종료
        // System.out.println("main x = " +x); -- x 생존X - cannot find symbol
        System.out.println("if m = " + m); // if문 밖에 선언 된 변수 생존
    } // m 생존 종료

    // 지역 변수는 본인의 {코드 블록 안}에서만 생존한다.
}
