package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};

        // 일반 for문 - 직접 인덱스 i 선언, 증가 루프 돌림
        for (int i = 0; i< numbers.length; i++){
            int number = numbers[i];
            System.out.println(number); // 1 2 3 4 5
        }

        // 향상된 for문, for-each문 - 배열을 처음부터 전체를 순회함
        for(int number : numbers){ // 배열(numbers)에 있는 값을 다 돈다.
            System.out.println(number);
        }

        // iter 단축키 배열 자동 생성
/*        for (int number : numbers) {
            
        }
*/

        // for-each문을 사용할 수 없는 경우 = 증가하는 index 값 필요 = i
        for (int i = 0; i < numbers.length; i++){
            System.out.println("number" + i + "번의 결과는:" + numbers[i]);
        }
    }
}