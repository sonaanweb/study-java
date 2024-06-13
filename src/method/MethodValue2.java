package method;

public class MethodValue2 {

    public static void main(String[] args) {
        int num1 = 5; // shift + f6 변수명 rename
        System.out.println("changeNumber 호출 전, num1: " + num1);
        num1 = changeNumber(num1); // 10으로 치환
        System.out.println("changeNumber 호출 후, num1: " + num1);
    }

    public static int changeNumber(int num2){
        num2 = num2 * 2; // 5 * 2 = 10
        return num2; // 10
    }
}
