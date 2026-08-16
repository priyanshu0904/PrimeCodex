import java.util.Scanner;

class WelcomeProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = sc.nextLine();

        while(true){
            if(name == ""){ //Check empty string
                System.out.print("You have to enter something: ");
                name = sc.nextLine();
            }
            else{
                System.out.println("Welcome " + name + ", to JAVA");
                break;
            }
        }
    }
}
