package loof.ex;

public class NestedEx2 {

    /*
    int rows` 를 선언해라.
    이 수만큼 다음과 같은 피라미드를 출력하면 된다.
    rows = 2
    *
    ** ....
     */
    public static void main(String[] args) {
        int rows = 5; // 행

        for (int i = 1; i <= rows; i++){ // 출력 행. `행의 수만큼 반복`해야 한다
            for(int j = 1; j <= i; j++){ // `열 (*) 출력 개수의 반복`. 행보다 작거나 같을 때
                                        // i번 만큼 반복되며 별표가 찍힌다.
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
