package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        runSelenium();
    }

    public static String runSelenium() {
        ChromeOptions options = new ChromeOptions();
        System.setProperty("webdriver.chrome.driver", "yandexdriver.exe");
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://ya.ru/");

        String siteName = driver.getTitle();

        System.out.println(siteName);

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

        WebElement textBox = driver.findElement(By.name("text"));
        WebElement submitButton = driver.findElement(By.cssSelector(".search3__button"));

        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1500));

        textBox.sendKeys("React");
        submitButton.click();

        WebElement message = driver.findElement(By.cssSelector(".Description-Item"));

        String formText = message.getText();
        System.out.println(formText);

        driver.quit();

        return formText;
    }
}