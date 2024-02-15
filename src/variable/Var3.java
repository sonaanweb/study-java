package variable;

public class Var3 {
    public static void main(String[] args) {
        int a; //변수 선언
        a = 10;
        System.out.println(a);
        a = 50; // 변수 값 변경 10->50
        System.out.println(a);
        // 위에서 아래로 코드를 읽기 때문에 변수값을 변경하면 기존 값은 사라진다.
    }
}
