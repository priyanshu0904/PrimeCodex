public class MathClass {
    public static void main(String[] args) {
        //all the math methods are static, use directly by class name
        //constants -> PI, E, and base of natural log

        System.out.println(Math.abs(-99)); //absolute value, input and output -> int
        System.out.println(Math.ceil(5.09)); //ceil value, always up, input -> double and output -> floating-point value
        System.out.println(Math.floor(5.09)); //floor value, always down, input -> double and output -> floating-point value
        System.out.println(Math.round(5.09)); //round off to nearest integer, input -> double and output -> long
        System.out.println(Math.round(5.59));
        System.out.println(Math.max(89, 88)); //maximum of two numbers, input and output -> int,double
        System.out.println(Math.min(89, 88)); //minimum of two numbers, input and output -> int, double
        System.out.println(Math.pow(2, 3)); //power of any number, input and output -> double
        System.out.println(Math.sqrt(441)); //square root of any number, input and output -> double
        System.out.println(Math.random()); //random number between 0.0 and 1.0, 1.0 exclusive, output -> double
        System.out.println(Math.PI); //constant pi, double
        System.out.println(Math.E); //constant e, double
        System.out.println(Math.exp(2)); //input and output -> double, result -> e^input
        System.out.println(Math.log(8)); //input and output -> double, result -> log(input), base->e
        System.out.println(Math.sin(180)); //input and output -> double, angle in radians, returns sin(input)
        System.out.println(Math.cos(180)); //input and output -> double, angle in radians, returns cos(input)

        for (int i = 0; i < 10; i++) {
            int random = (int) Math.round(Math.random() * 100);
            System.out.println(random);
        }

        //Don't learn syntax -> use-google, official documentation, ChatGPT, common logic
        //there are many things in JAVA, you can't write everything on this PrimeCodex, so use documentation, some books, some tutorials and build projects
    }
}
