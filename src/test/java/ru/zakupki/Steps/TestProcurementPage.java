package ru.zakupki.Steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.TestHelper;
import ru.zakupki.Pages.InitiativePage;
import ru.zakupki.Pages.PackagePage;
import ru.zakupki.Pages.ProcurementPage;

import java.awt.*;
import java.io.IOException;

import static java.lang.Thread.sleep;


public class TestProcurementPage {

    public static String street = "Мясницкая улица"; //Название улицы

    @When("^Заполняет поле 'Обоcнование'$")
    public static void rationale() throws InterruptedException, IOException {
        ProcurementPage.fillreason(PackagePage.timeNameVar);
    }

    @When("^Заполняет поле 'Наименование'$")
    public static void fillName() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.fillname(PackagePage.timeNameVar);
    }

    @When("^Клик на поле 'Выбираем поставщика'$")
    public static void clickVendorSelection() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.Clickvendorselection();
    }


    @When("^Выбираем поставщика \"(.*)\" из выпадающего списка$")
    public static void selectVendor(String vend) throws IOException {
        ProcurementPage.selectvendor(vend);
    }

    @When("^Клик на поле 'Расчет НМЦК'$")
    public static void clickDesignNMCK() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.clickvaluation();
    }

    @When("^Выбирает 'Расчет НМЦК' \"(.*)\" из выпадающего списка$")
    public static void selecteSignNMCK(String val) throws IOException {
        ProcurementPage.selectvaluation(val);
    }

    @When("^Клик на поле 'Закон'$")
    public static void clickOrdinance() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.clickordinance();
    }

    @When("^Выбирает 'Закон' \"(.*)\"$")
    public static void selecteOrdinance(String val) throws IOException {
        ProcurementPage.selectordinance(val);
    }

    @When("^Заполняет поле 'Сумма в рублях'$")
    public static void fillSumma() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.fillsumma("1000");
    }

    @When("^Заполняет следующее поле 'Сумма в рублях'$")
    public static void fillSummanxt() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.fillsummanxt("1000");
    }

    @When("^Клик на кнопку 'Сохранить'$")
    public static void sаve() throws InterruptedException, IOException {
        sleep(4000);
        ButtonsUtil.clickSpanButton("Сохранить");
    }

    @When("^Кликает на кнопку 'Добавить'$")
    public static void clickAdd() throws InterruptedException, IOException {
        sleep(4000);
        ButtonsUtil.clickSpanButton("add");
    }

    @When("^Клик на кнопку 'Новая закупка'$")
    public static void newIpurchase() throws IOException {
        ButtonsUtil.clickSpanButton("Новая Закупка");
    }

    @Then("^Проверяет, что форма закрылась$")
    public static void estCloseWindow() throws InterruptedException, IOException {

        sleep(5000);
        TestHelper.testCloseWindowCreatInit("Новая инициатива");
    }

    @When("^Кликает на календарь$")
    public static void clickCalendar() throws InterruptedException, IOException {
        sleep(2000);
//        ProcurementPage.Clickcalendar("29");
        sleep(1000);
    }

}

