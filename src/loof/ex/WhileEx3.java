package loof.ex;

public class WhileEx3 {

    // 누적 합 계산
    // 1부터 max까지의 합을 계산하고 출력하라
    // sum = 누적합, i 변수 사용하여 카운트
    // while, for 두가지 방법
    public static void main(String[] args) {

        int max = 10;
        int sum = 0;
        int i = 1;

        while (i <= max){
            sum += i; // sum = sum + i => 누적 합
            i++; // i + 1 (반복)
        }
        System.out.println(sum); // while 조건문 종료 출력
    }
}
