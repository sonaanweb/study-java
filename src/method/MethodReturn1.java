package method;

public class MethodReturn1 {

    public static void main(String[] args) {
        boolean result = odd(2); // 짝수
        System.out.println(result); // false -- 메서드 내 반환 값 반드시
    }

    public static boolean odd(int i) { // 반환 타입 유 boolean형 t/f
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    // return문을 만나면 즉시 메서드를 빠져나간다.
}