package functionalProgramming;

import java.util.List;

public class FilteringArray {
    static void main(String[] args) {
        List<String> list = List.of("Priyanshu", "Raj", "Alok", "Raja", "Nitish", "GhatiyaLogHaiYeSb");
        String result = list.stream()
                .filter(str -> str.length() < 10)
                .reduce("", (a,b) ->a + " " + b);
        System.out.println(result);
    }
}
