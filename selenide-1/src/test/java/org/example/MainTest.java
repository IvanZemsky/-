package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void runSelenide() {
        assertEquals("denis-19\n" +
                "21 янв в 09:22\n" +
                "Релиз React Email 2.0\n" +
                "2 мин\n" +
                "3.8K\n" +
                "Веб-разработка\n" +
                "*\n" +
                "Open source\n" +
                "*\n" +
                "GitHub\n" +
                "*\n" +
                "ReactJS\n" +
                "*\n" +
                "TypeScript\n" +
                "*\n" +
                "19 января 2024 года состоялся релиз мажорной версии открытого проекта для работы с электронной почтой (коллекция компонентов для создания электронных писем с использованием React и TypeScript) React Email 2.0. Исходный код проекта доступен на GitHub под лицензией MIT License.\n" +
                "Читать далее\n" +
                "+4\n" +
                "18\n" +
                "0", Main.runSelenide());
    }
}