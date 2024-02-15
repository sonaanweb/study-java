package operator;

public class Operator2 {
    public static void main(String[] args) {

        // 문자열 더하기
        String result1 ="Hello" + "world";
        System.out.println(result1);

        // 문자열 변수로 더하기
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기
        String result3 = "a + b = " + 10; // 숫자를 문자열로 변경한 다음 더해진다
        System.out.println(result3); // a + b = 10

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num; // 숫자를 문자열로 변경
        System.out.println(result4); //a + b = 20
        
        // 자바는 문자열인 String 타입에 다른 타입을 더하는 경우 그 대상을 문자열로 변경한다

    }
}
