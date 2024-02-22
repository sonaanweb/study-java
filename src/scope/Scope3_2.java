package scope;

public class Scope3_2 {

    public static void main(String[] args) {
        int m = 10;
        if(m > 0){
            int temp = m * 2; // if문 내에서만 temp 변수 사용 - 메모리 효율 증가
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}
