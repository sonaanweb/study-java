package operator;

public class Operator1 {

    public static void main(String[] args) {

        //윈도우 run 단축키 ctrl + shfit + F10
        //변수 초기화
        int a = 5;
        int b = 2;
        
        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum); // 출력

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈 (int형 끼리의 계산은 소숫점 표현이 안 돼서 정수값만 나온다)
        int div = a / b;
        System.out.println("a * b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

        // +) 0으로는 나눌 수 없다.
    }
}
