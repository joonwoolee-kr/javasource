package ch3;

import java.util.Scanner;

public class IfEx4 {
    public static void main(String[] args) {
        // 숫자를 하나 입력받은 후 짝수인지 홀수인지 출력

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자 입력: ");

        int input = sc.nextInt();

        if (input % 2 == 0) {
            System.out.println("짝수");
        } else {
            System.out.println("홀수");
        }

        sc.close();
    }
}
