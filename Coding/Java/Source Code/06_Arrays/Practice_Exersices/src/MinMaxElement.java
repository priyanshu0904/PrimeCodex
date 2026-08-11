public class MinMaxElement {
    public static void main(String[] args) {
        System.out.println("Welcome to MinMax Finder in an Array...");
        int[] numsArray = ArrayUtility.inputArray();

        int minElement = minArray(numsArray);
        int maxElement = maxArray(numsArray);

        System.out.println("The minimum element of this array is " + minElement);
        System.out.println("The maximum element of this array is " + maxElement);
    }

    public static int minArray(int[] arr){
        if(arr.length == 0){ //If 0 is not handled then ArrayOutOfBoundException occurs
            return Integer.MAX_VALUE;
        }
        int min = arr[0];
        int i = 1;
        while(i < arr.length){
            if(min > arr[i]){
                min = arr[i];
            }
            i++;
        }
        return min;
    }

    public static int maxArray(int[] arr){
        int max = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            if(max < arr[i]){
                max = arr[i];
            }
            i++;
        }
        return max;
    }
}
