package com.Johnny.guess;

import java.util.Random;
import java.util.Scanner ;
public class GameFor {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int secret = new Random().nextInt(10)+1;

        for ( int i = 1 ; i < 5; i++ ) {
            System.out.println("Please enter a number : (" + i + "/4"  ) ;
            int number = scanner.nextInt();
            System.out.println("Times : " + i + " : " + number );
            if ( number > secret ) System.out.println("Lower");
            else if (number < secret ) System.out.println("Higher");
            else {
                System.out.println("Great, the number is :" + number );
                break;
            }
        }
        System.out.println("End");

    }
}
