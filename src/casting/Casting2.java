package casting;

public class Casting2 {

    // 큰 범위 -> 작은범위

    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;

        // intValue = doubleValue;  (double을 int에 대입? == 범위 오류 발생)
        intValue = (int)doubleValue; // 명시적 형변환(casting) 강제로 int로 바꿔 대입
        System.out.println(intValue); // 1.5 -> 1

        System.out.println((int)intValue); // 1.5 -> 1
        System.out.println((int)10.5); // 10.5 -> 10
    }
}
