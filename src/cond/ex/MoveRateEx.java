package cond.ex;
/*문제: "평점에 따른 영화 추천하기"
        요청한 평점 이상의 영화를 찾아서 추천하는 프로그램을 작성하자.
        어바웃타임 - 평점9
        토이 스토리 - 평점8
        고질라 - 평점7
        평점 변수는 `double rating` 을 사용하세요.
        `if` 문을 활용해서 문제를 풀자.(if문 모두 실행되는 경우 고려하기)*/
public class MoveRateEx {
    public static void main(String[] args) {
        double rating = 9.1;
        if(rating > 9){
            System.out.println("영화 정보가 없습니다");
        }
        if(rating <= 9){ // rating이 9보다 작거나 같다로 설정해야 아래 if문들이 같이 실행된다
            System.out.println("'어바웃타임'을 추천합니다");
        }
        if(rating <= 8){
            System.out.println("'토이 스토리'를 추천합니다");
        }
        if(rating <= 7){
            System.out.println("'고질라'를 추천합니다");
        }
    }
}
