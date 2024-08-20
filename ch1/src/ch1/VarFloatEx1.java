package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // float타입: 뒤에 F or f (실수는 double을 기본 타입으로 인식하기 때문에 F or f 필요)
        float score = 90.14F;

        // double타입: 뒤에 D or d (생략 가능)
        double score2 = 98.5D;
        score2 = 90d;

        System.out.println("socre = " + score);
        System.out.println("socre2 = " + score2);

        // 큰 타입 = 작은 타입 O
        int value1 = 92;
        double score3 = value1;
        System.out.println("socre3 = " + score3);

        // 작은 타입 = 큰 타입 X => 처리 할 수는 있으나 값의 손실이 일어 날 수 있음
        // int value2 = score2;
    }
}
