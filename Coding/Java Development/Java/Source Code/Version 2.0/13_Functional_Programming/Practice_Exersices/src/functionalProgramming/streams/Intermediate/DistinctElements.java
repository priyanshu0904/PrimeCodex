package functionalProgramming.streams.Intermediate;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,1,2,5,3,6,8,2,4);
        List<Integer> newNums = nums.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(nums);
        System.out.println(newNums);
    }
}
