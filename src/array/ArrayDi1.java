package array;

public class ArrayDi1 {

    public static void main(String[] args) {
        // 2x3 2차원 배열
        int[][] arr = new int[2][3]; // 행 2, 열 3

        arr[0][0] = 1; // 0행 0열
        arr[0][1] = 2; // 0행 1열
        arr[0][2] = 3; // 0행 2열
        arr[1][0] = 4; // 1행 0열
        arr[1][1] = 5; // 1행 1열
        arr[1][2] = 6; // 1행 2열

        // 2차원 배열 중첩분
        for (int row =0; row < 2; row++) { // 0, 1행을 반복해서 접근 for문
            for (int col = 0; col < 3; col++) {
                System.out.print(arr[row][col] + "");
            }
            System.out.println();
        }


/*            System.out.print(arr[row][0] + " ");
            System.out.print(arr[row][1] + " ");
            System.out.print(arr[row][2] + " ");
            System.out.println();
*/
    }

}
