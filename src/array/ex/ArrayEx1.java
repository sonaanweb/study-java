package array.ex;

public class ArrayEx1 {

    public static void main(String[] args) {

        // 1. 배열 생성
        int[] students = {90,80,70,60,50};

        // 2. 점수 총합 for문 (alt+enter 향상된 for문)
        int total = 0;
        for (int student : students) {
            total += student;
        }
        /*
        for(int i = 0; i< students.length; i++){
            total += students[i];
        }
        */

        // 3. 평균 계산
        double average = (double) total / students.length;
        System.out.println("점수 총합: " + total);
        System.out.println("점수 평균: " + average);
    }
}
