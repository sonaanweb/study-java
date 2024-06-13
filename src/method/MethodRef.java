package method;

public class MethodRef {

    public static void main(String[] args) {
        //계산1 --- 1. add라는 함수 호출 메서드에 값 전달
        int sum1 = add(10,5);
        System.out.println("결과 1 출력: " + sum1);

        //계산2
        int sum2 = add(15,20);
        System.out.println("결과 2 출력: " + sum2);
    }

    // add 메서드 정의하기 - add 연산 처리 후 결과 반환
    // 메서드 선언 : 반환 타입, 메서드 이름, 파라미터(매개변수) 목록
    // 메서드 호출 정리 => 메서드에 넘기는 값과 파라미터 타입, 순서, 개수가 맞아야함
    // call("hello", 25) == int call(String str, int age)
    // 인수(argument) : 전달하는 값 -> 인수, 인자
    // 매개변수(parameter) : 메서드를 정의할 때 선언한 변수, 중간에서 전달하는 변수
    public static int add(int a, int b) {
        System.out.println(a + "+" + b + " 연산 수행");
        int sum = a + b;
        return sum; // 2. 결과 실행 반환 -- 3. sum1 / sum2에 전달 변수에 담김
    }
}