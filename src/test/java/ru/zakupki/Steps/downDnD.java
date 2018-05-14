package ru.zakupki.Steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.LoggerConsole;
import ru.zakupki.Helpers.TestHelper;
import ru.zakupki.Pages.RequestPage;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static ru.zakupki.Helpers.LoggerConsole.Logg;
//import static ru.zakupki.Helpers.LoggerConsole.LoggNotCrush;
import static ru.zakupki.Helpers.StorageString.contentOfWorks.cWork;
import static ru.zakupki.Helpers.TestHelper.errorCrarh;

public class downDnD {
    @When("^Перемещение документа из этапа Реализации в этап Утвержденные$")
    public static void dnd_Of_4_For_5() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDrop("4", "3","на 1 шаг");
        errorCrarh();

    }


    @When("^Перемещение документа из этапа Реализации в этап Согласование$")
    public static void dnd_Of_3_For_5() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()-2]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()-2]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDropPackage("4", "2", "на 2 шага");
    }


    @When("^Перемещение документа из этапа Реализации в этап Корректировка$")
    public static void dnd_Of_2_For_5() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDrop("4", "1", "на 3 шага");
    }

    @When("^Перемещение документа из этапа Реализации в этап Инициатива$")
    public static void dnd_Of_1_For_5() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='4']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDrop("4", "0", "на 4 шага");
        errorCrarh();

    }

     @When("^Перемещение документа из этапа Утвержденные в этап Инициатива$")
    public static void dnd_Of_1_For_4() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='3']/div/div/div[last()]//div[2]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='3']/div/div/div[last()]//div[2]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDrop("3", "0","на 3 шага");
        errorCrarh();
    }

    @When("^Перемещение документа из этапа Утвержденные в этап Корректировка$")
    public static void dnd_Of_2_For_4() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='3']/div/div/div[last()]//div[2]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='3']/div/div/div[last()]//div[2]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDrop("3", "1","на 2 шага");
    }

    @When("^Перемещение документа из этапа Утвержденные в этап Согласование$")
    public static void dnd_Of_3_For_4() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='3']/div/div/div[last()-2]//div[2]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='3']/div/div/div[last()-2]//div[2]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDropPackage("3", "2","на 1 шаг");
    }


    @When("^Перемещение документа из этапа Согласование в этап Корректировка$")
    public static void dnd_Of_2_For_3() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-kot-id='2']/div/div[3]/div[last()]/div[2]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-kot-id='2']/div/div[3]/div[last()]/div[2]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDropPackage("2", "1","на 1 шаг");
    }

    @When("^Перемещение документа из этапа Согласование в этап Инициатива$")
    public static void dnd_Of_1_For_3() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-kot-id='2']/div/div[3]/div[last()]/div[2]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-kot-id='2']/div/div[3]/div[last()]/div[2]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDrop("2", "0","на 2 шага");
    }


    @When("^Перемещение документа из этапа Корректировка в этап Инициатива$")
    public static void dnd_Of_1_For_2() throws InterruptedException, AWTException, IOException {
        $(By.xpath("//td[@data-lavel='1']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).click();
        sleep(1500);
        $(By.xpath("//td[@data-lavel='1']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited'][last()]")).doubleClick();
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        sleep(1500);
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
        sleep(1500);
        TestHelper.downDragAndDrop("1", "0","на 1 шаг");
    }

    @When("^Проверка что перемещение в этап Корректировка не произошло$")
    public static void testDnd3() throws InterruptedException, AWTException {
        try {
            $(By.xpath("//td[@data-lavel='1']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited']/div[@class='c-process-card__main i-bem c-process-card__main_js_inited' and text()='"+ cWork +"']")).should(visible);
            Logg("Документ был перенесен");
        } catch (Error e){
//            LoggNotCrush("Документ не перенесен");
        }
    }

    @When("^Проверка что перемещение в этап Инициатива не произошло$")
    public static void testDnd4() throws InterruptedException, AWTException {
        try {
            $(By.xpath("//td[@data-lavel='0']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited']/div[@class='c-process-card__main i-bem c-process-card__main_js_inited' and text()='"+ cWork +"']")).should(visible);
            Logg("Документ был перенесен");
        } catch (Error e){
//            LoggNotCrush("Документ не перенесен");
        }
    }

    @When("^Проверка что перемещение в этап Утверждённые не произошло$")
    public static void testDnd() throws InterruptedException, AWTException {
        try {
            $(By.xpath("//td[@data-lavel='3']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited']/div[@class='c-process-card__main i-bem c-process-card__main_js_inited' and text()='" + cWork + "']")).should(visible);
            Logg("Документ был перенесен");
        } catch (Error e) {
//            LoggNotCrush("Документ не перенесен");
        }
    }
    @When("^Проверка что перемещение в этап Согласование не произошло$")
    public static void testDnd2() throws InterruptedException, AWTException {
        try {
            $(By.xpath("//td[@data-lavel='2']//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited']/div[@class='c-process-card__main i-bem c-process-card__main_js_inited' and text()='"+ cWork +"']")).should(visible);
            Logg("Документ был перенесен");
        } catch (Error e){
//            LoggNotCrush("Документ не перенесен");
        }
    }



}





