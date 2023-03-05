package com.testpipeline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

/**
 * Testing for each Fibonacci method
 */
class AppTest 
{
    /**
     * Test the runtime and value result
     * of each Fibonacci method.
     */
    @Test
    void testApp() 
    {
        // x and a measures iterative time, y and b recursive
        // and z and c recursive memoization
        long startTime;
        long a, b, c;

        double expectedPercentage = 0.1;

        // Check answer is correct for fib(40) = 102334155

        startTime = System.nanoTime();
        assertEquals(Fibonacci.iterativeMethod(40), 102334155);
        a = Duration.ofNanos(System.nanoTime() - startTime).getNano();

        startTime = System.nanoTime();
        assertEquals(Fibonacci.recursiveMethod(40), 102334155);
        b = Duration.ofNanos(System.nanoTime() - startTime).getNano();

        startTime = System.nanoTime();
        assertEquals(Fibonacci.recursiveMemoization(40), 102334155);
        c = Duration.ofNanos(System.nanoTime() - startTime).getNano();

        // Expected: a and c duration is less than 1% of b length
        assertTrue((a/b * 100) < expectedPercentage);
        assertTrue((c/b * 100) < expectedPercentage);
                
    }
}
