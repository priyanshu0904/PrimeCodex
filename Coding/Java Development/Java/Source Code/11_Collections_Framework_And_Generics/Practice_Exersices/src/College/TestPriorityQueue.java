package College;

import java.util.Comparator;
import java.util.PriorityQueue;

public class TestPriorityQueue {
    static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        queue.offer(new Student("Priyanshu", 'B'));
        queue.offer(new Student("Priya", 'A'));
        queue.offer(new Student("Raj", 'B'));
        queue.offer(new Student("Aarya", 'D'));
        queue.offer(new Student("Raja", 'C'));

        System.out.printf("Queue is: %s\n", queue);
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }

}
