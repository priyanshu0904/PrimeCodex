import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        //To find the greatest of three numbers
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter three numbers by pressing enter: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        System.out.print("The Greatest of these three is ");
//        if(num1 >= num2){
//            if(num1 >= num3){
//                System.out.println(num1);
//            }
//            else{
//                System.out.println(num3);
//            }
//        }
//        else{
//            if(num2 >= num3){
//                System.out.println(num2);
//            }
//            else{
//                System.out.println(num3);
//            }
//        }

        if(num1 >= num2 && num1 >= num3){
            System.out.println(num1);
        }
        else if(num2 >= num3){
            System.out.println(num2);
        }
        else{
            System.out.println(num3);
        }
    }
}
