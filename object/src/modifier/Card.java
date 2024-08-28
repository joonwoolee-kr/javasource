package modifier;

public class Card {
    // The blank final field NUMBER may not have been initialized
    // The blank final field KIND may not have been initialized
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    Card(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 2);
    }

    @Override
    public String toString() {
        return KIND + " " + NUMBER;
    }
}
