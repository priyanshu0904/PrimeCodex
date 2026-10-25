import java.util.Scanner;

public class ExitOnExit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PrimeCodex ExitOnExit...");
        while(true){
            System.out.print("Enter your command: ");
            String command = sc.next();
//            if(command.equals("exit")){
//                break;
//            }
            //String is object, and objects can not be directly compared by ==
            //== only checks references

            if(command.equalsIgnoreCase("exit")){
                break;
                //use to make it case-insensitive
            }
        }
        System.out.println("You have successfully exited");
    }
}
