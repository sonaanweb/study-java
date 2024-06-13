package array.ex;

import java.util.Scanner;

public class ArrayEx3 {

    public static void main(String[] args) {
        // 1. Scanner
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i< numbers.length; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        // 배열의 인덱스 역순 01234
        for (int i = 4; i >= 0; i--){
            System.out.print(numbers[i]);
            if(i > 0) { // 인덱스 0일땐 출력X
                System.out.print(", ");
            }
        }
    }
}
