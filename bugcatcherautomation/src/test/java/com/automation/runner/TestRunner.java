package com.automation.runner; // the poms is the only file i need to update. everything else is good

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.automation.poms.Login;
import com.automation.poms.managerCreateDefect;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", glue = "com/automation/steps",plugin = {"pretty", "html:src/test/resources/reports/html-reports.html"}
)
public class TestRunner {

    public static WebDriver driver;
    public static Login login;
    public static WebDriverWait wait;
    public static managerCreateDefect managerCreateDefect;
    // always create a new public static when adding new features

    @BeforeClass
    public static void set(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        login = new Login(driver);
        wait = new WebDriverWait(driver, 2);
        managerCreateDefect = new managerCreateDefect(driver);
    }

    @AfterClass 
    public static void teardown(){
        driver.quit();
    }
    
}
