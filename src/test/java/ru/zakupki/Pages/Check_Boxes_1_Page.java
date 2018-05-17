package ru.zakupki.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ru.zakupki.Helpers.LoggerConsole;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;

public class Check_Boxes_1_Page {


    public static void clicklast4Box(String val) throws IOException {
//Клик на чек-бокс "" первого этапа
        WebElement name = $(By.xpath("//div[@data-id='container-id-1']/div/div[last()]/div/div//div[text()='" + val + "']"));
        sleep(2000);
        try {
  //          name.isDisplayed();
            sleep(3000);
            actions().click(name).perform();
            LoggerConsole.LoggNotError("входит внутрь чекбокса '" + val + "' ");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог войти внутрь тестовой закупки '" + val + "' ");
        }
    }

    public static void clickfillKPGZ() throws IOException {
//Клик на кнопкку 'Заполнить КПГЗ'
        WebElement name = $(By.xpath("//*[@id='form-task']/div[1]/div/button[1]/div"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("Клик на кнопку Заполнить КПГЗ");

        } catch (Error e) {
            LoggerConsole.Logg("Не кликнул на кнопку Заполнить КПГЗ");
        }
    }

    public static void fillKPGZ(String txt) throws IOException {
//Заполняет поле 'Код КПГЗ'
        WebElement name = $(By.xpath("//input[@aria-label='Код КПГЗ']"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).sendKeys(txt).perform();
            LoggerConsole.LoggNotError("Заполнение поля обоснование");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле обоснования");
        }
    }

    public static void selectarticle() throws IOException {
//
        WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2018]/ancestor::div[1]//div[@class='flex xs8']/select/option[1]"));
        sleep(1500);

        try {

            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("выбирает статью");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог вцыбрать статью из выпадающего списка");
        }
    }

    public static void Clickadd() throws IOException {
//заполняем поле причины
        //todo
        WebElement name = $(By.xpath("//*[@id='form-task']/div/div/button[1]/div"));
        sleep(2000);

        try {
            actions().click(name).perform();
            LoggerConsole.LoggNotError("клик на кнопку создать");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на кнопку создать");
        }
    }
    //button/div
    public static void clickedit() throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//div[2]/div/button/div[@class='btn__content']/i[text()='edit']"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("клик на поле статья");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле статья");
        }
    }

    public static void clickarticle() throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2018]/ancestor::div[1]//div[@class='flex xs8']/select"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).sendKeys("Т").sendKeys(Keys.ENTER).perform();
            LoggerConsole.LoggNotError("клик на поле статья");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле статья");
        }
    }

    public static void clickarticlenxt() throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2018]/ancestor::div[1]//div[@class='flex xs8']/select"));
        sleep(1500);
        try {
            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("клик на поле статья");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле статья");
        }
    }

    public static void fillcommentariy(String txt) throws IOException {
//заполняем комментарий
        WebElement comm = $(By.xpath("//textarea[@aria-label='Комментарий']"));
        sleep(1600);
        try {
            comm.isDisplayed();
            actions().click(comm).sendKeys(txt).perform();
            LoggerConsole.LoggNotError("Заполнение поля комментарий");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле комментарий");
        }
    }

    public static void fillreason(String txt) throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//div[@class='data-table__cell']/textarea[@name='reason']"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().doubleClick(name).sendKeys(Keys.DELETE).sendKeys(txt).perform();
            LoggerConsole.LoggNotError("Заполнение поля обоснование");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле обоснования");
        }
    }

    public static void fillfio(String txt) throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//input[@name='fio']"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().doubleClick(name).sendKeys(Keys.DELETE).sendKeys(txt).perform();
            LoggerConsole.LoggNotError("Заполнение поля ответственный");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле ответственный");
        }
    }

    public static void clickvaluation() throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//select[@name='methods_id']"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).sendKeys("А").sendKeys(Keys.ENTER).perform();
            LoggerConsole.LoggNotError("клик на поле Расчет НМЦК");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле Расчет НМЦК");
        }
    }

    public static void selectvaluation(String valua) throws FileNotFoundException, IOException {
//        Ввожу логин login
        WebElement valuation = $(By.xpath("//div[text()=]//option[text()='" + valua + "']"));
        try {

            actions().click(valuation).perform();
//            actions().sendKeys(fieldLogin,login).perform();

            LoggerConsole.LoggNotError("Логин введен в поле авторизации");
        } catch (Error e) {
            LoggerConsole.Logg("Поле не существует | Поле не активна");
        }
    }

    public static void clicktype() throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//select[@name='type_id']"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).sendKeys("А").sendKeys(Keys.ENTER).perform();
            LoggerConsole.LoggNotError("клик на поле Тип закупки");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле Тип закупки");
        }
    }

    public static void selecttype(String valua) throws FileNotFoundException, IOException {
//        Ввожу логин login
        WebElement valuation = $(By.xpath("//option[text()='" + valua + "']"));
        try {

            actions().click(valuation).perform();
//            actions().sendKeys(fieldLogin,login).perform();

            LoggerConsole.LoggNotError("Логин введен в поле авторизации");
        } catch (Error e) {
            LoggerConsole.Logg("Поле не существует | Поле не активна");
        }
    }
    public static void clickordinance() throws FileNotFoundException, IOException {
//        Ввожу логин login
        WebElement datamer = $(By.xpath("//div[text()='Закон']"));
        sleep(1500);


        try {
            datamer.isDisplayed();
            actions().click(datamer).sendKeys("2").sendKeys(Keys.ENTER).perform();
            LoggerConsole.LoggNotError("клик на поле закон");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле закон");
        }
    }
    public static void selectordinance( String txt) throws FileNotFoundException, IOException {
//        Ввожу логин login
        WebElement valuation = $(By.xpath("//div[text()='" + txt + "']"));
        try {

            actions().click(valuation).perform();
//            actions().sendKeys(fieldLogin,login).perform();

            LoggerConsole.LoggNotError("выбирает закон");
        } catch (Error e) {
            LoggerConsole.Logg("не смог выбирать закон");
        }
    }
}