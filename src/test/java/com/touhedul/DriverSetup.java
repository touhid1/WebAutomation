package com.touhedul;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetup {
    public WebDriver browser;

    @BeforeSuite
    public void openABrowser(){
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    @AfterSuite
    public void quiteBrowser(){
        browser.quit();
    }

    
}
