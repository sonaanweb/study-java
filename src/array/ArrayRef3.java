package array;

public class ArrayRef3 {
    public static void main(String[] args) {

      /*  int[] students; // 배열 변수 선언
        students = new int[]{90, 80, 70, 60, 50}; // 배열 생성과 초기화 {} 값이 들어간 배열 자동 생성*/

        int[] students = new int[]{90, 80, 70, 60, 50};
        for (int i =0; i < students.length; i++){
            System.out.println("학생" + (i+1) + " 점수:" + students[i]);
        }
    }
}
