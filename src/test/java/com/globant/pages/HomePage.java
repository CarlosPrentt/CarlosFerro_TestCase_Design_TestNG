package com.globant.pages;

import com.globant.reporting.Reporter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "global-user-trigger")
    private WebElement userProfile;
    @FindBy(css = "#sideLogin-left-rail > button.button-alt.med")
    private WebElement loginBtn;

    @FindBy(css = ".promo-banner-container > iframe:nth-child(1)")
    private WebElement bannerContainer;

    @FindBy(css = ".PromoBanner__CloseBtn")
    private WebElement bannerBtn;

    @FindBy(css = "#oneid-iframe")
    private WebElement loginIframe;

    @FindBy(css = "#logo")
    private WebElement ESPNLogo;

    @FindBy(css = "#BtnSubmit")
    private WebElement loginFormBtn;

    @FindBy(css = "#BtnCreateAccount")
    private WebElement signUpFormBtn;

    @FindBy(css = "#InputLoginValue")
    private WebElement emailInput;

    @FindBy(css = "#InputPassword")
    private WebElement passwordInput;

    @FindBy(css = "#global-nav > ul > li.pillar.watch > a")
    private WebElement watchLink;

    @FindBy(css = ".BucketsContainer > div")
    private List<WebElement> carouselContainer;

    @FindBy(css = "#fittPageContainer > section > div:nth-child(1) > section > div.Carousel__Wrapper.relative.Carousel__Wrapper--canScrollRight > div > div > ul > li:nth-child(2) > a > div.MediaPlaceholder.relative.MediaPlaceholder--16x9.cursor-pointer.MediaPlaceholder--button-hover.WatchTile__Image.WatchTile__Image--16x9 > figure > div.Image__Wrapper.aspect-ratio--child > picture > img")
    private WebElement card;

    @FindBy(css = "#fittPortal_0 > div > div > section > header > button > div > svg")
    private WebElement XBtn;

    @FindBy(css = "#global-user-trigger")
    private WebElement profileIcon;

    @FindBy(css = "#global-header > div.container > ul > li.user.hover > div > div > ul.account-management > li.display-user > span")
    private WebElement userName;

    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(9) > a")
    private WebElement logoutBtn;

    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(5) > a")
    private WebElement ESPNProfile;

    @FindBy(css = "#AccountDeleteLink")
    private WebElement deleteAccountBtn;

    @FindBy(css = "#oneid-iframe")
    private WebElement accountIframe;

    @FindBy(css = "#BtnSubmit")
    private WebElement confirmationToDelete;

    @FindBy(css = "#global-header > div.container > ul > li.user > div > div > ul.account-management > li:nth-child(7) > a")
    private WebElement loginButton;
    public void switchToBanner(){
        super.getDriver().switchTo().frame(bannerContainer);
    }

    public void clickCloseBanner(){
        super.clickElement(bannerBtn);
    }
    public void clickLoginBtn(){
        super.clickElement(loginBtn);
    }

    public boolean isloginFormDisplayed(){
        super.waitForVisibility(loginIframe);
        return loginIframe.isDisplayed();
    }

    public void switchLoginForm(){
        super.getDriver().switchTo().frame(loginIframe);
    }

    public boolean isESPNLogoDisplayed(){
        super.waitForVisibility(ESPNLogo);
        return ESPNLogo.isDisplayed();
    }

    public boolean isLoginBtnDisplayed(){
        super.waitForVisibility(loginFormBtn);
        return loginFormBtn.isDisplayed();
    }

    public boolean isSignUpBtnDisplayed(){
        super.waitForVisibility(signUpFormBtn);
        return signUpFormBtn.isDisplayed();
    }

    public void typeEmailAddress(String email){
        typeOnInput(emailInput, email);
    }

    public void typePassword(String password){
        typeOnInput(passwordInput, password);
    }

    public void clickOnLoginForm(){
        super.clickElement(loginFormBtn);
    }

    public void clickWatchLink(){
        super.clickElement(watchLink);
    }

    public boolean isACarouselDisplayed(){
        for (int i = 0; i < carouselContainer.size(); i++) {
            if(i > 0){
                return true;
            }
        }
        return false;
    }

    public void clickOnCard(){
        super.clickElement(card);
    }

    public boolean isXBtnDisplayed(){
        super.waitForVisibility(XBtn);
        return XBtn.isDisplayed();
    }

    public void clickOnXBtn(){
        super.clickElement(XBtn);
    }

    public void hoverOnProfileIcon() {
        super.waitForVisibility(profileIcon);
        super.hover(profileIcon);
    }

    public boolean isUserNameCorrect(){
        super.waitForVisibility(userName);
        if(userName.getText() == "Carlos!"){
            return true;
        }
        return false;
    }

    public void clickOnLogout(){
        super.waitForVisibility(logoutBtn);
        super.clickElement(logoutBtn);
    }

    public void clickOnESPNProfile(){
        super.waitForVisibility(ESPNProfile);
        super.clickElement(ESPNProfile);
    }

    public void switchToAccount(){
        super.getDriver().switchTo().frame(accountIframe);
    }

    public void deleteAccount(){
        super.waitForVisibility(deleteAccountBtn);
        super.clickElement(deleteAccountBtn);
    }

    public void clickOnConfirmationToDelete(){
        super.waitForVisibility(confirmationToDelete);
        super.clickElement(confirmationToDelete);
    }

    public void clickOnLoginButton(){
        super.waitForVisibility(loginButton);
        super.clickElement(loginButton);
    }
}
