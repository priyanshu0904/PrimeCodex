package multithreading.TrafficSignal;

public class Road {
    static void main(String[] args) throws InterruptedException {
        TrafficThread red = new TrafficThread(TrafficLightColor.RED);
        TrafficThread yellow = new TrafficThread(TrafficLightColor.YELLOW);
        TrafficThread green = new TrafficThread(TrafficLightColor.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();
        red.join();
    }
}
