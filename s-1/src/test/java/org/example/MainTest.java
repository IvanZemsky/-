package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void runSelenium() {
        assertEquals("JavaScript-библиотека для создания пользовательских интерфейсов.\n" +
                "Она позволяет создавать простые представления для каждого состояния приложения, а также эффективно обновлять и отображать только нужные компоненты при изменении данных.\n" +
                "Благодаря React можно:… Читать ещё\n" +
                "JavaScript-библиотека для создания пользовательских интерфейсов.\n" +
                " ru.react.js.org", Main.runSelenium());
    }
}