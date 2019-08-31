package com.Johnny.student;

public class Student {
    String id;
    String name ;
    int english;
    int math ;


    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    public int highest() {

        /*int max = 0;
        if ( english > math ) {
            max = english ;
        }
        else max = math ;
        */
        return (english > math ) ? english : math ;


    }

    public void print() {
        int average = getAverage() ;
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" +
                (( average >= 60 ) ? "PASS" : "FAILED")); /*三元運算*/
        char gradding = 'F' ;
        /*
        if ( average >= 90 && average <= 100 ) gradding = 'A' ;
        else if ( average >= 80 && average <= 89 ) gradding = 'B' ;
        else if ( average >= 70 && average <= 79 ) gradding = 'C' ;
        else if ( average >= 60 && average <= 69 ) gradding = 'D' ;
        */

        switch(average/10) {
            case 10:
            case 9:
                gradding = 'A' ;
                break ;
            case 8:
                gradding = 'B' ;
                break ;
            case 7:
                gradding = 'C' ;
                break ;
            case 6:
                gradding = 'D' ;
                break ;
            default:
                gradding = 'F' ;
        }

        System.out.println("\t"+ gradding);

       /*
        if ( getAverage() >= 60 ) {
            System.out.println("\tPASS");
        } else System.out.println("\tFAILED");
        */
    }


    public int getAverage() {
        return (english+math)/2 ;
    }
}
