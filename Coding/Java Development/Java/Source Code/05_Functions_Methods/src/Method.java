public class Method {
    public static void main(String[] args) {
        //Blocks of reusable code, performs specific tasks
        //void - data_type (returns nothing)
        //JVM calls only main() method, all other methods are linked to it

        System.out.println("In main method");
        greeting(); //Method calling
        System.out.println("Method calling complete.");
    }

    //Method declaration and definition
    public static void greeting(){
        //Performs specific task, to greet anyone
        System.out.println("Hello Ji.....");
    }
}