package multithreading.TrafficSignal;

public enum TrafficLightColor {
    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private int onTimeInMillis;

    TrafficLightColor(int onTimeInMillis) {
        this.onTimeInMillis = onTimeInMillis;
    }

    public int getOnTimeInMillis() {
        return onTimeInMillis;
    }
}
