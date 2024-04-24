package scanner;

import java.util.Scanner;

public class ScannerWhile3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("정수를 입력하세요 (0입력 시 종료):");
            int number = input.nextInt();

            if(number == 0){ // 만약 0을 입력하면 break
                break;
            }

            sum += number; // 누적합 sum = sum + number
        }
        System.out.println("입력한 모든 정수의 합: " + sum);
    }
}
