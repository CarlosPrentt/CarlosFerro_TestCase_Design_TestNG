package com.globant;

import org.testng.annotations.*;

import java.util.logging.Logger;

public class ESPNLogin {
    public Logger log = Logger.getLogger(String.valueOf(ESPNLogin.class));

    @BeforeSuite
    public void HaveAnAccount(){
        log.info("You should have an account to enter");
        log.info("Open the browser");
        log.info("Write the next link: https://www.espnqa.com/?_adbock=true&src=com");log.info("Put your cursor on the profile icon");
        log.info("Click on 'Log in'");
        log.info("Write your username or email address");
        log.info("Write your password");
        log.info("Click on 'Log in'");
        log.info("If it doesn't work you don't have an account, sorry");
    }

    @BeforeClass
    public void openBrowser(){
        log.info("Open the browser");
        log.info("Write the next link: https://www.espnqa.com/?_adbock=true&src=com");
        System.out.println();
    }
    @Test(priority = 1)
    public void Login(){
        log.info("Put your cursor on the profile icon");
        log.info("Click on 'Log in'");
        log.info("Write your username or email address");
        log.info("Write your password");
        log.info("Click on 'Log in'");
        log.info("You are already Logged in");
        System.out.println();
    }

    @AfterClass
    public void CloseBrowser(){
        log.info("Close browser");
        System.out.println();
    }
}
