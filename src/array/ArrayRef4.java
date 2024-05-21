package array;

public class ArrayRef4 {
    public static void main(String[] args) {

        // 자바가 배열 자동 추적
        // 단 줄을 나눠쓰면 안 된다(선언,생성 한 줄)
        int[] students = {90, 80, 70, 60, 50};

        for (int i =0; i < students.length; i++){
            System.out.println("학생" + (i+1) + " 점수:" + students[i]);
        }
    }
}
