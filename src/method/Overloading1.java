package method;

public class Overloading1 {

    public static void main(String[] args) {
        System.out.println("1: " + add(10,5));
        System.out.println("2: " + add(5,8,9));
    }

    public static int add(int a, int b){
        System.out.println("1번 호출");
        return  a + b;
    }

    public static int add(int a, int b, int c){
        System.out.println("2번 호출");
        return a + b + c;
    }
}
