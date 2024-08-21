package ch3;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 3개의 숫자를 입력 받은 후 입력 받은 3개의 숫자 중 가장 작은 수 출력

        Scanner sc = new Scanner(System.in);
        System.out.printf("첫번째 숫자 입력: ");
        int a = sc.nextInt();
        System.out.printf("두번째 숫자 입력: ");
        int b = sc.nextInt();
        System.out.printf("세번째 숫자 입력: ");
        int c = sc.nextInt();

        // int min = a;

        // if (min > b) {
        // min = b;
        // }
        // if (min > c) {
        // min = c;
        // }
        //
        // System.out.println("제일 작은 수는: " + min);

        // 제일 큰 수 출력
        int max = a;

        if (max < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        System.out.println("제일 큰 수는: " + max);

        sc.close();
    }
}
