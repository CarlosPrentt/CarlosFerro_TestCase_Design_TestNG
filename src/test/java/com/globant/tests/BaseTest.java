package com.globant.tests;

import com.globant.configuration.Driver;
import com.globant.pages.HomePage;
import com.globant.reporting.Reporter;
import org.hamcrest.MatcherAssert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import static java.lang.String.format;
import org.hamcrest.Matcher;

public class BaseTest {
    protected HomePage homePage;
    private Driver driver;

    public void scrollToBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver.getDriver();
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @Parameters({"browser", "url"})
    @BeforeTest
    public void testSetup(String browser, String url) {
        driver = new Driver(browser);
        Reporter.info("Deleting all cookies");
        driver.getDriver().manage().deleteAllCookies();
        Reporter.info(format("Navigating to %s", url));
        driver.getDriver().get(url);
        driver.getDriver().manage().window().maximize();
        homePage = new HomePage(driver.getDriver());
    }

    @AfterTest
    public void tearDown() {
        driver.getDriver().quit();
    }

    protected <T> void checkThat(String description, T actualValue, Matcher<? super T> expectedValue) {
        Reporter.info(format("Checking that " + description.toLowerCase() + "[Expectation: %s]", expectedValue));
        try {
            MatcherAssert.assertThat(actualValue, expectedValue);
        } catch (AssertionError e) {
            Reporter.error(format("Assertion Error: [%s]", e.getMessage().replaceAll("\n", "")));
        }
    }
}
