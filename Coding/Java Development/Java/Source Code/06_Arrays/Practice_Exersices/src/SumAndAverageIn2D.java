public class SumAndAverageIn2D {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum and Average Calculator of 2D Array....");
        int[][] numsArray = ArrayUtility.input2DArray();

        long sum = sum(numsArray);
        double average = average(numsArray);

        System.out.println("The sum of elements of this 2D array is " + sum + " and the average is " + average + ".");
    }

    public static long sum(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int i = 0;
        int sum = 0;
        while(i < arr.length){
            int j = 0;
            while(j < arr[0].length){
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] arr){
        if(arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        double size = rows * cols;
        return sum(arr) / size;
    }
}
