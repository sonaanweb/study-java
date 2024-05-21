package array;

public class ArrayRef2 {
    public static void main(String[] args) {
        
        // 배열 인덱스는 0부터 시작 0~(n-1) = 범위
        // 리팩토링 - 기존 코드 기능은 유지하며 내부 구조를 개선하는 것

        int[] students; // 1. 배열 변수 `선언`
        students = new int[5]; // 2. int가 5개 들어가는 그릇 `생성` 0~4

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

/*        for (int i =0; i < 5; i++){
            System.out.println("학생" + (i+1) + " 점수:" + students[i]);
        }
*/
        for (int i =0; i < students.length; i++){
            // .length 배열의 길이를 제공하는 코드 - 조회만 가능, 대입 불가
            System.out.println("학생" + (i+1) + " 점수:" + students[i]);
        }
    }
}
