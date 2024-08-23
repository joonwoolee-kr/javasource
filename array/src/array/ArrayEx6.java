package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 79, 88, 91, 33, 100, 55, 95 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기
        int max = scores[0];
        int min = scores[0];

        for (int i : scores) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.printf("가장 큰 값: %d\n가장 작은 값: %d", max, min);
    }
}
