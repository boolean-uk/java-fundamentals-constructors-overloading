package com.booleanuk;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ExerciseTest {
    Exercise exercise;

    public ExerciseTest() {
        this.exercise = new Exercise();
    }

    @Test
    public void shouldAnswerTheUltimateQuestion() {
        Assertions.assertEquals(42, exercise.answerToTheUltimateQuestion);
    }

    @Test
    public void shouldBeAged32() {
        Assertions.assertEquals(32, exercise.age);
    }

    @Test
    public void shouldBeNamedJane() {
        Assertions.assertEquals("Jane", exercise.firstName);
    }

    @Test
    public void shouldBeAProgrammer() {
        Assertions.assertTrue(exercise.isProgrammer);
    }

    @Test
    public void firstNumberShouldBe9182() {
        Assertions.assertEquals(9182, exercise.firstNumber);
    }

    @Test
    public void firstStringShouldBeSpecific() {
        Assertions.assertEquals("Java is to Javascript what car is to carpet.", exercise.firstString);
    }

    @Test
    public void isVisibleShouldBePublic() {
        Assertions.assertTrue(exercise.isVisible);
    }
}
