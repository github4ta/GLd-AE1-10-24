package biz.svyatoslav.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Calculator {
    private WebDriver driver;

    public Calculator() {
    }

    public void clickButton() {
        driver.findElement(By.xpath(CalculatorXpath.INPUT_CALCULATE_BUTTON_XPATH)).click();
    }

    public void selectFemale() {
        driver.findElement(By.xpath(CalculatorXpath.INPUT_GENDER_FEMALE_XPATH)).click();
    }

    public void selectMale() {
        driver.findElement(By.xpath(CalculatorXpath.INPUT_GENDER_MALE_XPATH)).click();
    }

    public void fillName(String name) {
        driver.findElement(By.xpath(CalculatorXpath.INPUT_NAME_XPATH)).sendKeys(name);
    }

    public void fillWeight(String weight) {
        driver.findElement(By.xpath(CalculatorXpath.INPUT_WEIGHT_XPATH)).sendKeys(weight);
    }

    public void fillHeight(String height) {
        driver.findElement(By.xpath(CalculatorXpath.INPUT_HEIGHT_XPATH)).sendKeys(height);
    }
}
