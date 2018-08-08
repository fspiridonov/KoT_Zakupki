package ru.zakupki.Runners;


import com.codeborne.selenide.Configuration;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;

@Test
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/ru/zakupki/Features"},
        glue = "ru/zakupki/Steps",
        tags = {"@Этап1_с_поставщиком_5, @stage#1_5"}, //Запустить несколько фич
//        tags = {"@stage#0"},
        format = {"json:target/cucumber.json","html:target/site/cucumber-pretty"},
        strict = true
        )

public class Run_Stage1_5 {

    @BeforeClass

    static public void Initialization() {
        Configuration.timeout = 5000;
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
