package array;

public class ArrayDi2 {

    public static void main(String[] args) {
        // 2x3 2차원 배열 선언 및 생성
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        // for문 중첩 배열 출력
        for (int row =0; row < arr.length; row++) { // 행의 길이 = 2행
            for (int col = 0; col < arr[row].length; col++) {
                                    // row > 행 안에 3개의 요소 (012) 찾음
                System.out.print(arr[row][col] + "");
            }
            System.out.println();
        }
    }
}
