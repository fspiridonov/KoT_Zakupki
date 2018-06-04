package ru.zakupki.Pages;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.zakupki.Helpers.LoggerConsole;

import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;

public class Check_Boxes_4_Page {

    public static void clickCheckBox(String val) throws IOException {
        WebElement name = $(By.xpath("//div[@data-id='container-id-4']/div/div[last()]/div/div//div[text()='" + val + "']"));
        sleep(3500);
        try {
//            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("входит внутрь чекбокса '" + val + "' ");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог войти внутрь тестовой закупки '" + val + "' ");
        }
    }


    public static void clickInputDate(String blok, String input, String string) throws IOException {
        WebElement blokAndInputName = $(By.xpath("//div[@class='headline mb-0' and text()='" + blok + "']/../../div[2]/div/div/div/label[text()='" + input + "']/../div"));

        sleep(1500);
        try {
            actions().click(blokAndInputName).sendKeys(string).perform();
            LoggerConsole.LoggNotError("");
        } catch (Error e) {
            LoggerConsole.Logg("");
        }
    }


}