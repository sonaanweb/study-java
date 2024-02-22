package loof;

public class While2_2 {
    // ctrl+n 파일명 찾기 단축키
    // i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더하라
    // i=1, endNum=x --> 1~x까지 총 x번 더하기
    public static void main(String[] args) {

        int sum = 0;
        int i = 1;
        int endNum = 3;
        // 코드가 실행된 횟수가 keyPoint. endNum까지 세번 실행되어야 하니까 <=3
        while (i <= endNum){ // 1 <= 3 true ....~ i(4) <= 3 -> false 루프 빠져나감
            sum = sum + i;
            System.out.println("i= " + i + " sum=" + sum);
            i++;
        }
    }
}
