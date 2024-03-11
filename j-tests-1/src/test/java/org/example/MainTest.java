package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    @DisplayName("Calculate")
    void calculate() {
        assertAll(
                () -> assertEquals("x1 = 2; x2 = 0,5", Main.calculate(2, -5, 2)),
                () ->assertEquals("Ошибка", Main.calculate(3, 2, 5)),
                () -> assertEquals("x1 = 4; x2 = 0", Main.calculate(3, -12, 0)),
                () -> assertEquals("Ошибка", Main.calculate(0, 0, 10)),
                () -> assertEquals("Ошибка", Main.calculate(0, 0, 0)),
                () -> assertEquals("Ошибка", Main.calculate(0, 5, 17)),
                () -> assertEquals("x1 = 0; x2 = 0", Main.calculate(9, 0, 0))
        );
    }
}