package com.globant.tests;

import com.globant.pages.BasePage;
import org.testng.annotations.*;

import java.util.logging.Logger;

import static org.hamcrest.CoreMatchers.is;

public class ESPNLogout extends BaseTest {
    public Logger log = Logger.getLogger(String.valueOf(ESPNLogin.class));
    private String email = "carlos.d6@gmail.com";
    private String password = "holiwis23";
    @Test(priority = 2)
    public void Logout(){
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
            homePage.hoverOnProfileIcon();
            homePage.clickOnLogout();
    }
}
