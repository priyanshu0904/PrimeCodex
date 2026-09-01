import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseList {
    static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(nums);
        reverse(nums);
        System.out.println(nums);
    }

    public static void reverse(List<Integer> nums){
        //Collections.reverse(nums);

        for (int i = 0; i < nums.size() / 2; i++) {
            SwapElement.swap(nums, i, nums.size() - 1 - i);
        }
    }
}
