package loof;

public class For2 {

    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;

        for (int i = 1; i <= endNum; i++){
            sum = sum + i;
            System.out.println("i=" + i + " sum" + sum);

            // for VS while
            /*
            FOR문은 초기화, 조건 검사, 반복 후 작업 등이 규칙적으로 한 줄에 있어 가독성이 좋다.
            반복 횟수에 직접적인 영향을 주는 변수를 선언부터, 값 증가, 또 조건식에 활용까지 구조 활용
            명확하게 카운트 변수가 있고 증가 변수가 있으면 for문이 유용하다
            */
        }
    }
}