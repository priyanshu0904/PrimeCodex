package com.DataTypesVariables.Constants;

public class Constants {
    public static void main(String[] args) {
        int intrestRate = 5;
        System.out.println(intrestRate);
        intrestRate = 9;
        System.out.println(intrestRate);
        //value changed, but this is issue

        //Make them constant
        final int intrest = 5; //using final keyword
        System.out.println(intrest);
        //intrest = 9; //can't do that
        System.out.println(intrest);
    }
}
