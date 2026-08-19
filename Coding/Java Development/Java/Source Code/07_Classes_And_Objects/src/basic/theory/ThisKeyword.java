package basic.theory;

public class ThisKeyword {
    int age;
    String name;
    public void greet(){
        System.out.println("Hello ji....");
    }

    public int age(int age){
        return age;
    }

    public void display(){
        System.out.println("Your age is " + age(this.age));
        //this can be used as passing agrument
    }

    ThisKeyword(int age, String name){ //Paarameters -> high priority
        //Use "this" to refer member of this object
        this.age = age;
        this.name = name;
        this.greet(); //To invoke the method of current object
        //This used to indicate that this member is of this object
    }

    ThisKeyword(){
        //constructor chaininng
        this(18, "Priyanshu");
        //To invoke same constructor in same class
    }
    public static void main(String[] args) {
        //This used to refer current class or object
        ThisKeyword key = new ThisKeyword();

    }
}
