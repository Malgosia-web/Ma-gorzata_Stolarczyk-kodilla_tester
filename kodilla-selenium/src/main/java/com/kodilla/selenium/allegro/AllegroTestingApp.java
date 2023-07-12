package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gosia/Desktop/Kodilla kurs/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement cookiesField = driver.findElement(By.cssSelector("div button"));
        cookiesField.click();

        WebElement selectField = driver.findElement(By.cssSelector("div select"));
        Select categorySelect = new Select(selectField);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement inputField = driver.findElement(By.cssSelector("div input"));
        inputField.sendKeys("Mavic mini");

        inputField.submit();

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("div article h2"))));

        List<WebElement> element = driver.findElements(By.cssSelector("div article h2"));
        System.out.println(element.get(0).getText());
    }
}
