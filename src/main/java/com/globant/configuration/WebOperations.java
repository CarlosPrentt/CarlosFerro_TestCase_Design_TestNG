package com.globant.configuration;

import static org.openqa.selenium.support.PageFactory.initElements;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebOperations {
    private final WebDriver driver;
    private final WebDriverWait wait;

    public WebOperations(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(5L));
        initElements(driver, this);
    }

    protected  WebDriver getDriver(){
        return driver;
    }

    public void clickElement(WebElement element){
        waitForClickeable(element);
        element.click();
    }

    public void typeOnInput(WebElement element, String text){
        element.sendKeys(text);
    }

    public void waitForVisibility(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForVisibility(List<WebElement> elements){
        wait.until(ExpectedConditions.visibilityOfAllElements(elements));
    }

    public void waitForClickeable(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void clickOnLandingPage(){
        driver.navigate().back();
    }

    public void hover(WebElement element){
        waitForVisibility(element);
        new Actions(getDriver()).moveToElement(element).perform();
    }
}