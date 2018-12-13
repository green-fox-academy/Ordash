package Fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    Fibonacci fibonacci = new Fibonacci();

    @BeforeEach
    void setUp() {
    }

    @Test
    void fibonacciOutOfIntValue() {
        assertEquals(12586269025l, fibonacci.fibonacci(50));
    }

    @Test
    void fibonacciNegative() {
        assertEquals(-1, fibonacci.fibonacci(-5));
    }

}