package inheritance.Person;

public class Test {
    static void main(String[] args) {
        Person p1 = new Person("Priyanshu", 22);
        Person p2 = new Person("Priyanshu", 22);
        Person p3 = new Person("Priyanshu", 23);

        if(p1.equals(p2)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        if(p1.equals(p3)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }
}
