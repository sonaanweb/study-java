package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader(); //매개변수 X 인수 인자 X 메서드 호출
        System.out.println("==프로그램이 동작합니다==");
        printFooter();
    }

    public static void printHeader(){
        System.out.println("프로그램을 시작합니다.");
        return; // void의 경우 생략 가능
    }
    
    public static void printFooter(){
        System.out.println("프로그램을 종료합니다");
    }
}
