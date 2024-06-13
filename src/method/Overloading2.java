package method;

public class Overloading2 {

    public static void main(String[] args) {
        myMethod(5,1.5);
        myMethod2(1.5,3);
    }

    public static void myMethod(int a, double b){
        System.out.println("int a, double b");
    }

    public static void myMethod2(double a, int b){
        System.out.println("double a, int b");
    }
}
