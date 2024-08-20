package ch1;

import java.util.*;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 대문자로 시작한다면 class or interface로 생각
        // Scanner 가 어디에 선언된 클래스인지 알려줘야 함
        // System.in(키보드) 으로부터 입력 받기 위해 필요한 객채
        // System.out(화면)
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 입력해 주세요 >> ");
        String input = sc.nextLine();
        // 문자열을 정수로 변경 후 num 변수에 저장
        int num = Integer.parseInt(input);

        System.out.println("입력내용: " + input);
        System.out.printf("num = %d\n", num);

        sc.close();
    }
}
