package functionalProgramming.streams.Intermediate;

import java.util.Comparator;
import java.util.List;

public class TestSalary {
    static void main(String[] args) {
        List<SortBySalary> employee = List.of(
                new SortBySalary("Priyanshu", 55000),
                new SortBySalary("Priya", 29000),
                new SortBySalary("Raj", 15000),
                new SortBySalary("Alok", 30000),
                new SortBySalary("Raja", 15000)
        );

        employee.stream()
                .sorted((emp1, emp2) -> Integer.compare(emp1.getSalary(), emp2.getSalary()))
                .forEach(System.out::println);
    }
}
