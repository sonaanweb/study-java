package loof.ex;

public class NestedEx1 {
 /*   문제: 구구단 출력
    중첩 for문을 사용해서 구구단을 완성해라. (9단) */
    public static void main(String[] args) {
        // 한 단에 9번 반복
        for(int i = 1; i <= 9; i++){ //  왼쪽
            for(int j = 1; j <= 9; j++){ //   오른쪽
                System.out.println(i + "*" + j + " = " + i*j);
            }
            System.out.println(); // 구구단 라인 분리 추가
        }
    }
}
