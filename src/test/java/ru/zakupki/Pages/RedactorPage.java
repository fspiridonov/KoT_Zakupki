package ru.zakupki.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import ru.zakupki.Helpers.LoggerConsole;

import java.io.FileNotFoundException;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.*;

public class RedactorPage {


    public static void clicklastelem() throws IOException {
//входит внутрь тестовой закупки
        WebElement name = $(By.xpath("//div[@data-id='container-id-1']/div/div[last()]/div/div[@class='card__text']")).doubleClick();
        sleep(2000);
            try {
            actions().doubleClick(name).perform();
            LoggerConsole.LoggNotError("входит внутрь тестовой закупки");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог войти внутрь тестовой закупки");
        }
    }

    public static void fillsumma(String txt) throws IOException {
//Заполнение поля сумма
 //       WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2018]/ancestor::div[1]//input[@aria-label='Сумма']"));
   WebElement name = $(By.xpath("//input[@type='number']"));
        sleep(2000);

        try {
            actions().click(name).perform();
            actions().sendKeys(Keys.CONTROL+"a").sendKeys(Keys.DELETE).build().perform();
            sleep(2000);
            ((SelenideElement) name).setValue(txt);
            actions().sendKeys(txt).build().perform();

            LoggerConsole.LoggNotError("Заполнение поля сумма");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле сумма");
        }
    }

    public static void fillsummanxt(String txt) throws IOException {
//Заполнение следующего поля сумма
        WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2019]/ancestor::div[1]//input"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).sendKeys(txt).perform();
            LoggerConsole.LoggNotError("Заполнение следующего поля сумма");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить следующее поле сумма");
        }
    }

    public static void selectarticle() throws IOException {
//Выбираем статью из выпадающего списка
        WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2018]/ancestor::div[1]//div[@class='flex xs8']/select/option[1]"));
        sleep(1500);

        try {

            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("выбирает статью");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог выбрать статью из выпадающего списка");
        }
    }

    public static void selectarticleNXT() throws IOException {
//Выбираем статью из выпадающего списка второго
        WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2019]/ancestor::div[1]//div[@class='flex xs8']/select/option[1]"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("выбирает статью");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог выбрать статью из выпадающего списка");
        }
    }

    public static void clickedit() throws IOException {
//Клик на второй редактирование закупки
        WebElement name = $(By.xpath("//div[2]/div/button/div[@class='btn__content']/i[text()='edit']"));
        sleep(1500);

        try {
            name.isDisplayed();
            actions().click(name).perform();
            LoggerConsole.LoggNotError("Клик на вторую кнопку редактирования закупки");
        } catch (Error e) {
            LoggerConsole.Logg("Не смог кликнуть на вторую кнопку редактирования закупки");
        }
    }

    public static void clickarticle() throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//div[@class='flex title xs2' and text() = 2018]/ancestor::div[1]//div[@class='input-group__selections']/input"));
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

    public static void fillname(String txt) throws IOException {
//заполняем поле причины
        WebElement name = $(By.xpath("//input[@name='name']"));
        sleep(1500);

        try {

            name.isDisplayed();
            actions().doubleClick(name).sendKeys(Keys.DELETE).sendKeys(txt).perform();
            LoggerConsole.LoggNotError("Заполнение поля наименования");

        } catch (Error e) {
            LoggerConsole.Logg("Не смог заполнить поле наименования");
        }
    }

    public static void fillreason(String txt) throws IOException {
//заполняем поле обоснования
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
//заполняем поле Ответственный
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
//Клик на поле Способ расчета НМЦК
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
//        Выбирает Расчет НМЦК
        WebElement valuation = $(By.xpath("//div[text()=]//option[text()='" + valua + "']"));
        try {

            actions().click(valuation).perform();
//            actions().sendKeys(fieldLogin,login).perform();

            LoggerConsole.LoggNotError("Выбирает Расчет НМЦК");
        } catch (Error e) {
            LoggerConsole.Logg("не смог Выбирать Расчет НМЦК");
        }
    }

    public static void clicktype() throws IOException {
//Клик на поле Тип закупки
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
//        клик на поле закон
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