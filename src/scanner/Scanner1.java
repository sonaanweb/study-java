package scanner;

import java.util.Scanner;

public class Scanner1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 자바 스캐너

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); // 사용자의 입력을 String으로 가져오고 str에 담아준다.
        System.out.println("입력한 문자열: " + str); // hello java

        System.out.print("정수를 입력하세요:");
        int intValue = scanner.nextInt(); // int(정수)로 받아옴
        System.out.println("입력한 정수: " + intValue);

        System.out.print("실수를 입력하세요:");
        double doubleValue = scanner.nextDouble(); // double
        System.out.println("입력한 실수: " + doubleValue);
    }
}