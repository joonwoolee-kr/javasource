package classtest;

public class Circle {
    // 클래스 내에 선언순서 상관없음
    // 속성, 생서자, 메소드 순으로 주로 함

    // 속성
    private double radius; // 반지름(radius): 3.5

    // 생성자
    public Circle(double radius) {
        this.radius = radius;
    }

    // 기능
    // 원의 넓이: 반지름 * 반지름 * 3.14
    double getArea() {
        return radius * radius * 3.14;
    }
}
