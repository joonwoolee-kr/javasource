package ch4;

public class WhileEx3 {
    public static void main(String[] args) {
        // 주사위 2개를 굴려 2개의 합이 5와 같으면 반복문 종료
        int dice1 = 0, dice2 = 0;

        while (true) {
            dice1 = (int) (Math.random() * 6) + 1;
            dice2 = (int) (Math.random() * 6) + 1;

            System.out.printf("(%d, %d)\n", dice1, dice2);

            if (dice1 + dice2 == 5) {
                break;
            }
        }
    }
}
