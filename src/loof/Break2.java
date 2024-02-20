package loof;

public class Break2 {

    public static void main(String[] args) {
        // 1부터 시작하여 숫자를 계속 누적해 더하다 합계가 10보다 큰 처음 값은 얼마인가
        // ex) 1+ 2+ 3 +.....
        int sum = 0;
        int i = 1;

        for(; ; ){ // for 조건식 생략시 while문 무한루프식과 같음
            sum = sum + i;
            if(sum > 10){ // 조건을 만족하면 break를 사용하여 while문 빠져나감
                System.out.println("합이 10보다 크면 종료 i= " + i + " sum= " + sum);
                break;
            }
            i++;
        }
    }
}
