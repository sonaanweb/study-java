package loof;

public class Nested1 {

    public static void main(String[] args) {
        for (int i = 0; i < 2; i++){ //1. 처음 시작 코드
            System.out.println("외부 for 시작 i:= " + i);
            for(int j = 0; j < 3; j++){ //2. 0 1 2 세번 실행
                System.out.println("내부 for: " + i + "-" + j);
            }
            System.out.println("외부 for 종료 i:" + i);
        }
        /*
        중첩반복문 활용
        외부 for 시작 i:= 0
        내부 for: 0-0
        내부 for: 0-1
        내부 for: 0-2
        외부 for 종료 i:0 ...... */
        // 결과 외부 for 2번, 내부 for 3번 총 6번의 내부 for 코드가 수행된다.
    }
}
