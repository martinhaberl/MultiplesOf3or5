package de.martinhaberl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void negative3ReturnsZero() {
        assertEquals(0, new Solution().solution(-3));
    }

    @Test
    public void negative3425ReturnsZero() {
        assertEquals(0, new Solution().solution(-3425));
    }

    /*@Test
    public void 10returns23() {
        assertEquals(23, new Solution().solution(10));
    }*/

}


