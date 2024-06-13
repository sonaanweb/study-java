package array.ex;

import java.util.Scanner;

public class ArrayEx6 {

    public static void main(String[] args) {

        // n개의 정수를 입력받아 배열에 저장한 후, 가장 작은 수와 큰 수를 출력
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력 받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt(); //입력에 따른 동적 할당

        int[] numbers = new int[n]; // 배열 생성
        int minNumber, maxNumber;

        System.out.println(n+"개의 정수를 입력하세요: ");
        for(int i = 0; i < n; i++){
            numbers[i] = scanner.nextInt(); // 입력할 때마다 배열에 저장
        }

        // 배열 첫번째 값으로 우선 초기화
        minNumber = numbers[0];
        maxNumber = numbers[0];
        
        // for문을 통한 배열 값 비교 갱신
        for(int i = 1; i < n; i++){
            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber){
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
    }
}