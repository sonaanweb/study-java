package loof;

public class While1_2 {

    public static void main(String[] args) {
    // 같은 코드를 반복해야 하는 상황의 반복문
        int count = 0;

        while (count < 3){ // 0, 1, 2 세번 실행된다.
                            // count 0 = 0 + 1; 현재 숫자는 1
                            // count 1 = 1 + 1; 현재 숫자는 2
                            // count 2 = 2 + 1; 현재 숫자는 3
            count = count + 1;
            System.out.println("현재 숫자는" + count);
        }
    }
}
