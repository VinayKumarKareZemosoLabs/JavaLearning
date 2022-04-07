package com.sectiontwo.assignments;

public class LogicalFun {
    public static void main(String[] args) {
        boolean isRaining=true;
        boolean isWarm=true;

        boolean combined = isRaining && isWarm;

        System.out.println(combined);

        combined=isRaining||isWarm;
        System.out.println(combined);

        combined = !isRaining;
        System.out.println(combined);




    }
}
