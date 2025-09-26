package com.pluralsight.conditionalstatements;
import java.util.*;
public class ConditionalStatements {
    public static void main(String[] args) {
        //Ask for age
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("You're are 18 or older, Welcome!");
        }
        else {
            System.out.println("You're not an adult yet");
        }
        //Ask for grade:
        System.out.print("Enter your grade (A-F): ");
        String grade = scanner.next();

        if (grade.equals("A")) {
            System.out.println("Excellent!");
        } else if (grade.equals("B")) {
            System.out.println("Good job!");
        } else if (grade.equals("C")) {
            System.out.println("You passed.");
        } else if (grade.equals("D")) {
            System.out.println("Barely passed.");
        } else if (grade.equals("F")) {
            System.out.println("Failed.");
        } else {
            System.out.println("Invalid grade entered: ");
        }
        //Step 4:
        String word1 = "hello";
        String word2 = new String("hello");

        System.out.println("Using '==': " + (word1 == word2));
        System.out.println("Using '.equals()': " + word1.equals(word2));

        //Step 5:
        System.out.print("Enter username: ");
        String userName = scanner.next();

        System.out.print("Enter password: ");
        String password = scanner.next();

        if (userName.equals("admin") || password.equals("1234")) {
            System.out.println("Access granted");
        } else {
            System.out.println("Access denied");
        }
    }
}
