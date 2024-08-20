package ch1;

public class VarLongEx1 {
    public static void main(String[] args) {
        // long타입: 뒤에 L or l (생략 가능하나 붙여주는 편)
        long value = 123456789L;

        value = 1000000000000L;

        System.out.println(value);
        // print() 메소드 안의 +는 연결을 의미(""와 연결될 때)
        System.out.println("value = " + value);
        // 산술연산
        System.out.println(value + value);
    }
}
