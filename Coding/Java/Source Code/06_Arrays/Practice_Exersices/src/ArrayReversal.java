public class ArrayReversal {
    public static void main(String[] args) {
        System.out.println("Welcome to PrimeCodex Array Reversal.....");
        int[] numsArray = ArrayUtility.inputArray();

        reverseArray(numsArray);
        System.out.println("Reversed array is:");
        ArrayUtility.displayArray(numsArray);
    }

    public static void reverseArray(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }
    }
}
