package com.globant;

import org.testng.annotations.*;

import java.util.logging.Logger;

public class ESPNLogout {
    public Logger log = Logger.getLogger(String.valueOf(ESPNLogin.class));

    @BeforeClass
    public void openBrowser(){
        log.info("Open the browser");
        log.info("Write the next link: https://www.espnqa.com/?_adbock=true&src=com");
        System.out.println();
    }

    @Test(priority = 2)
    public void Logout(){
        log.info("Put your cursor on the profile icon");
        log.info("Click on 'Log out'");
        log.info("You are already logged out");
        System.out.println();
    }

    @AfterClass
    public void CloseBrowser(){
        log.info("Close Browser");
    }
}
