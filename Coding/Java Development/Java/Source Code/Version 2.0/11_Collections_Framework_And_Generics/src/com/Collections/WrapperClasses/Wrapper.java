package com.Collections.WrapperClasses;

import com.sun.jdi.InvalidTypeException;

public class Wrapper {
    //it provides a way to use primitive data types as object
    //java automatically converts between primitive type and their corresponding wrapper class
    //once created, the value of wrapper object can not be changed, they are final class
    //each wrapper classes has useful utility methods compareTo(), valueOf(), parseInt etc
    //required to store primitives in collections object
    static void main(String[] args) {
        Integer first = Integer.valueOf(5);
        first.byteValue();
        first.compareTo(22);

        Integer second = Integer.valueOf("String");// it returns the converted value of string to int
        Integer third = 55;

        //int a = null;
        Integer a = null; //it allows to assign null to primitive values when needed

        int copy = first;

        //wrapper classes
        //Object ---> Number(Byte, Short, Integer, Long, Float, Double), Boolean, Character
    }
}
