package loof;

public class Break1 {

    public static void main(String[] args) {
        // 1부터 시작해 숫자를 계속 누적해 더한다.
        // 누적 합계가 10보다 처음으로 큰 값은 얼마인가?
        int sum = 0;
        int i = 1;

        while(true){
            sum = sum + i; // 0 = 0 + 1 == sum(1)
            if ( sum > 10){ // 1 > 10 --false=> if문 빠져나가서 i++;
                System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
                break; // break가 없으면 while은 무한 루프
            }
            i++;
        }
    }
}
