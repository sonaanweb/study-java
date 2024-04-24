package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. (입력중단:-1) :");

 /*       while (true){
            input = scanner.nextInt();
            if (input == -1){
                break;
            }

            sum += input;
            count++; // 평균을 구하기 위해 count 수를 구한다
        }
 */

        // while문 두번째 방법 (true 조건에 -1이 아닐때까지 돌리기 조건이 맞으면 동작)
        while ((input = scanner.nextInt()) != -1){
            sum += input;
            count++; // 평균을 구하기 위해 count 수를 구한다
        }
        
        double average = (double) sum / count; // double 캐스팅
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
    }
}
