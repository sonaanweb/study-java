package loof.ex;

public class WhileEx1 {

    // 처음 10개의 자연수를 출력하는 프로그램을 작성해보세요. count 변수 활용
    // while문, for문 두가지 버전의 정답 필요

    // 1. while문
    public static void main(String[] args) {

        int count = 1;
        while(count <= 10){
            System.out.println(count);
            count++; // 1 2 3...10
        }

        // 2. for문
        int countFor = 1;
        for (countFor = 1; countFor <= 10; countFor++){
            System.out.println("for문 사용 count 시작: " + countFor);
        }
    }
}
