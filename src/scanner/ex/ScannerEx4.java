package scanner.ex;

import java.util.Scanner;

// 사용자로부터 하나의 정수 n을 입력받고, 입력받은 정수 n의 구구단 출력하기
public class ScannerEx4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요:");
        int n = input.nextInt();

        System.out.println(n + "단의 구구단: ");
        for (int i = 1; i <= 9; i++){ // 단은 하나이므로 for문 사용
            System.out.println(n + "x" + i + " = " + n * i );
        }

    }
}
