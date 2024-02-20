package loof;

public class DoWhile1 {

    public static void main(String[] args) {
/*        int i = 10;
        while(i < 3){ // === false
            System.out.println("현재 숫자는:" +i);
            i++;
*/
        int i = 10;

        do{
            System.out.println("현재 숫자는:" + i); // 현재 숫자는 10
            i++;
        } while (i < 3);
        
        // do - while문은 최초 한번은 항상 실행된다. 최초 한 번은 꼭 실행되어야 하는 코드를 사용할 때 사용
    }
}
