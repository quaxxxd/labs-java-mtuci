package edu.course.lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseToolkitTest {

    @Test
    void returnsTrueForEvenNumber() {
        boolean result = CourseToolkit.isEven(8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForOddNumber() {
        boolean result = CourseToolkit.isEven(7);

        assertFalse(result);
    }

    @Test
    void returnsTrueForNegativeEvenNumber(){
        boolean result = CourseToolkit.isEven(-8);

        assertTrue(result);
    }

    @Test
    void returnsFalseForPalyndrome() {
        boolean result = CourseToolkit.isPolindrom(121);

        assertTrue(result);
    }

    @Test
    void returnsTrueForisPrime() {
        boolean result = CourseToolkit.isPolindrom(2);

        assertTrue(result);
    }

    @Test
    void ForAverage() {
        int[] number = {2, 4, 6};
        double result = CourseToolkit.Average(number);

        assertEquals(4, result);
    }
}
