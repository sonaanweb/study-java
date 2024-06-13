package method.ex;

public class MethodEx2 {

    public static void main(String[] args) {
        String message = "Hello, world!";

        printMessage(message, 3);
        System.out.println("=====");
        printMessage(message, 5);
        System.out.println("=====");
        printMessage(message, 7);
        // String message값 지정 안 한 후 printMessage("java",7);
    }

    public static void printMessage(String message,int times){
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
