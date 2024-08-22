package ch4;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // for, while과 다른 점: {}를 수행한 후 조건식을 검사
        // 최소 1번은 실행
        // do {

        // } while (condition);

        // 1 ~ 100 사이의 임의의 숫자를 추출한 후 해당 숫자 알아맞추기

        // 임의의 숫자 추출
        int answer = (int) (Math.random() * 100) + 1;
        int input = 0;

        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("1 ~ 100 사이의 숫자 입력 >> ");
            input = sc.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수를 입력해 주세요");
            } else if (answer > input) {
                System.out.println("더 큰 수를 입력해 주세요");
            }
        } while (answer != input);
        System.out.println("정답입니다!! 프로그램 종료");

        sc.close();
    }
}
