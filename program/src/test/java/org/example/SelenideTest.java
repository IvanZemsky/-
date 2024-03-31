package org.example;

import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.CollectionCondition.texts;
import static com.codeborne.selenide.Selenide.*;

@ExtendWith(TextReportExtension.class)
class SelenideTest {

  @BeforeEach
  public void setUp() {
    SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    open();
  }

  @Test
  @Epic("Example flow")
  @Feature("Example selenide")
  @Description("Test that verifies a returned Example Domain from example.com")
  void testExampleDomain() {
    open("https://learn.javascript.ru/search/");
    $(".search-form__query .text-input__control").setValue("promise");
    $(".search-form__send").click();
    $$(".search-results__marked").first(1).shouldHave(texts("Promise"));
  }
}
