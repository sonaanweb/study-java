package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요:");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int num2 = scanner.nextInt();

        // num1이 num2보다 큰 경우, 두 숫자를 교환한다(범위에 상관없이 순서대로 하기 위해)
        if (num1 > num2){
            int temp = num1; // 1. 임시변수에 num1을 넣어두고
            num1 = num2; // 2. num1의 값을 num2에 넣는다
            num2 = temp; // 3. num2 안에는 넣어두었던 temp(num1)값을 넣는다.
        }

        // 5, 7 = 5, 6, 7
        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = num1; i <= num2; i++){
            System.out.print(i);

            if( i != num2 ){ // 마지막 값 옆에는 쉼표 X
                System.out.print(", ");
            }
        }
    }
}
