public class PalindromeArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Array Palindrome Finder....");
        int[] numsArray = ArrayUtility.inputArray();

        if(isPalindrome(numsArray)){
            System.out.println("The given array is Palindrome.");
        }
        else{
            System.out.println("Not a Palindrome Array.");
        }
    }

    public static boolean isPalindrome(int[] arr){
        int i = 0;
        while(i < arr.length / 2){
            if(arr[i] != arr[arr.length - 1 - i]){
                return false;
            }
            i++;
        }
        return true;
    }
}
