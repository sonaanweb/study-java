package scanner.ex;

    /* 당신의 이름을 입력하세요:자바
    당신의 나이를 입력하세요:30
    당신의 이름은 자바이고, 나이는 30살입니다.*/

import java.util.Scanner;

public class ScannerEx1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // 스캐너 추가

        System.out.print("당신의 이름을 입력하세요:");
        String name = scanner.nextLine(); // 입력한 이름이 들어갈 변수

        System.out.print("당신의 나이를 입력하세요:");
        int age = scanner.nextInt(); // 입력한 나이가 들어갈 변수

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
    }
}
