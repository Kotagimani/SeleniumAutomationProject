package com.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By makeAppointmentBtn = By.id("btn-make-appointment");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickMakeAppointment() {
        driver.findElement(makeAppointmentBtn).click();
    }
}
