package array;

public class ArrayRef1 {

    public static void main(String[] args) {

        int[] students; // 1. 배열 변수 `선언`
        students = new int[5]; // 2. int가 5개 들어가는 그릇 `생성` 0~4

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println("학생 1 점수: " + students[0]);
        System.out.println("학생 2 점수: " + students[1]);
        System.out.println("학생 3 점수: " + students[2]);
        System.out.println("학생 4 점수: " + students[3]);
        System.out.println("학생 5 점수: " + students[4]);

    }

}
