package org.example;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Main {
    public static void main(String[] args) {
        String s = runSelenide();
        System.out.println(s);
    }

    public static String runSelenide() {
        open("https://habr.com/ru/search/");
        $(By.cssSelector(".tm-input-text-decorated__input")).setValue("react");
        $(By.cssSelector(".tm-svg-icon__wrapper.tm-search__icon")).click();

        return $(By.id("787806")).text();
    }
}