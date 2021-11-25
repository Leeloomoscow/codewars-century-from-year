import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void FixedTests() {
        assertEquals(18, Solution.century(1705));
        assertEquals(19, Solution.century(1900));
        assertEquals(17, Solution.century(1601));
        assertEquals(20, Solution.century(2000));
        assertEquals(1,  Solution.century(89));
    }

    private static class Solution {
        public static int century(int number) {
            return (number + 99) / 100;
        }
    }
}
