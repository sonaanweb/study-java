package loof.ex;

public class WhileEx2 {
    // 반복문을 사용하여 처음 10개의 짝수 출력. `num` 을 수의 변수로 사용
    // while문, for문 두가지 버전의 정답 필요
    // 강의 풀의와 내 풀이 비교해봐야 함
    
    public static void main(String[] args) {

        // 1. while문
        int num = 1;
        int count = 1;
        while (count <= 10){ // 10개 출력
            if(num % 2 == 0){ // 짝수 판단
                System.out.println(num);
                count++;
            }
            num++;
        }

        // 2. for문 ---- %2 사용하지 않은 풀이
        for (int numFor = 2, countFor = 1; // 초기식
             countFor <= 10; // 조건식
             numFor += 2, countFor++){ // 증감식
                System.out.println(numFor);
        }
    }
}
