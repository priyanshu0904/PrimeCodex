package basic.theory;

public class InstanceVariablesAndMethods {
    //Instance variables -> Variable or properties or attribute of this object of this class
    //Use variables that are relevant to work, some variable change some not
    int minAgeToGetMarried = 25;
    String name = "Priyanshu";
    float expenses;

    //Instance methods -> Methods applied on object of this class
    public void greet(){
        System.out.println("Hello " + name);
    }

    //Main method, JVM find this only to start execution
    public static void main(String[] args) {
        //Creating object of class to use its Instance members
        InstanceVariablesAndMethods ins = new InstanceVariablesAndMethods();
        ins.greet();
        System.out.println(ins.name);
        System.out.println(ins.minAgeToGetMarried);

        System.out.println("Hello World!!!!");

        System.out.println("Properties of any class is Instance variables.");
        System.out.println("Methods of any class is Instance methods which is used by the objects of that class.");
        System.out.println("Some instance variable may remains constant.");
    }
}
