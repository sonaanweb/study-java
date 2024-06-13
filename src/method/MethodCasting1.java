package method;

public class MethodCasting1 {

    public static void main(String[] args) {
        double number = 1.5;
//      printNumber(number); 타입 오류 double을 int에 대입하므로 (x) 형변환 필요
        printNumber((int)number); // 1
    }

    public static void printNumber(int n){
        System.out.println("숫자: " + n);
    }
}
