package ru.zakupki.Runners;


import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.junit.Cucumber;
import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
@Test
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/ru/zakupki/Features"},
        glue = "ru/zakupki/Steps",
//        tags = {""},
//        tags = {"@smokeTest#1,@smokeTest#2,@smokeTest#3"}, //Запустить несколько фич
        tags = {"@stage#1"},
        format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        plugin = {"pretty:target/txt.txt"},
        strict = true
        )

public class Runner {

    @BeforeClass

    static public void Initialization() {
        Configuration.timeout = 10000;
        Configuration.startMaximized = true;
        System.setProperty("webdriver.chrome.driver", "src\\test\\repository\\webDriver\\chromedriver.exe");
        Configuration.browser = "chrome";
        Configuration.savePageSource = false;

//        Если нужно оставлять броузер открытым по окончании теста, по умолчанию значение false
//        Configuration.holdBrowserOpen = true;

        open("http://172.20.0.78:8000/");
        Configuration.savePageSource = false;
    }
}
