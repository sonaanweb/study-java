package operator;

public class OperatorAdd2 {

    public static void main(String[] args) {
        // 전위 증감 연산자 예시
        int a = 1;
        int b = 0;

        b = ++a; // == (a = a + 1)
        // a의 값을 먼저 증가시키고, 그 결과를 b에 대입한다.
        System.out.println("a = " + a + ", b = " + b);
        // a = 2, b = 2


        // 후위 증감 연산자 예시
        a = 1; // a의 값을 다시 1로 지정
        b = 0; // a의 값을 다시 0으로 지정

        b = a++;
        /* == >  b = a; //a의 값을 먼저 b에 대입 b = 1
                 a = a + 1; //이후에 a의 값을 증가 a = 2 */
        // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킨다.
        System.out.println("a = " + a + ", b = " + b);
        // a = 2, b = 1

        // 대입 연산자가 없을 시에는 전위 후위의 결과 값이 같다
    }
}
