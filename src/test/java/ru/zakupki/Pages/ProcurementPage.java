package ru.zakupki.Pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.When;
import cucumber.runtime.io.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.LoggerConsole;
import ru.zakupki.Helpers.StorageString;
import ru.zakupki.Helpers.TestHelper;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;
import static java.lang.Thread.sleep;
import static ru.zakupki.Helpers.LoggerConsole.Logg;
import static ru.zakupki.Helpers.LoggerConsole.LoggNotError;
import static ru.zakupki.Helpers.StorageString.stringNumberDoc.numberDoc;
import static ru.zakupki.Pages.Check_Boxes_1_Page.nameCheck;

public class ProcurementPage {


    public static void fillname(String txt) throws IOException, InterruptedException {
//Заполняет поле 'Наименование'
        WebElement name = $(By.xpath("//textarea[@name='name']"));
        sleep(1500);
        Random random = new Random();
        int num = random.nextInt(999);
        String randomDoc = txt+num;
        try {


            actions().click(name).sendKeys(randomDoc).perform();

            numberDoc = randomDoc;
            LoggerConsole.LoggNotError("Заполнение поля наименования");


        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле наименования");
        }
    }

    public static void fillreason(String txt) throws IOException, InterruptedException {
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

    public static void Clickvendorselection() throws IOException, InterruptedException {
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

    public static void clickvaluation() throws IOException, InterruptedException {
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


    public static void fillsumma(String summa) throws FileNotFoundException, IOException, InterruptedException {
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


    public static void fillsummanxt(String summa) throws FileNotFoundException, IOException, InterruptedException {
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
    public static void clickCalendar(String numb) throws FileNotFoundException, IOException, InterruptedException {
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
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clickordinance() throws FileNotFoundException, IOException, InterruptedException {
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


    public static void testStorage() throws InterruptedException {
        sleep(6000);
        $(By.xpath("//div[contains(text(),'" + numberDoc + "')]/../../div[3]/div/div[text()]")).shouldHave(Condition.visible);
        String xpath = "//div[contains(text(),'" + numberDoc + "')]/../../div[3]/div/div[text()]";
        ElementsCollection collect = $$(By.xpath(xpath));

        for (SelenideElement aCollection : collect) {
            String ch = aCollection.getText();
            nameCheck.add(ch);
        }
    }

    public static void testCloseForm() throws IOException, InterruptedException {
        //проверка на закрытие формы
        sleep(2000);
        WebElement form = $(By.xpath("//nav[@class='toolbar toolbar--card toolbar--prominent']/div/*[text()='Форма создания']"));
        try {
            ((SelenideElement) form).should(Condition.not(Condition.visible));
            LoggerConsole.LoggNotError("Форма закрылась после кнопки 'Сохранить'");
        } catch (Error e) {
            LoggerConsole.Logg("Форма  НЕ закрылась после кнопки 'Сохранить'");
        }
    }
    //перенос документов
    public static void tranfer(int colomn, int colomn1 ) throws AWTException, InterruptedException {
        refresh();
        sleep(3000);
//        Robot robot = new Robot();
//        robot.keyRelease(KeyEvent.VK_F11);

        //card - поиск последней карточк
        WebElement x1 = $(By.xpath("//div[@data-index='" + colomn + "']/div/div/div/div[2]/div[text()='"+numberDoc+"']/.."));
        //stage - сам этап
        WebElement x2 = $(By.xpath("//div[@data-index='" + colomn1 + "']"));
//        sleep(2000);
////        actions().click(x1).click(x2).perform();
//        robot.setAutoDelay(1500);
//        org.openqa.selenium.Dimension fromSize = x1.getSize();
//        org.openqa.selenium.Dimension toSize = x2.getSize();
//        int xCentreFrom = fromSize.width / 2;
//        int yCentreFrom = fromSize.height / 2;
//        int xCentreTo = toSize.width / 2;
//        int yCentreTo = toSize.height / 2;
//        org.openqa.selenium.Point fromLocation = x1.getLocation();
//        Point toLocation = x2.getLocation();
//        toLocation.x += xCentreTo;
//        toLocation.y += yCentreTo;
//        fromLocation.x += xCentreFrom;
//        fromLocation.y += yCentreFrom;
//        robot.mouseMove(fromLocation.x, fromLocation.y);
//        robot.mousePress(MouseEvent.BUTTON1_MASK);
//        robot.setAutoDelay(2000);
//        robot.mouseMove(((toLocation.x - fromLocation.x) / 2) + fromLocation.x, ((toLocation.y - fromLocation.y) / 2) + fromLocation.y);
//        robot.mouseMove(toLocation.x, toLocation.y);
//        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
//        robot.setAutoDelay(2000);
////        actions().pause(1000).dragAndDrop(card, stage).perform();
//        sleep(3000);
//        refresh();


        actions().dragAndDrop(x1,x2).perform();


    }

    public static void clickNewZakupka() throws InterruptedException {
        WebElement click = $(By.xpath("//div[@class='btn__content' and text()]"));
        sleep(2000);
        actions().pause(2000).click(click).perform();
    }

}

