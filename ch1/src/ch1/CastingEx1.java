package ch1;

public class CastingEx1 {
    public static void main(String[] args) {
        // 형변환(casting): 현재 타입을 다른 타입으로 변환
        // 형변환 방법: (변경할 타입)변수명

        double d = 85.4;
        // 작은 타입 = 큰 타입
        int score = (int) d;
        System.out.printf("score = %d", score);

        // 자동형변환: 자동으로 발생
        // 큰 타입 = 작은 타입
        // byte -> short -> int -> long -> float -> double
        // char -> int -> long -> float -> double
        byte byteValue = 10;
        int intValue = byteValue;
        System.out.printf("int 형변환 후 %d\n", intValue);

        long longValue = intValue;
        System.out.printf("long 형변환 후 %d\n", longValue);

        double doubleValue = longValue;
        System.out.printf("double 형변환 후 %f\n", doubleValue);

        System.out.println("---------------------------");

        char ch = 'a';
        intValue = ch;
        System.out.printf("int 형변환 후 %d\n", intValue);

    }
}
