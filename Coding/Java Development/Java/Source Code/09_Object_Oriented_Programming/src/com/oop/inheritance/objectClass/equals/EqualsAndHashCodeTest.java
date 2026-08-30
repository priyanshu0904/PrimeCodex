package com.oop.inheritance.objectClass.equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person man = new Person("Priyanshu", 22, "001");
        Person woman = new Person("Priyanshu", 22, "001");
        Person women = new Person("Priyanshu", 23, "001");

        if(man == woman){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }//answer is Not Equal, bcoz two diff object in heap, diff reference
        //== checks reference

//        if(man.equals(woman)){
//            System.out.println("Equal");
//        }else{
//            System.out.println("Not Equal");
//        }//Also not equal, java defines the equals() for just checking reference

        if(man.equals(woman)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }//redefined equals, now answer is Equal

        if(man.equals(women)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        //String class define it's equal, so no issue in that

        System.out.println(man.hashCode());
        System.out.println(woman.hashCode());
        System.out.println(women.hashCode());
    }
}
