package operator;

public class Logical2 {

    public static void main(String[] args) {
        int a = 15;

        // a는 10`보다 크고`20보다 작다.
        // AND 조건
        boolean result = a > 10 && a < 20; // (a > 10) && ....
                        // 10 < a && a < 20; (가독성)
        System.out.println("result = " + result); // true
        
        // 인텔리제이 깃허브 연동 테스트

    }
}
