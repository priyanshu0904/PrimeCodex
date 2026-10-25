import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;

public class SwapElement {
    static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(nums);
        swap(nums, 2, 7);
        System.out.println(nums);
    }

    public static void swap(List<Integer> nums, int x, int y){
        int swap = nums.get(x);
        nums.set(x, nums.get(y));
        nums.set(y, swap);
    }
}
