package scope;

public class Scope3_1 {

    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if(m > 0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }

    /*
        임시변수 temp는 if 조건이 만족할 때 사용되는 코드인데,
        메인코드 블럭에 선언하게 되면 scope가 사용범위에 비해 넓어지므로
        비효율적 메모리 사용, 코드 복잡성 증가의 단점이 있다.
     */
}
