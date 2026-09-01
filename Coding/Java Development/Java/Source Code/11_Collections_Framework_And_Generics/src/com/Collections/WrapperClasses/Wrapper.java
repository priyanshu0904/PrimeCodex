package com.Collections.WrapperClasses;

import com.sun.jdi.InvalidTypeException;

public class Wrapper {
    static void main(String[] args) {
        Integer first = Integer.valueOf(5);
        first.byteValue();
        first.compareTo(22);

        Integer second = Integer.valueOf("String");
        Integer third = 55;

        //int a = null;
        Integer a = null;

        int copy = first;
    }
}
