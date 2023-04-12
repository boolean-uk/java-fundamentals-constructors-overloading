package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    @Test
    public void shouldHaveAName() {
        Exercise e = new Exercise("Constructors and Overloading");

        Assertions.assertEquals("Constructors and Overloading", e.name);
    }

    @Test
    public void shouldHaveAnAge() {
        Exercise e = new Exercise(32);

        Assertions.assertEquals(32, e.age);
    }

    @Test
    public void shouldHaveAnAgeAndName() {
        Exercise e = new Exercise("Constructors and Overloading", 32);

        Assertions.assertEquals(32, e.age);
        Assertions.assertEquals("Constructors and Overloading", e.name);
    }

    @Test
    public void shouldAddNumbers() {
        Exercise e = new Exercise(32);

        Assertions.assertEquals(5, e.add(2, 3));
    }

    @Test
    public void shouldAddStrings() {
        Exercise e = new Exercise(32);

        Assertions.assertEquals("Hello world", e.add("Hello", "world"));
    }
}
