package com.project;
import java.util.Scanner;
public class onearray{
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Enter the size of the array: ");
        int size = scan.nextInt();
        int [] students = new int [size];



        fillArray(students);
        displayArray(students);
        sumArray(students);
        averageArray(students);
        System.out.println("The sum of number is:"+sumArray1(students));
        System.out.println("The Average number is:"+averageArray1(students));
        System.out.println("The largest number is:"+largestNumber(students, size));
        System.out.println("The smallest number is:"+smallestNumber(students, size));
    }

    private static void fillArray(int [] students123) {

        for(int i=0; i< students123.length;i++) {
            System.out.println("Enter the values: ");
            students123[i] = scan.nextInt();
        }
    }


    private static void displayArray(int [] students456) {
        for(int i=0; i< students456.length;i++) {
            System.out.println("The numbers are: "+students456[i]);
        }
    }

    private static void sumArray(int [] students) {
        int sum = 0;
        for(int i=0; i< students.length;i++) {
            sum = sum + students[i];
        }

    }

    private static int sumArray1(int[] students){
        int sum = 0;
        for(int i=0; i< students.length;i++) {
            sum = sum + students[i];
        }
        return sum;
    }

    private static void averageArray(int[] students){
        int average = 0;
        for(int i=2; i< students.length;i++) {
            average = students.length/2;
        }
    }

    private static int averageArray1(int[] students){
        int average = 0;
        for(int i=0; i< students.length;i++) {
            int	average1 = students.length/2;
        }
        return average;
    }

    private static int largestNumber(int[] students, int size){
        int large = 0;
        for(int i=0; i<size;i++) {
            if(students[i] > large) {
                large = students[i];
            }
        }
        return large;

    }

    private static int smallestNumber(int[] students, int size){
        int small = students[0];
        for(int i=0; i<size;i++) {
            if(students[i] < small) {
                small = students[i];
            }
        }
        return small;
    }
}


