package array;

public class ArrayEx2 {
    public static void main(String[] args) {
        // 10명의 수학 점수를 관리
        // 배열 선언, 생성(배열 요소의 값이 정해져 있는 경우)
        int jumsu[] = { 88, 78, 69, 55, 45, 66, 78, 72, 53, 22 };

        int sum = 0;

        // 수학 점수 출력
        for (int i = 0; i < jumsu.length; i++) {
            System.out.printf("학생 %d번의 수학 점수: %d\n", i + 1, jumsu[i]);
            // 합계
            sum += jumsu[i];
        }

        // 10명의 점수 합계와 평균 출력
        System.out.printf("점수 총합: %d, 평균: %d", sum, sum / jumsu.length);
    }
}
