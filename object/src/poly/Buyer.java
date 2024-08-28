package poly;

public class Buyer {
    int money = 1000; // 고객이 가지고 있는 돈
    int bonusPoint = 0;

    void buy(Computer computer) {
        // money보다 물건 가격이 적은지 확인
        if (money < computer.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }

        // money = money - 물건 가격
        money -= computer.price;
        // 보너스 포인트 = 보너스 포인트 + 구입 가격에 따른 포인트
        bonusPoint += computer.bonusPoint;
        System.out.println(computer + "을/를 구입하셨습니다.");
    }

    void buy(Air air) {
        // money보다 물건 가격이 적은지 확인
        if (money < air.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }

        // money = money - 물건 가격
        money -= air.price;
        // 보너스 포인트 = 보너스 포인트 + 구입 가격에 따른 포인트
        bonusPoint += air.bonusPoint;
        System.out.println(air + "을/를 구입하셨습니다.");
    }
}
