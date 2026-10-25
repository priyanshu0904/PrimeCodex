package com.JavaBasics.Errors;

public class Logical {
    static void main(String[] args) {
        int a = 4;
        //developer's mistake, can't detect by compiler or during runtime
        //logical error, use QA(Quality assurance) detector
        System.out.println("The square of 4 is " + (4 / 4));

        //developer have to do this
        //System.out.println("The square of 4 is " + (4 * 4));
    }
}
