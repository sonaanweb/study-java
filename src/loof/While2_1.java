package loof;

public class While2_1 {
    public static void main(String[] args) {

        // 변수를 사용한 반복문 - CASE 1
        // (i부터 1씩 증가하는 수를 3번까지 더하라)
        int sum = 0;
        int i = 1;

        sum = sum + i; // sum(0) = 0 + 1 -> sum(1)
        System.out.println("i=" + i + ", sum=" + sum); // i = 1, sum = 1
        i++; // i = 2

        sum = sum + i; // sum(1) = 1 + 2 -> sum(3)
        System.out.println("i=" + i + ", sum=" + sum); // i = 2, sum = 3
        i++; // i = 3

        sum = sum + i; // sum(3) = 3 + 3 -> sum(6)
        System.out.println("i=" + i + ", sum=" + sum);
    }
}
