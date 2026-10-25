package functionalProgramming.streams;

import java.util.List;

public class PrintArrayUsingStream {
    static void main(String[] args) {
        List<String> list = List.of("Priyanshu", "Raj", "Priya", "Alok", "Raja", "Nitish");
        list.stream()
                .forEach(name -> System.out.println(name));
    }
}
