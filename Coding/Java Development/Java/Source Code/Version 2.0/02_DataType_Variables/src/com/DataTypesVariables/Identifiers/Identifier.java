package com.DataTypesVariables.Identifiers;

public class Identifier {
    public static void main(String[] args) {
        //a-z, A_Z, 0-9, $, _
        int employeeId = 55;
        float employee$Id = 88;
        //int employee#Id = 12;

        //no reserved word
        int totalValue = 100;
        //int for = 50;

        //can use predefined class and interface
        int Double = 1000;
        int Runnable = 5000;
        String String = "Valid";
        System.out.println(Double);
        System.out.println(Runnable);
        System.out.println(String);

        //can't start with digit
        int year2026 = 2026;
        //int 2026year = 2026;

        //case-sensitive
        int BaseSalary = 5000;
        int baseSalary = 5100;
        int BASESALARY = 5200;

        //don't use long identifiers
        int quarterlyRevenueForEasterRegion = 50000;
        System.out.println(quarterlyRevenueForEasterRegion);
    }
}
