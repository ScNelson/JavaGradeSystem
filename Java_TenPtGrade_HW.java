package Java_TenPtGrade;

import java.util.Scanner;

public class Java_TenPtGrade_HW {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Grade Calculator.");

        System.out.println("What subject?");
        String subject = input.nextLine();

        System.out.println("What is your grade?");
        String gradeStr = input.nextLine();

        int gradeInt = 0;

        // Make sure that the user input can be parsed to an Integer
        try {
            gradeInt = Integer.parseInt(gradeStr);
        } catch (final NumberFormatException e) {
            gradeInt = -1;
        }
        
        /*
        // If statement method for determining grade letter
        if (gradeInt != -1) {
            if (gradeInt >= 90 && gradeInt <= 100) {
                System.out.println("Your grade is an A");
            } else if (gradeInt >= 80 && gradeInt <= 89) {
                System.out.println("Your grade is a B");
            } else if (gradeInt >= 70 && gradeInt <= 79) {
                System.out.println("Your grade is a C");
            } else if (gradeInt >= 60 && gradeInt <= 69) {
                System.out.println("Your grade is a D");
            } else if (gradeInt < 69 && gradeInt > 0) {
                System.out.println("Your grade is an F");
            } else {
                System.out.println("Your grade is invalid!");
            }
        } else {
            System.out.println("You need to input a NUMBER for your grade");
        }
        */

        // Switch statement for calculating grade letter
        switch(gradeInt / 10) {
            case 10:
                System.out.println("Your grade is an A");
                break;
            case 9:
                System.out.println("Your grade is an A");
                break;
            case 8:
                System.out.println("Your grade is an B");
                break;
            case 7:
                System.out.println("Your grade is an C");
                break;
            case 6:
                System.out.println("Your grade is an D");
                break;
            default:
                System.out.println("Your grade is an F");
                break;
        }

        // Nested if statements to add an extra message if the student is doing well in a specific subject
        if (gradeInt >= 90) {
            String scienceStr = "science";
            String mathStr = "math";
            String englishStr = "english";
            String compSciStr = "computer science";
            String historyStr = "history";
            
            if (subject.equalsIgnoreCase(scienceStr)) {
                System.out.println("You should be a scientist!");
            } else if (subject.equalsIgnoreCase(mathStr)) {
                System.out.println("You should be a mathematician!");
            } else if (subject.equalsIgnoreCase(englishStr)) {
                System.out.println("You should be a teacher!");
            } else if (subject.equalsIgnoreCase(compSciStr)) {
                System.out.println("You should be a software developer!");
            } else if (subject.equalsIgnoreCase(historyStr)) {
                System.out.println("You should be a historian!");
            } else {
                System.out.println("I'm not sure what you're studying,\nBut you should pursue it!");
            }
        }

        input.close();
    }
}