package modifier;

public final class FinalTest {
    final int MAX_SIZE = 10;

    final int getMaxSize() {
        // final 지역 변수: 상수와 같은 역할
        final int LV = MAX_SIZE;
        return MAX_SIZE;
    }
}

// class A extends FinalText{} (X)