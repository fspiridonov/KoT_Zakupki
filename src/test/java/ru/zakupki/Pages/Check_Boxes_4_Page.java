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


    public static void clickInputDate(String input, String string) throws IOException {
        WebElement blokAndInputName = $(By.xpath("//input[@aria-label='"+input+"']"));

        sleep(500);
        try {
            actions().click(blokAndInputName).sendKeys(string).perform();
            LoggerConsole.LoggNotError("Поле '"+input+"' было заполнено");
        } catch (Error e) {
            LoggerConsole.Logg("Поле '"+input+"' НЕ было заполнено");
        }
    }


}