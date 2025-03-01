package com.adactin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdactinHomePage extends BasePage {

    //home page logo
    @FindBy(xpath = "//img[@src='img/AdactIn_logo.png']")
    private WebElement homePageLogo;

    //home page login
    @FindBy(id = "username")
    private WebElement usernameTextbox;
    
    //home page password
    @FindBy(id = "password")
    private WebElement passwordTextbox;

    //home page login button
    @FindBy(id = "login")
    private WebElement loginButton;

    //home page new user register link
    @FindBy(xpath = "//a[text()='New User Register Here']")
    private WebElement registrationLink;



	/**
	 * Instantiates a new page.
	 *
	 * @param driver the driver
	 */
	public AdactinHomePage(WebDriver driver) {
		super(driver);
	}

	public boolean homePageLogoExist(){
        return homePageLogo.isDisplayed();
    }

    public boolean homePageUsernameFieldExist(){
        return usernameTextbox.isDisplayed();
    }
    
    public boolean homePagePasswordFieldExist(){
        return passwordTextbox.isDisplayed();
    }

    public boolean homePageLoginButtonExist(){
        return loginButton.isDisplayed();
    }

    public boolean homePageRegLinkExist(){
        return registrationLink.isDisplayed();
    }

}
