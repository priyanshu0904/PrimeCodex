package com.ConditionalStatements.IfElse;

public class IfElse {
    public static void main(String[] args) {
        //if-else is also called as branching or decision-making or conditional statements.
        //Firstly the condition will be checked
        //Important, only one of all the block will execute wherever the condition true for first time.

        //You can use only if without else
        int a = 9;
        if(a == 9){
            System.out.println("Hello 9......");
        }

        //traditional and basic if-else statement
        boolean isMale = true; //using variable to store the conditional value
        String name = "Priyanshu";

        System.out.println("Before if");

        //if the condition is true then if block executed otherwise the else block.
        if(isMale){ //condition can store in variable
            System.out.println("Mr. " + name);
        }
        else
            System.out.println("Mrs. " + name);
        //You can remove the curly braces from if or else if there is only one statement inside it. It is valid till first semicolon.

        System.out.println("After if");

        //if-else ladder
        boolean isSeniorCitizen = true;
        boolean isAnAdult = false;
        if(isSeniorCitizen){
            System.out.println("Hello Uncle....");
        }
        else if(isAnAdult){
            System.out.println("Hello Bhaiyaaaa.....");
        }
        else{
            System.out.println("Hello Babuuu....");
        }

        //nested if-else
        int age = 25;
        boolean hasLicense = true;

        if(age >= 18){
            if(hasLicense){
                System.out.println("You are eligible so it is not illegal to have license.");
            }
            else{
                System.out.println("You can apply for the license because you are eligible.");
            }
        }
        else{
            if(hasLicense){
                System.out.println("It is illegal to have a license before 18.");
            }
            else{
                System.out.println("You deserve reward.");
            }
        }
    }
}
