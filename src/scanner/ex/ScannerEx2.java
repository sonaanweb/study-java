package scanner.ex;

import java.util.Scanner;

// 하나의 정수를 입력받고, 홀수인지 짝수인지 판별하는 프로그램 작성
public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int num = scanner.nextInt();
        
        if (num % 2 == 0){
            System.out.println("짝수입니다");
        } else {
            System.out.println("홀수입니다");
        }
    }
}
