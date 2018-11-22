package Sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    private Sum sum = new Sum();
    private ArrayList<Integer> numbers;

    @BeforeEach
    void setUp() {
        numbers = new ArrayList<>();
    }

    @Test
    void testPositive() {
        numbers.add(70);
        numbers.add(35);
        assertEquals(105, sum.sum(numbers));
    }

    @Test
    void testNegative() {
        numbers.add(-70);
        numbers.add(-35);
        assertEquals(-105, sum.sum(numbers));
    }

    @Test
    void testEmptyList() {
        assertEquals(0, sum.sum(numbers));
    }

    @Test
    void testNullPointer() {
        numbers = null;
        assertThrows(NullPointerException.class,
                ()-> {sum.sum(null);});
    }

}