package casting;

public class Casting4 {

    public static void main(String[] args) {

        int div1 = 3 / 2; //1.5
        System.out.println("div1 ="+div1); //1
        /* 같은 타입끼린 같은 타입의 결과 int/int = int */

        double div2 = 3 / 2; //1.5
        System.out.println("div2 ="+div2); //1.0 (Question)
        /*
           자바 기본 리터럴 int 3/2 = 1
           int/ int 이므로 int타입으로 결과가 나온다 1
           (double) 1 // int->double에 대입해야 한다. 자동현변환 - 1.0;
        */

        double div3 = 3.0 / 2; //1.5
        System.out.println("div3 ="+div3); //1.5
        /*
        double / int
        큰 걸 기준으로 자동 형변환이 일어남 (double)로 자동 캐스팅
        double / double이 된다 1.5
         */

        double div4 = (double) 3 / 2; //1.5
        System.out.println("div4 ="+div4); //1.5
        /*
        명시적 형변환 사용 (double) int / int
        double / double 형변환 발생
        3.0 / 2.0
         */

        int a = 3;
        int b = 2;
        double result = (double) a/b; //a를 double형으로 casting후 b랑 나눔
        System.out.println("result="+result); //1.5
    }
}
