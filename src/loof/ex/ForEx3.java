package loof.ex;

public class ForEx3 {

    public static void main(String[] args) {
        // for문의 변수들
        // i도 위에 int i 변수 선언 후 사용할 수 있다
        int max = 10;
        int sum = 0;

        for(int i = 1; i <= max; i++){
            sum += i; // sum = sum + i
        }
        System.out.println(sum);
    }
}
