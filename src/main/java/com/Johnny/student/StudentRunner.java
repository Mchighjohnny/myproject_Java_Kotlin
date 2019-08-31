package com.Johnny.student;


import java.util.Scanner;

public class StudentRunner {
    public static void main(String[] args) {
        // userInput();
        Student stu = new Student("Johnny", 60 , 99) ;
        stu.print();
        System.out.println("High score : " + stu.highest());

    }

    private static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Please enter student's name: ");
        String name = sc.next();

        System.out.println( " Please enter student's english score: ");
        int english = sc.nextInt();

        System.out.println("Please enter student's math score: ");
        int math = sc.nextInt() ;


    }
}
