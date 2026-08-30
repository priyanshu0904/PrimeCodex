package com.oop.inheritance.objectClass.equalsAndHashCode;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String id;

    public Person(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", id='").append(id).append('\'');
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public boolean equals(Object obj) {
//        //return super.equals(obj); -> super means, run this of my parent
//        if(!(obj instanceof Person)){ //checks whether they are of same class or not
//            return false;
//        }
//        Person per = (Person) obj;
//        return per.name.equals(name) &&
//                per.age == age &&
//                per.id.equals(id);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(name, age, id);
//    }


    @Override
    public boolean equals(Object o) {
        //checks logical equality of object, by default compares references, overridden to compare object states
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o; //type casting of class
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(id, person.id);
    }

    @Override
    public int hashCode() {
        //generates integer hashcode representation of an object, crucial for HashMap etc
        return Objects.hash(name, age, id);
    }

    //Equals-HashCode Contract: if two object are equal based on equals(), they must have same hashcode
    //but two objects with same hashcode are not necessarily equal

    //override both, equals() and hashCode() to maintain consistency between them

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
