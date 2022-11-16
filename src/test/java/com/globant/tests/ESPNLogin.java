package com.globant.tests;

import org.testng.annotations.*;

import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.is;

public class ESPNLogin extends BaseTest{
    public Logger log = Logger.getLogger(String.valueOf(ESPNLogin.class));

    private String email = "carlos.d6@gmail.com";
    private String password = "holiwis23";
    @Test
    public void Login(){
        homePage.switchToBanner();
        homePage.clickCloseBanner();
        homePage.clickLoginBtn();
        checkThat("Login form is displayed", homePage.isloginFormDisplayed(), is (true));
        homePage.switchLoginForm();
        checkThat("ESPN logo is displayed", homePage.isESPNLogoDisplayed(), is(true));
        checkThat("Login button is displayed", homePage.isLoginBtnDisplayed(), is(true));
        checkThat("Sign up button is displayed", homePage.isSignUpBtnDisplayed(), is(true));
        homePage.typeEmailAddress(email);
        homePage.typePassword(password);
        homePage.clickOnLoginForm();
        homePage.clickWatchLink();
        homePage.isACarouselDisplayed();
        homePage.clickOnCard();
        homePage.isXBtnDisplayed();
        homePage.clickOnXBtn();
        homePage.clickOnLandingPage();
        homePage.hoverOnProfileIcon();
        homePage.isUserNameCorrect();
    }

    @AfterClass
    public void CloseBrowser(){

    }
}
