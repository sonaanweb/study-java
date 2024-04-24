package scanner.ex;
// a의 값과 b의 값을 서로 바꾸는 코드. temp변수 활용
public class ChangeVarEx {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp; // a의 값 10 보관

        //시작: 코드를 작성하세요
        temp = a; //10
        a = b;
        b = temp;
        //종료: 코드를 작성하세요

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        // a = b 라고 하면 a의 값인 10은 사라져버린다.
        // a = b 라고 하기 전 a의 값을 보관해두고 임시 변수인 temp에 보관
    }
}
