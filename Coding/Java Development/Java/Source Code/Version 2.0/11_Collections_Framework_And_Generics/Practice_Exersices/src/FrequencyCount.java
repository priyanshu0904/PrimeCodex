import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyCount {
    static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(9);
        nums.add(5);
        nums.add(8);
        nums.add(5);
        System.out.println(Collections.frequency(nums, 5));
        System.out.println(Collections.frequency(nums, 9));
        System.out.println(Collections.frequency(nums, 7));
    }
}
