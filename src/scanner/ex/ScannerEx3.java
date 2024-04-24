package scanner.ex;

import java.util.Scanner;

// 사용자로부터 음식의 이름, 가격, 수량을 입력받아 주문한 음식의 총 가격을 계산하고 출력
// totalPrice에 저장
// 출력형태: [음식][수량]개를 주문하셨습니다. 총 가격은[총가격]원입니다.
public class ScannerEx3 {

    public static void main(String[] args) {
        /* 변수이름 전체변경 단축키 shift + f6 */
        Scanner input = new Scanner(System.in);

        // 음식 이름
        System.out.print("음식 이름을 입력해주세요:");
        String foodName = input.nextLine();
        // 음식 가격
        System.out.print("음식 가격을 입력해주세요:");
        int foodPrice = input.nextInt();
        // 음식 수량
        System.out.print("음식 수량을 입력해주세요:");
        int foodQuantity = input.nextInt();

        // 주문음식 총 가격
        int totalPrice = foodPrice * foodQuantity;

        // 출력형태
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice +"입니다.");
        

    }
}
