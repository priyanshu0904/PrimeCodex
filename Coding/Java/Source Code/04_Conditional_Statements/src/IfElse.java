public class IfElse {
    public static void main(String[] args) {
        //If else is also called as branching or control statements

        boolean isMale = true;
        String name = "Priyanshu";

        System.out.println("Before if");
        if(isMale){
            System.out.println("Mr. " + name);
        }
        else
            System.out.println("Mrs. " + name);
        //You can remove the curly braces from if or else if there is only one statement inside it.

        System.out.println("After if");

        //if-else ladder
        boolean isSeniorCitizen = true;
        boolean isAnAdult = false;
        if(isSeniorCitizen){
            System.out.println("Hello Uncle....");
        }
        else if(isAnAdult){
            System.out.println("Hello Bhaiyaaaa.....");
        }
        else{
            System.out.println("Hello Babuuu....");
        }

        //nested if-else
        int age = 25;
        boolean hasLicense = true;

        if(age >= 18){
            if(hasLicense){
                System.out.println("You are eligible so it is not illegal to have license.");
            }
            else{
                System.out.println("You can apply for the license because you are eligible.");
            }
        }
        else{
            if(hasLicense){
                System.out.println("It is illegal to have a license before 18.");
            }
            else{
                System.out.println("You deserve reward.");
            }
        }
    }
}
