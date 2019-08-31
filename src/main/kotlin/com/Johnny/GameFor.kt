package com.Johnny

import java.util.*


fun main() {

    val scanner = Scanner(System.`in`)
    val secret = Random().nextInt(10) +1
    println(secret)

    for(i in 1..5) {
        print("Please enter a number : ")
        var number = scanner.nextInt()
        println("Times\t$i\t$number")
        if ( number > secret ) println("Lower")
        else if (number < secret ) println("Higher")
        else {
            println("Great, the number is $secret")
            break;
        }
    }




}