package method;

public class Overloading3 {

    // 매개변수 타입이 다른 경우 호출 타입이 작음 -> 큰 쪽으로는 메서드가 없어도 자동 형변환
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.5,3.0));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return a + b;
    }

    public static double add(double a, double b){
        System.out.println("2번 호출");
        return a + b;
    }
}
