package scanner.ex;

import java.util.Scanner;

// 이름과 나이를 `반복` / 종료 입력 시 종료
// complete current Statement = ctrl + shift + enter 단축키
public class ScannerWhileEx1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        while (true) {
            System.out.print("이름을 입력하세요 (종료입력 시 종료): ");
            String name = input.nextLine(); // \n까지 읽어 옴 ""

            if(name.trim().equals("종료")){
                System.out.println("프로그램 종료");
                break;
            }

            System.out.print("나이를 입력하세요:");
            int age = input.nextInt(); // 10\n -> 10만 가져감 \n이 남음
            input.nextLine(); // 읽고 버려줌 - 숫자 입력 후 줄바꿈 처리

            System.out.println("입력한 이름: "+ name +", 나이: " + age);
        }
    }
}
