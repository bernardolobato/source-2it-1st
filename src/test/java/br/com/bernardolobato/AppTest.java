package br.com.bernardolobato;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    public void testApp() {
        assertTrue(true);
    }

    @Test
    public void testBrotherInt1() {
        int n = 533;
        int expected = 533;

        int result = App.greaterBrotherNumber(n);

        assertEquals(expected, result);

    }
    @Test
    public void testBrotherInt2() {
        int n = 213;
        int expected = 321;

        int result = App.greaterBrotherNumber(n);

        assertEquals(expected, result);

    }

    @Test
    public void assertNotAllowedGreaterThan100m() {
        int n = 100000001;
        int expected = -1;
        int result = App.greaterBrotherNumber(n);
        assertEquals(expected, result);
    }

    

    @Test(expected = RuntimeException.class)
    public void throwErrorWhenLessOrEqualsZero() {
        int n = -1;
        App.greaterBrotherNumber(n);
    }

}
