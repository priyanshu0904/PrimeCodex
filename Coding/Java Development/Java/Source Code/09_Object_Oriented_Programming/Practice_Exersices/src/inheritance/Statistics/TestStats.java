package inheritance.Statistics;

public class TestStats {
    static void main(String[] args) {
        ArrayOperations arr = new ArrayOperations(new int[]{1,3,5,9,11});
        ArrayOperations.Statistics stats =arr.new Statistics();
        System.out.println(stats.mean());
        System.out.println(stats.median());
    }
}
