package ru.zakupki.Helpers;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import cucumber.api.java.en.When;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.slf4j.Logger;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.Assert.assertTrue;
import static ru.zakupki.Helpers.LoggerConsole.Logg;
import static ru.zakupki.Helpers.LoggerConsole.LoggNotError;


public class ButtonsUtil {

    public static void clickSpanButton(String text) throws FileNotFoundException, IOException {
        WebElement txt = $(By.xpath("//button/div[@class='btn__content']/i[text()='" + text + "'] | //div[text()='" + text + "']"));
        try {
            $(By.xpath("//button/div[@class='btn__content']/i[text()='" + text + "'] | //div[text()='" + text + "']")).should(Condition.visible);
            sleep(1000);
            actions().click(txt).perform();
            LoggNotError("Произошел клик на кнопку '" + text + "'");
        } catch (Error e) {
            Logg("Не произошел клик на кнопку '" + text + "'");
        }
    }

    public static void clickSpanButton1() throws FileNotFoundException, IOException {
        WebElement txt = $(By.xpath("//*[@id='app']/div/main/div/div/div/footer/div/div/button[1]/div"));
        sleep(3000);
        try {
 //           $(By.xpath("//div[text()='" + text + "']")).should(Condition.visible);
            sleep(3000);
            actions().click(txt).perform();
            sleep(2000);
            LoggNotError("Произошел клик на кнопку ''");
        } catch (Error e) {
            Logg("Не произошел клик на кнопку ''");
        }
    }


    public static void NewRealRequest() throws FileNotFoundException, IOException {
        sleep(3000);
        if (($(By.xpath("//span[text()='Создать запрос']")).exists())) {
            $(By.xpath("//span[text()='Создать запрос']")).click();
            LoggNotError("Произошел клик на кнопку 'Создать запрос' на этапе реализации");
        } else {
            Logg("Не произошел клик на кнопку 'Создать запрос' на этапе реализации");
        }
        sleep(2000);

    }
    //span[text()='Создать запрос']

    public static void clickEditInitiative() throws FileNotFoundException, IOException {
//        Кликает кнопку изменить инициативу
        if ($(By.xpath("//span[contains(@class, 'pencil')]/ancestor::button")).exists()) {
            $(By.xpath("//span[contains(@class, 'pencil')]/ancestor::button")).click();
            LoggNotError("Произошел клик на кнопку 'Изменить'");
        } else {
            Logg("Не произошел клик кнопки 'Изменить'");
        }
        $(By.xpath("//h3[text()='Изменить инициативу']")).waitUntil(Condition.visible, 3000);
    }

    public static void clickByInputValue(String val) throws IOException {
//        Кликает кнопку, текст который в value инпута
        sleep(2000);
        WebElement button = $(By.xpath("//button//input[@value='" + val + "']"));
        sleep(3000);
        try {
            actions().click(button).perform();
            LoggerConsole.LoggNotError("Произошел клик на поле " + val + "");
        } catch (AssertionError err) {
            LoggerConsole.Logg("Не произошел клик на поле " + val + "");
        }
        }
    }
