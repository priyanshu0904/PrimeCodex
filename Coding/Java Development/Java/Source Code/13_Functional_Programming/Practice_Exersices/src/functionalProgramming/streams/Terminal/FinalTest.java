package functionalProgramming.streams.Terminal;

import java.util.List;

public class FinalTest {
        static void main(String[] args) {
            List<String> nums = List.of("1", "2", "3", "4", "5");

            nums.stream()
                    .map(str -> Integer.parseInt(str))
                    .map(num -> Math.pow(num, 2))
                    .reduce((a, b) -> a+b)
                    .ifPresent(System.out::println);
        }
    }