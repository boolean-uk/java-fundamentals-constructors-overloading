package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExtensionTest {
    Extension extension;

    public ExtensionTest() {
        this.extension = new Extension();
    }

    @Test
    public void shouldAddFloats() {
        Assertions.assertEquals(10f, this.extension.add(5f, 5f));
    }

    @Test
    public void shouldAddDoubles() {
        Assertions.assertEquals(12d, this.extension.add(6d, 6d));
    }

    @Test
    public void shouldSubtractFloats() {
        Assertions.assertEquals(6f, this.extension.subtract(12f, 6f));
    }

    @Test
    public void shouldSubtractChars() {
        Assertions.assertEquals("Heo", this.extension.subtract("Hello", 'l'));
    }

    @Test
    public void shouldMultiplyInts() {
        Assertions.assertEquals(12, this.extension.multiply(6, 2));
    }

    @Test
    public void shouldMultiplyString() {
        Assertions.assertEquals("Hello,Hello,Hello", this.extension.multiply("Hello", 3));
    }

    @Test
    public void shouldMultiplyArray() {
        String[] nums = {"2", "7", "3"};
        int[] result = {6, 21, 9};

        Assertions.assertArrayEquals(result, this.extension.multiply(nums, 3));
    }
}
