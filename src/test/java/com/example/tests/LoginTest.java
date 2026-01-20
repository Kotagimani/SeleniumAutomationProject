package com.example.tests;

import com.example.base.BaseTest;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.example.models.UserData;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.example.pages.HomePage;
import com.example.pages.LoginPage;
import com.example.driver.DriverFactory;

import java.io.File;

    public class LoginTest extends BaseTest {

        @Test
        public void verifySuccessfulLogin() throws Exception {

            ObjectMapper mapper = new ObjectMapper();
            UserData userData = mapper
                    .readTree(new File("src/test/resources/loginData.json"))
                    .get("validUser")
                    .traverse(mapper)
                    .readValueAs(UserData.class);

            HomePage homePage = new HomePage(DriverFactory.getDriver());
            homePage.clickMakeAppointment();

            LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
            loginPage.login(userData);

            Assert.assertTrue(
                    DriverFactory.getDriver().getCurrentUrl().contains("appointment"),
                    "Login failed"
            );
        }

    }


