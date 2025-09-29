package com.pluralsight.conditionalstatements;

public class MethodPractice {

    public static void main(String[] args) {
        fish();
        dance("Salsa");
        sayHi("Mario");
    }
    public static void sayHi(String firstname) {
        System.out.println("Hi " + firstname);
    }
    public static void dance(String danceMove){
        System.out.println("Woohoo!");
        System.out.println("Woah, woah");
        System.out.println("Stop!");
        System.out.println("Hammer Time!");
        System.out.printf("I am %s dancing", danceMove);
        System.out.println();
    }

    public static void fish() {
        System.out.println("Get out fishing rod");
        System.out.println("Bait the hook");
        System.out.println("Cast");
        System.out.println("Wait....forever");
    }
}
