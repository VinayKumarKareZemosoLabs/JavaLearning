package com.sectiontwo.assignments;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Proj2_2_MadLibsClone {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String adjective1, girlsName, adjective2, occupation1, place, clothing, hobby, adjective3, occupation2, boysName, mansName;

        System.out.println("Enter an adjective:");
        adjective1 = scan.nextLine();

        System.out.println("Enter a girl name:");
        girlsName=scan.nextLine();

        System.out.println("Enter another adjective:");
        adjective2= scan.nextLine();

        System.out.println("Enter an occupation:");
        occupation1=scan.nextLine();

        System.out.println("Enter a place:");
        place= scan.nextLine();

        System.out.println("Enter the piece of cloth name:");
        clothing= scan.nextLine();

        System.out.println("Enter a hobby:");
        hobby= scan.nextLine();

        System.out.println("Enter another adjective:");
        adjective3= scan.nextLine();

        System.out.println("Enter another occupation:");
        occupation2= scan.nextLine();

        System.out.println("Enter Boy's name:");
        boysName= scan.nextLine();

        System.out.println("Enter man's name:");
        mansName= scan.nextLine();

        System.out.println("There once was a "+adjective1+" girl named "+ girlsName +", who was a "+adjective2+" "+occupation1+" in the kingdom of "+place+".");
        System.out.println("She loved to wear "+clothing+" and to "+hobby+"."+" She wanted to marry the "+adjective3 + " "+ occupation2 + " named "+boysName+ " but her father, king "+mansName+" forbed her from seing him.");
    }
}
