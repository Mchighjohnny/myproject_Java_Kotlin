package com.Johnny.kotlin

import java.util.*

fun main() {
    val stu = Student("Johnny", 77, 99)
    stu.print()
    var test = 123
    println( "Test : $test")
    println("Hight score: ${stu.hightest()}" )
}


class Student( var name: String?, var english: Int, var math: Int) {
    fun print() {
        /*
        print( name + "\t" + english + "\t" + math + "\t" + getAverage() + "\t" + passOrFailed() )
        println("\t" + gradding() )
        */
        println("$name\t$english\t$math\t${getAverage()}\t${passOrFailed()}\t${gradding()}")

    }
    fun gradding() = when(getAverage()) {
        //90 -> 'A'
        in 90..100 -> 'A' // scope
        in 80..89 -> 'B'
        in 70..79 -> 'C'
        in 60..69 -> 'D'
        else -> 'F'
    }
    fun passOrFailed() = if ( getAverage() >= 60 ) "PASS" else "FAILED"

    fun getAverage() = (english+math)/2

    fun hightest() = if ( english > math ) {
        println("english")
        english
    }
    else {
        println("math")
        math
    }

    fun nameCheck() = println(name?.length)
}

private fun userInput() {
    val scanner = Scanner(System.`in`)
    print("Please enter student's name: ")
    var name = null // scanner.next()

    var english = scanner.nextInt()
    print("Please enter student's english: ")

    var math = scanner.nextInt()
    print("Please enter student's math: ")

}


