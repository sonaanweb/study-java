package method.ex;

public class MethodEx1 {

    // 평균값 호출 리팩토링 int & double형
    public static void main(String[] args) {
        System.out.println("평균값 : "+average(3,5,10));
        System.out.println("평균값 : "+average(15,5,10));
    }

    // 반환 타입 double
    public static double average(int a, int b, int c){
        int sum = a+b+c;
        return sum / 3.0;
    }
}
