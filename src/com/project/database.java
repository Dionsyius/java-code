package com.project;
import java.util.Scanner;
public class database {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("Create Students Database :  ");
        System.out.println("WELCOME TO Essex County College : ");

        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();

        int [] students = new int [size];
        int [] StudentsID = new int [size];
        String [] StudentName = new String[size];
        int [] grade1 = new int[size];
        int [] grade2 = new int[size];
        String [] Studentdepartment = new String [size];
        int [] Studentmonthlysalary = new int[size];

        for(int i=0; i<students.length; i++){



            int total=0;



            System.out.println("Enter student id: ");
            StudentsID[i] = scan.nextInt();
            System.out.println("Enter student Name: ");
            StudentName[i] = scan.next();
            System.out.println("Enter Student department: ");
            Studentdepartment[i] =  scan.next();
            System.out.println("Enter Student monthly salary: ");
            Studentmonthlysalary[i] = scan.nextInt();
            System.out.println("Enter student grade 1: ");
            grade1[i] = scan.nextInt();
            System.out.println("Enter student grade 2: ");
            grade2[i] = scan.nextInt();

        }
        int sum=0;
        int average = 0;
        int subtotal = 0;
        String grade = null;
        System.out.println("StudentsID \tStudent Name \tStudentdepartment \tStudentmonthlysalary \tsubtotal   \tGrade1   \tGrade2   \t\tTotalGrade   \tAverage   \tLetter Grade");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- ");
        for(int i=0; i<students.length;i++) {
            sum=grade1[i] + grade2[i];
            average = sum/2;
            int empmonthsalary = 0;
            subtotal = Studentmonthlysalary[i] * 12;
            if(average >= 90) {
                grade = "A";
            }
            else if(average >= 80) {
                grade= "B";
            }
            else if(average >= 70) {
                grade= "C";
            }
            else if(average >= 60) {
                grade = "D";
            }
            else {
                grade = "F";
            }

            System.out.println(StudentsID[i] +" \t\t   "+ StudentName[i]+" \t\t\t   "+Studentdepartment[i]+" \t\t\t   "+Studentmonthlysalary[i]+" \t\t\t   "+subtotal+" \t\t\t   "+grade1[i]+"\t\t\t   "+grade2[i]+"\t\t\t   "+sum+"\t\t\t   "+average+"\t\t\t   "+grade);

        }
    }
}


