package ru.zakupki.Pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import ru.zakupki.Helpers.LoggerConsole;
import ru.zakupki.Helpers.TestHelper;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;
import static com.codeborne.selenide.Selenide.sleep;
import static ru.zakupki.Helpers.LoggerConsole.Logg;
import static ru.zakupki.Helpers.LoggerConsole.LoggNotError;

public class AutorizationPage {

    public static void fillLogin(String login) throws FileNotFoundException, IOException {
//        Ввожу логин login
        WebElement fieldLogin = $(By.xpath("//input[@aria-label='Логин']"));
        try {
            $(By.xpath("//input[@aria-label='Логин']")).should(Condition.visible);
            actions().click(fieldLogin).sendKeys(login).perform();
            LoggerConsole.LoggNotError("Логин введен в поле 'Логин'");
        } catch (Error e) {
            LoggerConsole.Logg("Поле не существует | Поле не активна");
        }
    }

    public static void fillPassword(String password) throws FileNotFoundException, IOException {
//        Ввожу пароль password
        WebElement fieldPassword = $(By.xpath("//input[@aria-label='Пароль']"));
            try {
            $(By.xpath("//input[@aria-label='Пароль']")).should(Condition.visible);
            actions().moveToElement(fieldPassword).click().sendKeys(password).perform();
            LoggerConsole.LoggNotError("Пароль введен в поле 'Пароль'");
        } catch (Error e) {
            LoggerConsole.Logg("Поле не существует | Поле не активна");
        }
    }

    public static void exit() throws IOException {
        WebElement street = $(By.xpath("//a[@href='/logout']"));
        sleep(3000);
        try {
            actions().click(street).perform();
            LoggerConsole.LoggNotError("Клик на кнопку 'Выйти'");
        } catch (AssertionError err) {
            LoggerConsole.Logg("Не произошел клик на кнопку 'Выйти' | Кнопка не активна");
        }
    }

    public static void exit1() throws IOException {
        WebElement street = $(By.xpath("//a[@href='/logout']"));
        sleep(3000);
        try {
            actions().click(street).perform();
            LoggerConsole.LoggNotError("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑ Последний шаг ↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
        } catch (AssertionError err) {
            LoggerConsole.Logg("");
        }
    }

    public static void Enter() throws FileNotFoundException, IOException {
        sleep(3000);
        try {
            $(By.xpath("//a[@class='page-auth__form-button btn btn--router primary']")).click();
            LoggNotError("Произошел клик на кнопку 'Войти");
        } catch (Error e) {
            Logg("Не произошел клик на кнопку 'Войти'");
        }
    }

}

