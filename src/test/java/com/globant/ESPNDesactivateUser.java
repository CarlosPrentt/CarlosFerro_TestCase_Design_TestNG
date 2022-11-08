package com.globant;

import org.testng.annotations.*;
import sun.rmi.runtime.Log;

import java.util.logging.Logger;

public class ESPNDesactivateUser {
    public Logger log = Logger.getLogger(String.valueOf(ESPNLogin.class));

    @BeforeClass
    public void Login(){
        log.info("Login with your email and password");
        System.out.println();
    }

    @Test
    public void DesactivateUser(){
        log.info("Put the mouse on the profile icon");
        log.info("Click on ESPN profile");
        log.info("Click on 'Delete Account'");
        log.info("Click on 'Yes, Delete this account'");
        log.info("Click on 'OK'");
        System.out.println();
    }

    @AfterClass
    public void LoginAgain(){
        log.info("Try to Login");
        log.info("If it doesn't let you do it, your account has been deleted successfully");
        log.info("Close browser");
        System.out.println();
    }
}
