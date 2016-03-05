package com.thejavaside;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomUtils {
    public static int randInt(int min, int max) {
        //Instances of java.util.Random are threadsafe.
        //However, the concurrent use of the same java.util.Random instance across threads
        //may encounter contention and consequent poor performance.
        // Consider using ThreadLocalRandom in multithreaded designs instead.
        Random rand = new Random();

        //the upper bound is exclusive. Plus 1 to make it inclusive
        return rand.nextInt((max - min) + 1) + min;
    }

    public static int randIntJava7Later(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }
}
