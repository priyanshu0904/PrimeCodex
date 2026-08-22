public class ForLoop {
    public static void main(String[] args) {
        //loop concepts in while loop file
        //for loop -> restructured while loop -> most used loop (standard loop) -> preferred for counting iteration
        //for(initialization(one time); condition; update) -> condition check - execute - update again same till condition false

        System.out.println("Print counting");
        int i = 1;
        while(i <= 100){
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        //all things in one line of loop
        for(int j = 1; j <= 100; j += 2){
            System.out.print(j + " ");
        }
    }
}
