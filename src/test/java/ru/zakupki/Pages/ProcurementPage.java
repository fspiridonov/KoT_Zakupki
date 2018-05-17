package ru.zakupki.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.LoggerConsole;
import ru.zakupki.Helpers.TestHelper;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;
import static ru.zakupki.Helpers.LoggerConsole.Logg;
import static ru.zakupki.Helpers.LoggerConsole.LoggNotError;

public class ProcurementPage {


    public static void fillname(String txt) throws IOException {
//Заполняет поле 'Наименование'
        WebElement name = $(By.xpath("//textarea[@name='name']"));
        sleep(1500);
        Random random = new Random();
        int num = random.nextInt(99);
        try {


            actions().click(name).sendKeys(txt+num).perform();
            LoggerConsole.LoggNotError("Заполнение поля наименования");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле наименования");
        }
    }

    public static void fillreason(String txt) throws IOException {
//заполняем поле обоснования
        WebElement name = $(By.xpath("//textarea[@name='reason']"));
        sleep(1500);
        Random random = new Random();
        int num = random.nextInt(99);
        try {
            name.isDisplayed();
            actions().click(name).sendKeys(txt+num).perform();
            LoggerConsole.LoggNotError("Заполнение поля обоснование");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле обоснования");
        }
    }

    public static void Clickvendorselection() throws IOException {
//клик на поле Выбор поставщика
        WebElement name = $(By.xpath("//label[text()='Выбор поставщика']"));
        sleep(1600);

        try {

            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("клик на поле Выбор поставщика");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле Выбор поставщика");
        }
    }

    public static void selectVendor(String ven) throws FileNotFoundException, IOException {
//        //Выбираем поставщика из выпадающего списка
        WebElement vendor = $(By.xpath("//div[@class='card']/div/div/a/div/div[text()='"+ ven +"']"));
        try {
            actions().click(vendor).perform();


//  actions().click(vendor).perform();

//            actions().sendKeys(fieldLogin,login).perform();

            LoggerConsole.LoggNotError("Выбираем поставщика из выпадающего списка");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог выбрать поставщика из выпадающего списка");
        }
    }

    public static void clickvaluation() throws IOException {
//клик на поле Расчет НМЦК
        WebElement name = $(By.xpath("//label[text()='Расчет НМЦК']"));
        sleep(1900);

        try {
            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("клик на поле Расчет НМЦК");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле Расчет НМЦК");
        }
    }

    public static void selectValuation(String valua) throws FileNotFoundException, IOException {
//        Ввожу логин login
        WebElement valuation = $(By.xpath("//div[@role='radiogroup']/*/*/*[text()='" + valua + "']"));
        try {

            actions().click(valuation).perform();
//            actions().sendKeys(fieldLogin,login).perform();

            LoggerConsole.LoggNotError("Выбран способ оплаты " + valua + "");
        } catch (Error e) {
            LoggerConsole.Logg("Чек-бок " + valua + " не был выбран");
        }
    }


    public static void fillsumma(String summa) throws FileNotFoundException, IOException {
//        вводет сумму
        WebElement name = $(By.xpath("//input[@aria-label='Сумма']"));
        sleep(2000);

        try {

            name.isDisplayed();
            actions().click(name).sendKeys(summa).perform();
            LoggerConsole.LoggNotError("Заполнение поля сумма в рублях");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле сумма в рублях");
        }
    }


    public static void fillsummanxt(String summa) throws FileNotFoundException, IOException {
//        ввводит сумму при добавлении последующей суммы
        WebElement name = $(By.xpath("//div[@class='input-group__input']/input[@aria-label='2018']"));
        sleep(1500);
        try {
            name.isDisplayed();
            actions().doubleClick(name).sendKeys(summa).perform();
            LoggerConsole.LoggNotError("Заполнение поля сумма в рублях");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле сумма в рублях");
        }
    }


    //    public static void Clickcalendar( String data, String numb, String mon ) throws FileNotFoundException, IOException {
    public static void clickCalendar(String numb) throws FileNotFoundException, IOException {
// Клик на календарь и введение даты
        WebElement datamer = $(By.xpath("//div[2]/div/div/div/div/div/div/div/button[@class='elevation-1 btn btn--small']"));
        WebElement datamer2 = $(By.xpath("//div[7]/div/div/div/div/div/div/div/button[@class='elevation-1 btn btn--small']"));
        //        WebElement datamer = $(By.xpath("//div[@class='flex xs8']//div[@class='flex'][" + numb + "]//div[@class='input-group__input']"));
        sleep(1500);
        WebElement numB = $(By.xpath("//button[@class='btn btn--flat btn--floating']/div[text()='" + numb + "']"));
        //        WebElement month = $(By.xpath("//button/div[text()='" + mon + "']"));
        //        WebElement years = $(By.xpath("//ul[@class='date-picker-years']/li[text()='" + year + "']"));
        //        WebElement month = $(By.xpath("//button[@class='btn btn--flat btn--outline accent--text']/div[text()='" + mon + "']"));
        try {
            datamer.isDisplayed();
        //        actions().click(datamer).click(month).perform();
            actions().click(datamer).perform();
            sleep(2000);
            actions().click(numB).perform();
            actions().click(datamer2).perform();
            sleep(2000);
            actions().click(numB).perform();
            LoggerConsole.LoggNotError("клик на календарь");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на календарь");
        }
    }

    public static void clickordinance() throws FileNotFoundException, IOException {
//        Ввожу логин login
        WebElement datamer = $(By.xpath("//label[text()='Закон']"));
        sleep(1500);


        try {
            datamer.isDisplayed();
            actions().click(datamer).perform();
            LoggerConsole.LoggNotError("клик на поле закон");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на поле закон");
        }
    }

    public static void selectordinance(String txt) throws FileNotFoundException, IOException {
//        клик на закон
        WebElement valuation = $(By.xpath("//label[text()='" + txt + "']"));
        try {
            actions().click(valuation).perform();
            LoggerConsole.LoggNotError("выбирает закон");
        } catch (Error e) {
            LoggerConsole.Logg("не смог выбирать закон");
        }
    }

    public static void testCloseForm() throws IOException {
        //проверка на закрытие формы
        WebElement form = $(By.xpath("//nav[@class='toolbar toolbar--card toolbar--prominent']/div/*[text()='Форма создания']"));
        try {
            ((SelenideElement) form).should(Condition.not(Condition.visible));
            LoggerConsole.LoggNotError("Форма закрылась после кнопки 'Сохранить'");
        } catch (Error e) {
            LoggerConsole.Logg("Форма  НЕ закрылась после кнопки 'Сохранить'");
        }
    }
    //перенос документов
    public static void tranfer(int idDrag, int idDrop) throws AWTException {
        refresh();
        //card - поиск последней карточки
        WebElement card = $(By.xpath("//div[@data-id='container-id-"+idDrag+"']//div[@class='kanban-column__dnd-item smooth-dnd-draggable-wrapper'][last()]"));
        //stage - сам этап
        WebElement stage = $(By.xpath("//div[@data-id='container-id-"+idDrop+"']"));
        actions().dragAndDrop(card, stage).perform();
    }

    public static void clickNewZakupka(){
        WebElement click = $(By.xpath("//div[@class='kanban-column'][1]/div[3]/a/div[@class='btn__content']"));
        refresh();
        sleep(3000);
        actions().click(click).perform();
    }

}

