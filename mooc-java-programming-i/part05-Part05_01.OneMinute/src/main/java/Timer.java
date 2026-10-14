public class Timer{
    private ClockHand second;
    private ClockHand miliSecond;

    public Timer() {
        this.second = new ClockHand(60);
        this.miliSecond = new ClockHand(100);
    }

    public void advance() {
        this.miliSecond.advance();

        if(this.miliSecond.value() == 0) {
            second.advance();
        }
    }

    public String toString() {
        return second + ":" + miliSecond;
    }
}