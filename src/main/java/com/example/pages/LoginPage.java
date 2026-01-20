package com.example.pages;

import io.qameta.allure.Step;
import com.example.models.UserData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private WebDriver driver;

    private By username = By.id("txt-username");
    private By password = By.id("txt-password");
    private By loginBtn = By.id("btn-login");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Login as user: {userData.username}")
    public void login(UserData userData) {
        driver.findElement(username).sendKeys(userData.getUsername());
        driver.findElement(password).sendKeys(userData.getPassword());
        driver.findElement(loginBtn).click();
    }

}
