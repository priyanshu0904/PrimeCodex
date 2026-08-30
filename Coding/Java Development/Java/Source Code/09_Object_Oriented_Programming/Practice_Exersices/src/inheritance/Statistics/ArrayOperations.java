package inheritance.Statistics;

public class ArrayOperations {
    private int[] numbers;

    public ArrayOperations(int[] numbers){
        this.numbers = numbers;
    }

    public class Statistics{
        double mean(){
            double sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum / numbers.length;
        }

        double median(){
            int num = numbers[numbers.length/2];
            return num;
        }
    }
}
