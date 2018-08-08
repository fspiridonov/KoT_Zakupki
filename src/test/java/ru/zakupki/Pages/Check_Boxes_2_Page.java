package ru.zakupki.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ru.zakupki.Helpers.LoggerConsole;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;

public class Check_Boxes_2_Page {


    public static void clicklast4Box(String val) throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//div[@data-id='container-id-2']/div/div[last()]/div/div//div[text()='" + val + "']"));
        sleep(5000);
        try {
//            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("входит внутрь чекбокса '" + val + "' ");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог войти внутрь тестовой закупки '" + val + "' ");
        }
    }


}