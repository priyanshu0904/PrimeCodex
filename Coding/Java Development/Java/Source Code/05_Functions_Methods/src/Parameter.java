public class Parameter {
    public static void main(String[] args) {
        //Function invoke
        int num = addition(55, 88); //Arguments, no data-type required
        //The copy of the arguments are send to the definition, not original value
        System.out.println(num);
        System.out.println(addition(47, 78) + " and the number is " + num);
        //before evaluating the expression, function works first replaces result and then evaluation based on operators
    }

    public static int addition(int num1, int num2){ //Parameters
        //Parameters are written with data-type, can be multiple
        //We can set default value of parameter
        System.out.println("First number received: " + num1);
        System.out.println(); //This is also a method
        System.out.println("Second number received: " + num2);
        int sum = num1 + num2;
        return sum;
    }
}
