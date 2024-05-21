package array;

public class ArrayDi4 {

    public static void main(String[] args) {
        // 2x3 2차원 배열 선언 및 생성
        int[][] arr = new int[2][3];

        // 하나씩 증가되는 값 추가
        int i = 1;

        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = i++; // i의 값은 1씩 증가됨
                System.out.print(arr[row][col] + " ");
            }
            System.out.println(); // 반복문 돌 때마다 줄 나누기
        }
        // 1 2 3
        // 4 5 6
    }
}