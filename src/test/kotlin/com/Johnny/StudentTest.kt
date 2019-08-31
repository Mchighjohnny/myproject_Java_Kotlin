package com.Johnny.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test


class StudentTest {
    @Test
    fun highestTest(){
        val student = Student( "Johnny", 60, 80 )
        Assertions.assertEquals(80, student.hightest())
    }

    @Test
    fun averageTest() {
        val student = Student( "Johnny", 60, 80 )
        Assertions.assertEquals((60+80)/2, student.getAverage())

    }

    @Test
    fun graddingTest() {

        val student = Student( "Johnny", 60, 80 )
        Assertions.assertEquals('C', student.gradding())
    }
}