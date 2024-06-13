package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    // 2차원 배열 - 네명의 학생의 국어 수학 영어 점수를 입력받아 각 학생의 총점/평균 계산
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3]; // 학생 4 과목 3 배열 생성
        String[] subjects = {"국어", "영어", "수학"};

        // 루프 돌리며 입력 받기 0123 학생 - 행
        for(int i = 0; i < 4; i++){
            System.out.println( (i+1)+"번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++){ // 012 학생 과목 성적 - 열
                System.out.print(subjects[j] + "점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++){
            int total = 0;
            for (int j = 0; j < 3; j++){
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1)+"번 학생의 총점: "+total+", 평균: "+ average);
        }
    }
}