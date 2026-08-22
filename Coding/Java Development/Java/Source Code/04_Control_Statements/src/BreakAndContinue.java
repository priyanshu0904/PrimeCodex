public class BreakAndContinue {
    public static void main(String[] args) {
        System.out.println("Break statement");
        //break -> switch for preventing fall through
        //to stop a loop immediately where it is and break out of a loop
        System.out.println("Inside Loop");
        for(int i = 1; true; i++){
            if(i == 101){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Outside Loop");

        System.out.println();
        System.out.println("Continue");
        //continue -> skip one iteration or current iteration
        //while loop -> update before using continue, otherwise infinite loop, all other loop self does this
        for(int i = 1; i <= 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
    }
}
