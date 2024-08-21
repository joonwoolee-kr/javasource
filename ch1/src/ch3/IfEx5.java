package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        // 근무시간에 따른 임금 계산
        // 근무시간 입력받기
        // 8시간까지 시간당 기본임금(10000) 제공
        // 초과근무시간은 시간당 기본임금 1.5배 제공

        Scanner sc = new Scanner(System.in);
        System.out.print("근무시간 입력: ");

        int hours = sc.nextInt();
        int rate = 10000, pay = 0;

        if (hours <= 8) {
            pay = rate * hours;
        } else {
            pay = (int) (rate * 8 + (rate * (hours - 8) * 1.5));
        }

        System.out.printf("근무시간: %d, 임금: %d\n", hours, pay);

        sc.close();
    }
}
