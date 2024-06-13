package method;

public class MethodValue0 {

    // 자바는 항상 변수의 값을 복사해서 대입한다!
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = num1; // 5 -> num2 (복사) num1값은 유지
        num2 = 10; // 10 -> num2 (최종)

        System.out.println("num1= "+num1); //5
        System.out.println("num2= "+num2); //10
    }
}
