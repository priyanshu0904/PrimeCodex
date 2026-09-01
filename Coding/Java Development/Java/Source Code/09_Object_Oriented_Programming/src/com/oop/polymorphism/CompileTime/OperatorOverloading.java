package com.oop.polymorphism.CompileTime;

public class OperatorOverloading {
    //in java you can not add two objects directly with the operator
    //in java user-defined operator overloading is not possible

    static class Complex{
        //object of static inner class can be directly created
        int real;
        int imaginary;

        public Complex(int real, int imaginary) {
            this.real = real;
            this.imaginary = imaginary;
        }

        Complex add(Complex other){
            return new Complex(
                    this.real + other.real,
                    this.imaginary + other.imaginary
            );
        }

        void display(){
            System.out.println(real + " + " + imaginary + "i");
        }
    }

    static void main(String[] args) {
        Complex c1 = new Complex(2,8);
        Complex c2 = new Complex(8,6);

        Complex c3 = c1.add(c2); //c1 is using method of its class
        //c3 = c1 + c2;
        //in java this is not possible

        c1.display();
        c2.display();
        c3.display();

        //Perfect example of operator overloading is
        System.out.println(8 + 9);
        System.out.println("Priyanshu " + "Raj");
        //+ can do addition as well as concatenation, built-in
    }
}
