package basic.theory;

public class Constructor {
    int age;
    String name;
    float marks;

//    Constructor(){
//        //No argument constructor, sets some initial value
//        age = 15;
//        name = "Priya";
//    }

    //Constructor(); call by JVM if no constructor is explicitly defined

    Constructor(int age){
        //Parameterized constructor, you can use all variables as parameters
        this.age = age;
        name = "Priyanshu";
    }

    Constructor(){
        //constructor chaining
        this(15); // must be first line
        name = "Billu";
    }
    public static void main(String[] args) {

    }
}
