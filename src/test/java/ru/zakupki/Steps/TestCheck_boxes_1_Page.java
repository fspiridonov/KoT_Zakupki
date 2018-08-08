package ru.zakupki.Steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.TestHelper;
import ru.zakupki.Pages.Check_Boxes_1_Page;
import ru.zakupki.Pages.PackagePage;
import ru.zakupki.Pages.RedactorPage;

import java.awt.*;
import java.io.IOException;

import static com.codeborne.selenide.Selenide.refresh;
import static java.lang.Thread.sleep;


public class TestCheck_boxes_1_Page {

    public static String street = "Мясницкая улица"; //Название улицы
    public static String shortStreet = "Ул"; //Два первых символа названия улицы для сортировки и ее проверки
    //   public static String[] importance = {"Важная", "МВК", "Обычная"}; //Типы статусов инициатив
    public static String[] importance = {"Важная"}; //Типы статусов инициатив


    @When("^Клик на чек-бокс \"(.*)\"$")
    public static void clickLast4KBox(String txt) throws InterruptedException, IOException {
        sleep(3000);
        Check_Boxes_1_Page.clicklast4Box();
//        TestHelper.testOpenFormCheckBox();
    }

    @When("^Клик на кнопкку 'Заполнить КПГЗ'$")
    public static void ClickFillKPGZ() throws InterruptedException, IOException {
        sleep(4000);
        Check_Boxes_1_Page.clickfillKPGZ();
    }

    @When("^Заполняет поле 'Код КПГЗ'$")
    public static void FillKPGZ() throws InterruptedException, IOException {
        sleep(4000);
        Check_Boxes_1_Page.fillKPGZ(PackagePage.timeNameVar);
    }

    @When("^Клик на кнопку 'Подтвердить'$")
    public static void ClickApprove() throws InterruptedException, IOException {
        ButtonsUtil.clickSpanButton("Подтвердить");
        Check_Boxes_1_Page.closeJobClick();
    }

    @When("^Клик на кнопку 'Согласовать'$")
    public static void Clickadd() throws InterruptedException, IOException {
        Check_Boxes_1_Page.Clickadd();
    }

    @When("^Клик на кнопку 'Отправить на согласование'$")
    public static void Send4approval() throws InterruptedException, IOException {
        Check_Boxes_1_Page.Clickadd();
    }

    @When("^Заполняет поле комментария$")
    public static void FeelCommnt() throws InterruptedException, IOException {
        Check_Boxes_1_Page.fillcommentariy("комментарий");
    }

    @When("^Прикрепление нередактируемых файлов \"(.*)\"$")
    public static void LoadDontEditFile(String file) throws InterruptedException, IOException, AWTException {
        sleep(2000);
        TestHelper.loadFile("1111.dgn", 1);
    }

    @When("^Прикрепление редактируемых файлов \"(.*)\"$")
    public static void LoadEditFile(String file) throws InterruptedException, IOException {
        TestHelper.loadFile("1111.dgn",2);
    }

    @When("^Прикрепление нередактируемых файлов \"(.*)\" 2$")
    public static void LoadDontFileOChTTZ(String txt) throws InterruptedException, IOException, AWTException {
        TestHelper.loadFileNext("1111.dgn", 1);
    }

    @When("^Прикрепление редактируемых файлов \"(.*)\" 2$")
    public static void LoadEditFileOChTTZ(String txt) throws InterruptedException, IOException, AWTException {
        TestHelper.loadFileNext("1111.dgn", 2);
    }

    @When("^Клик на кнопку 'Разработать нетиповое ТЗ'$")
    public static void CkickDevelopAtypical() throws InterruptedException, IOException {
        Check_Boxes_1_Page.Clickadd();
    }

    @When("^Клик на кнопку 'Загрузить ТЗ'$")
    public static void CkickLoadTZ() throws InterruptedException, IOException {
        sleep(2000);
        Check_Boxes_1_Page.Clickadd();
        sleep(1000);
    }

    @When("^Клик на кнопку 'Загрузить рассчет НМЦК'$")
    public static void CkickLoadNMCK() throws InterruptedException, IOException {
        sleep(2000);
        Check_Boxes_1_Page.Clickadd();
    }

    @Then("^Проверка на открытие формы \"(.*)\"$")
    public static void TestOpenForm(String txt) throws InterruptedException, IOException {
        Check_Boxes_1_Page.testOpenForm();
    }

    @Then("^Проверка на закрытие формы \"(.*)\"$")
    public static void TestCloseForm(String txt) throws InterruptedException, IOException {
        Check_Boxes_1_Page.testCloseForm();
    }


    @Then("^Перезагрузка страницы$")
    public static void refresh1() throws InterruptedException, IOException {
        refresh();
    }

}

