package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        int a = 0;

        a = a + 1;

        // soutv 단축키 = 변수값 출력
        System.out.println("a = " + a); // 1

        a = 1 + 1;
        System.out.println("a = " + a); // 2

        // 증감 연산자 ++ & -- 사용
        ++a; // a = a + 1 변수안의 값을 하나 증가시키는 것 = 3
        ++a; // 4

    }
}
