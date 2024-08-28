package modifier;

public class Time {
    // 속성: 시, 분, 초(float)
    private int hour;
    private int minute;
    private float second;

    // 생성자
    public Time() {
    }

    public Time(int hour, int minute, float second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    // getter 메소드 작성
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public float getSecond() {
        return second;
    }
}
