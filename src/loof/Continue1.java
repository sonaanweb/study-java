package loof;

public class Continue1 {
    public static void main(String[] args) {
        // 1~5까지 숫자를 출력하는데 숫자가 3일 때 출력을 건너뛰는 코드를 작성하라
        int i = 1;
        while (i <= 5) { // 1. while문
            if (i == 3) { // 2. while문 안 if문의 조건
                i++;

                continue;
                /*
                `i==3` 인 경우 `i` 를 하나 증가하고 `continue` 를 실행한다.
                따라서 이 경우에는 `i` 를 출력하지 않고 바로 `while (i <= 5)` 조건식으로 이동
                */
            }
            System.out.println(i);
            i++;
        }
    }
}
