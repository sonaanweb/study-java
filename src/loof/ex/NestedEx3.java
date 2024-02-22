package loof.ex;

public class NestedEx3 {

    public static void main(String[] args) {

        /*
            응용문제 피라미드형 별찍기
                *
               ***
              *****
         */

        int rows = 5; // 만들 피라미드 행

        for(int i = 0; i < rows; i++){ // 1. 출력 행 반복
            for(int j = 0; j < rows-i-1; j++){ // 2. 시작 지점 공백찍기
                System.out.print(" ");
            }
            for(int k = 0; k < (i*2)+1; k++){ // 3. 홀수 별 찍기
                System.out.print("*");
            }
            System.out.println(); // 4. 피라미드 열 구별 println
        }
    }
}
