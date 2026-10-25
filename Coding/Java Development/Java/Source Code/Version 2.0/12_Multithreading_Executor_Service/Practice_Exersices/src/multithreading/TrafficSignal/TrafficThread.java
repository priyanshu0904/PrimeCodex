package multithreading.TrafficSignal;

public class TrafficThread extends Thread{
    private final TrafficLightColor color;


    public TrafficThread(TrafficLightColor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s active\n", color);
        try {
            Thread.sleep(color.getOnTimeInMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s is inactive now\n", color);
    }
}
