package com.Johnny.student;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentTest {

    @Test
    void highestScoreTest() {
        Student student = new Student("Johnny", 60, 80 ) ;
        Assertions.assertEquals(80,student.highest());
    }

    @Test
    void averageTest() {
        Student student = new Student("Johnny", 60, 80 ) ;
        Assertions.assertEquals((60+80)/2, student.getAverage());
    }
}
