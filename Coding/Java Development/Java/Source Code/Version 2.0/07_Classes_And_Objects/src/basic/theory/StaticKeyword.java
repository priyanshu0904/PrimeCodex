package basic.theory;

public class StaticKeyword {
    static int minimumAge = 18; //used by all the objects, just by class name, can use by creating object but not recommended 

    //used by only non-static and static members, by creating objects
    int salary;
    String name = "Priyanshu";
    public static void staticMethod(){
        System.out.println("Used by directly class name");
    }

    public int returnNumber(int num){
        return num;
        //used by creating object
    }

    static{
        //static block, calls only once when class is loaded
    }

    {
        //Initialization block, runs everytime the object of class created
    }
    public static void main(String[] args) {
        System.out.println(StaticKeyword.minimumAge);
        StaticKeyword.staticMethod();
        System.out.println(minimumAge); //can be directly use in same class
        staticMethod();//can beb directly used in same class

        StaticKeyword obj = new StaticKeyword();
        System.out.println(obj.name);
        System.out.println(obj.returnNumber(15));
    }
}
