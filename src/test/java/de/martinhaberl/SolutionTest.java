package de.martinhaberl;



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

    @Test
    public void zeroReturnsZero() {
        assertEquals(0, new Solution().solution(0));
    }

    @Test
    public void positive10Returns23() {
        assertEquals(23, new Solution().solution(10));
    }

    @Test
    public void positive17Returns60() {
        assertEquals(60, new Solution().solution(17));
    }

    @Test
    public void positive21Returns98() {
        assertEquals(98, new Solution().solution(21));
    }

}


