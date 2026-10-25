package com.oop.polymorphism.FinalKeyword.Variable;

public class FinalVariable {
    public final int issueYear = 2001; //becomes constant

    public final String bookName;

    //final variable must initialize before constructor completes, reducing null pointers error
    FinalVariable(String bookName){
        this.bookName = bookName;
    }

    public void print(){
        System.out.println("The issued year of this book is: " + issueYear);
    }

    static void main(String[] args) {
        FinalVariable fv = new FinalVariable("RD Sharma Maths");
        fv.print();
        System.out.println("Printing issued year: " + fv.issueYear);

        //fv.issueYear = 2002; //final variable can not be changed once initialized
    }
}
