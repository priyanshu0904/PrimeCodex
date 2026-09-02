package functionalProgramming.functionalInterface;

public class TestCandidate {
    static void main(String[] args) {
        Candidate candidate = num -> {
            for (int i = 2 ; i < num/2; i++) {
                if(num % i == 0){
                    return false;
                }
            }
            return true;
        };

        System.out.println(candidate.isCandidate(5));
    }
}
