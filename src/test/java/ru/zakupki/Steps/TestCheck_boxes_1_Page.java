package ru.zakupki.Steps;


import cucumber.api.java.en.When;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.TestHelper;
import ru.zakupki.Pages.Check_Boxes_1_Page;
import ru.zakupki.Pages.PackagePage;
import ru.zakupki.Pages.RedactorPage;

import java.awt.*;
import java.io.IOException;

import static java.lang.Thread.sleep;


public class TestCheck_boxes_1_Page {

    public static String street = "Мясницкая улица"; //Название улицы
    public static String shortStreet = "Ул"; //Два первых символа названия улицы для сортировки и ее проверки
    //   public static String[] importance = {"Важная", "МВК", "Обычная"}; //Типы статусов инициатив
    public static String[] importance = {"Важная"}; //Типы статусов инициатив


//    @When("^Клик на чек-бокс one \"(.*)\"$")
//    public static void clickLast4KBox1(String val) throws InterruptedException, IOException {
//        Check_Boxes_1_Page.clicklast4Box();
//    }

    @When("^Клик на чек-бокс$")
    public static void clickLast4KBox() throws InterruptedException, IOException {
        sleep(4000);
        Check_Boxes_1_Page.clicklast4Box();
        TestHelper.testOpenFormCheckBox();

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

    @When("^Прикрепление нередактируемых файлов$")
    public static void LoadDontEditFile() throws InterruptedException, IOException, AWTException {
        sleep(2000);
        TestHelper.loadFile("1111.dgn", 1);
    }

    @When("^Прикрепление редактируемых файлов$")
    public static void LoadEditFile() throws InterruptedException, IOException {
        TestHelper.loadFile("1111.dgn",2);
    }

    @When("^Прикрепление нередактируемых файлов 'Формирование ТЗ'$")
    public static void LoadDontEditFileTZ() throws InterruptedException, IOException, AWTException {
        sleep(1500);
        TestHelper.loadFile("1111.dgn", 1);
    }

    @When("^Прикрепление редактируемых файлов 'Формирование ТЗ'$")
    public static void LoadEditFileTZ() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn", 2);
    }

    @When("^Прикрепление нередактируемых файлов 'Расчет НМЦК'$")
    public static void LoadDontEditFileNMCK() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn",1);
    }

    @When("^Прикрепление редактируемых файлов 'Расчет НМЦК'$")
    public static void LoadEditFileNMCK() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn", 2);
    }

    @When("^Прикрепление нередактируемых файлов 'Ценовая комиссия'$")
    public static void loadFilenoeditCommision() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn", 1);
    }

    @When("^Прикрепление редактируемых файлов 'Ценовая комиссия'$")
    public static void loadFileeditCommision() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn", 2);
    }

    @When("^Прикрепление нередактируемых файлов 'Заявка на всключение в ПЗ и ПГ'$")
    public static void loadFilenoeditPZPG() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn",1 );
    }

    @When("^Прикрепление редактируемых файлов 'Заявка на всключение в ПЗ и ПГ'$")
    public static void loadFileeditPZPG() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn", 2);
    }

    @When("^Прикрепление нередактируемых файлов 'Проект контракта'$")
    public static void loadFilenoeditProContract() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn", 1);
    }

    @When("^Прикрепление редактируемых файлов 'Проект контракта'$")
    public static void loadFileeditProContract() throws InterruptedException, IOException, AWTException {
        TestHelper.loadFile("1111.dgn",2);
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

}

