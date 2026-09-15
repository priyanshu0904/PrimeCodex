package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        System.out.println("Welcome to Tic-Tac-Toe...\n");
        do{
            System.out.print("""
                    \nChoose an Option:
                    1. Play Game
                    0. Exit
                    """);
            System.out.print("Pick one: ");
            int option = sc.nextInt();

            switch (option){
                case 1 -> System.out.println("Played");
                case 0 -> {
                    System.out.println("Exiting Game....See u soon");
                    flag = false;
                }
                default -> System.out.println("Choose the correct value");
            }
        }while(flag);
    }
}
