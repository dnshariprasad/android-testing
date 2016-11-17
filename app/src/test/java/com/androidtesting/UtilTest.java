package com.androidtesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class UtilTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(Util.addition(1,3), 4);
    }

    @Test
    public void addition_isWrong() throws Exception {
        assertNotEquals(Util.addition(1,3), 5);
    }
}