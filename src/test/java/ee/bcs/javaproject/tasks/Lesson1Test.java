package ee.bcs.javaproject.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Lesson1Test {


    @Test
    void someString() {
        String result = Lesson1.someString();
        assertEquals(result.length(), 7);
        assertEquals(result.charAt(0), '"');
        assertEquals(result.charAt(1), '\\');
        assertEquals(result.charAt(2), '"');
        assertEquals(result.charAt(3), '\\');
        assertEquals(result.charAt(4), '\\');
        assertEquals(result.charAt(5), '"');
        assertEquals(result.charAt(6), '"');
    }

    @Test
    void min() {
        assertEquals(2, Lesson1.min(2, 3));
        assertEquals(-3, Lesson1.min(2, -3));
        assertEquals(-3, Lesson1.min(-3, -3));
    }

    @Test
    void max() {
        assertEquals(3, Lesson1.max(2, 3));
        assertEquals(2, Lesson1.max(2, -3));
        assertEquals(-3, Lesson1.min(-3, -3));

    }

    @Test
    void abs() {
        assertEquals(2, Lesson1.abs(2));
        assertEquals(2, Lesson1.abs(-2));
    }

    @Test
    void isEven() {
        assertTrue(Lesson1.isEven(-4));
        assertFalse(Lesson1.isEven(3));
    }

    @Test
    void min3() {
        assertEquals(2, Lesson1.min3(2, 3, 4));
        assertEquals(2, Lesson1.min3(2, 2, 4));
        assertEquals(2, Lesson1.min3(2, 4, 4));
        assertEquals(2, Lesson1.min3(3, 2, 4));
        assertEquals(1, Lesson1.min3(1, 2, 4));
        assertEquals(-5, Lesson1.min3(1, 2, -5));
        assertEquals(3, Lesson1.min3(5, 4, 3));
    }

    @Test
    void max3() {
        assertEquals(4, Lesson1.max3(2, 3, 4));
        assertEquals(4, Lesson1.max3(3, 3, 4));
        assertEquals(4, Lesson1.max3(2, 4, 4));
        assertEquals(4, Lesson1.max3(3, 2, 4));
        assertEquals(4, Lesson1.max3(4, 2, 4));


    }
}
