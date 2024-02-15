package operator;

public class Logical1 {

    public static void main(String[] args) {
        //  `&&` (그리고) : 두 피연산자가 모두 참이면 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
        System.out.println("&&: AND 연산");
        System.out.println(true && true); //true
        System.out.println(true && false);//false
        System.out.println(false && false);//false

        //  `||` (또는) : 두 피연산자 중 하나라도 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
        System.out.println("||: OR 연산");
        System.out.println(true || true); //true
        System.out.println(true || false);//true
        System.out.println(false || false);//false

        //  `!` (부정) : 피연산자의 논리적 부정을 반환. 즉, 참이면 거짓을, 거짓이면 참을 반환
        System.out.println("! 연산");
        System.out.println(!true); //false
        System.out.println(!false); //true
        // 현재 연산의 반대가 결과로 나오는 것

        // 활용
        System.out.println("변수활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // true
    }
}
