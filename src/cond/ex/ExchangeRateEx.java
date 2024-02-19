package cond.ex;

public class ExchangeRateEx {
    /*
       1달러당 1300원
       달러가 0미만이면: "잘못된 금액입니다."
       달러가 0일 때: "환전할 금액이 없습니다."
       달러가 0 초과일 때: "환전 금액은 (계산된 원화 금액)원입니다."
    */
    public static void main(String[] args) {
            int dollar = 10;
            if (dollar < 0) {
                System.out.println("잘못된 금액입니다.");
            } else if (dollar == 0) {
                System.out.println("환전할 금액이 없습니다.");
            } else {
                int won = dollar * 1300;
                System.out.println("환전 금액은 " + won + "원입니다.");
            }
        }
    }

     /*// 나의 풀이
     int dollar = 5;
     String status;

     if (0 > dollar){
         status = "잘못된 금액입니다";
     } else if (dollar == 0){
         status = "환전할 금액이 없습니다";
     } else {
         int won = dollar * 1300;
         status = "환전 금액은 " + won + "입니다";
     }
     System.out.println(status);
 }*/
