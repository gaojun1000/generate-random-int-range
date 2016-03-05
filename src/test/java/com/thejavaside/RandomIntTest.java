package com.thejavaside;
import org.junit.Test;

import java.util.Random;

/**
 * Unit test for simple RandomUtils.
 */
public class RandomIntTest {

    @Test
    public void testRandomIntInARange () {
        for (int i=0; i<10; i++) {
            System.out.println("testRandomIntInARange>>>" + RandomUtils.randInt(1, 100));
        }
    }

    @Test
    public void testRandomIntInARangeJava7 () {
        for (int i=0; i<10; i++) {
            System.out.println("testRandomIntInARangeJava7>>>" + RandomUtils.randIntJava7Later(1, 100));
        }
    }
}
