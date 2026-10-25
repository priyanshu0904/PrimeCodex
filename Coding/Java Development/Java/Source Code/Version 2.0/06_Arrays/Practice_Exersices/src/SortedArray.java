public class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to PrimeCodex Array Sorting CheckPost...");
        int[] numsArray = ArrayUtility.inputArray();

        if(isAscending(numsArray) || isDescending(numsArray)){
            System.out.println("The Given Array is Sorted....Congratulations 👏");
        }
        else{
            System.out.println("The Given Array is not Sorted...");
        }
    }

    public static boolean isAscending(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] < arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDescending(int[] arr){
        int i = 1;
        while(i < arr.length){
            if(arr[i] > arr[i-1]){
                return false;
            }
            i++;
        }
        return true;
    }
}
