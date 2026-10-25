package multithreading.Greeting;

public class Test {
    static void main(String[] args) {
        GreetingThread greet1 = new GreetingThread(1);
        GreetingThread greet2 = new GreetingThread(2);

        greet1.start();
        //greet2.run(); //calls from main thread not from greet2
        greet2.start();
    }
}
