package com.project;
import java.util.Scanner;
public class forloop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number =0;
        System.out.println("Enter number to start adding students:  ");
        number= scan.nextInt();

        for(int i=0; number>=0; i++) {

            System.out.println("Enter student id: ");
            int studentId = scan.nextInt();
            System.out.println("Enter student Name: ");
            String studentName = scan.next();
            System.out.println("Enter student Major: ");
            String studentMajor = scan.next();
            System.out.println("Enter student grade 1: ");
            int grade1 = scan.nextInt();
            System.out.println("Enter student grade 2: ");
            int grade2 = scan.nextInt();

            int average = (grade1+grade2)/2;

            System.out.println("The student number is : "+ number);
            System.out.println("The student name  is: "+ studentName);
            System.out.println("The student grade  is: "+ grade1);
            System.out.println("The student grade  is: "+ grade2);
            System.out.println("The total average  is: "+ average);
            if(average >= 90) {
                System.out.println("Grade: A");
            }
            else if(average >= 80) {
                System.out.println("Grade: B");
            }
            else if(average >= 70) {
                System.out.println("Grade: C");
            }
            else if(average >= 60) {
                System.out.println("Grade: D");
            }
            else {
                System.out.println("Grade: F");
            }

            System.out.println("Enter 1 to add more students or -1 to quit:  ");
            number= scan.nextInt();
        }

    }
}



