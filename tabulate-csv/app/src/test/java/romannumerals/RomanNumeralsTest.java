package romannumerals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {
    private final RomanNumerals converter = new RomanNumerals();

    @Test
    void singleDigits() {
        assertEquals(1, converter.convert("I"));
        assertEquals(5, converter.convert("V"));
        assertEquals(10, converter.convert("X"));
        assertEquals(50, converter.convert("L"));
        assertEquals(100, converter.convert("C"));
        assertEquals(500, converter.convert("D"));
        assertEquals(1000, converter.convert("M"));
    }

    @Test
    void additiveCombinations() {
        assertEquals(2, converter.convert("II"));
        assertEquals(6, converter.convert("VI"));
        assertEquals(15, converter.convert("XV"));
        assertEquals(1666, converter.convert("MDCLXVI"));
    }

    @Test
    void subtractiveCombinations() {
        assertEquals(4, converter.convert("IV"));
        assertEquals(9, converter.convert("IX"));
        assertEquals(40, converter.convert("XL"));
        assertEquals(90, converter.convert("XC"));
        assertEquals(400, converter.convert("CD"));
        assertEquals(900, converter.convert("CM"));
    }

    @Test
    void complexNumbers() {
        assertEquals(1994, converter.convert("MCMXCIV"));
        assertEquals(2023, converter.convert("MMXXIII"));
        assertEquals(3999, converter.convert("MMMCMXCIX"));
    }

    @Test
    void emptyString() {
        assertEquals(0, converter.convert(""));
    }

    @Test
    void invalidRomanNumeral() {
        assertThrows(IllegalArgumentException.class, () -> converter.convert("Z"));
        assertThrows(IllegalArgumentException.class, () -> converter.convert("ABC"));
    }
} 