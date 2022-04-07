package com.sectiontwo.assignments;

import java.util.Scanner;

public class KeyboardInput {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String city;

        int age;
        System.out.println("What is your name?");
        name=keyboard.nextLine();

        System.out.println("What's your age?");
        age=keyboard.nextInt();
        keyboard.nextLine(); //Consume new line

        double realNumber;

        System.out.println("Enter any real number ");
        realNumber=keyboard.nextDouble();
        keyboard.nextLine();

        realNumber*=2;

        System.out.println("What city do you live in?");
        city=keyboard.nextLine();


        System.out.println("Hello, "+name);
        System.out.println("Age is "+age);
        System.out.println("Twice thw Real number is "+realNumber);
        System.out.println("City is "+city);

    }
}
