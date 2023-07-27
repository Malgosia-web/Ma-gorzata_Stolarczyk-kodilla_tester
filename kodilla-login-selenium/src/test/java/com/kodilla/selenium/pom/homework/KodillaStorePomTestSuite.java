package com.kodilla.selenium.pom.homework;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.*;

class KodillaStorePomTestSuite {

    KodillaStorePom storePom;
    WebDriver driver;

    @BeforeEach
    public void setup() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        driver.navigate().to("https://kodilla.com/pl/test/store");
        storePom = new KodillaStorePom(driver);
    }
    @AfterEach
    public void close() {
        driver.close();
    }

//    @ParameterizedTest
//    @CsvSource(value = {"NoteBook, 2", "School, 1", "Brand, 1", "Business, 0", "Gaming, 1", "Powerful, 0"})
//    public void searchTest_checkSearchResult(String search, int result) {
//        assertEquals(result, storePom.search(search).size());
//    }
//    @ParameterizedTest
//    @CsvSource(value = {"notEbooK, 2", "SCHOOL, 1", "brand, 1"})
//    public void searchTest_checkSearchResultLowerAndUpperCase(String search, int result) {
//        assertEquals(result, storePom.search(search).size());
//    }

}