package scanner.ex;

import java.util.Scanner;

public class SacnnerWhileEx2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true){

            // 상품 가격
            System.out.print("상품의 가격을 입력하세요(-1 입력하면 종료):");
            int price = input.nextInt();

            // 종료 코드
            if (price == -1){
                System.out.println("프로그램 종료");
                break; // break 꼭!
            }

            // 구매수량
            System.out.print("구매수량을 입력하세요:");
            int quantity = input.nextInt();

            // 총 가격
            int totalCost = price * quantity;
            System.out.println("총 가격은 " + totalCost +"원 입니다.");
        }
    }
}
