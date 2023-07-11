package com.kodilla.selenium.allegro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/gosia/Desktop/Kodilla kurs/Selenium/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

        WebElement cookiesField = driver.findElement(By.xpath("//*/button[1]"));
        cookiesField.click();

        WebElement selectField = driver.findElement(By.xpath("//*/select[1]"));
        Select categorySelect = new Select(selectField);
        categorySelect.selectByValue("/kategoria/elektronika");

        WebElement inputField = driver.findElement(By.xpath("//*/input[1]"));
        inputField.sendKeys("Mavic mini");

        inputField.submit();
    }
}
