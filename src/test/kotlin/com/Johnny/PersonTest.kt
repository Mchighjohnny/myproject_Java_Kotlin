package com.Johnny.kotlin

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import com.Johnny.Human
import com.Johnny.Person

class PersonTest {

    @Test
    fun humanBmiTest() {
        val human = Human("Johnny", 66.5f, 1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), human.bmi())
    }

    @Test
    fun personBmiTest() {
        val person = Person(66.5f,1.7f)
        Assertions.assertEquals(66.5f/(1.7f*1.7f), person.bmi())

    }
}