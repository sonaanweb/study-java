package method;

public class MethodCasting2 {

    public static void main(String[] args) {
        int number = 100; // int -> double형 매개변수에 전달 (o)
    }

    public static void printNumber(double n){
        System.out.println("숫자: " +n); // 100.0
    }
}
