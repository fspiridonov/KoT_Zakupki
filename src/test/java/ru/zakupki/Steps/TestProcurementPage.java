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
        sleep(1000);
        ProcurementPage.fillname(PackagePage.timeNameVar);
    }

    @When("^Клик на поле 'Выбираем поставщика'$")
    public static void clickVendorSelection() throws InterruptedException, IOException {
        sleep(1000);
        ProcurementPage.Clickvendorselection();
    }


    @When("^Выбираем поставщика \"(.*)\" из выпадающего списка$")
    public static void selectVendor(String vend) throws IOException, InterruptedException {
        sleep(2000);
        ProcurementPage.selectVendor(vend);
    }

    @When("^Клик на поле 'Расчет НМЦК'$")
    public static void clickDesignNMCK() throws InterruptedException, IOException {
        sleep(1000);
        ProcurementPage.clickvaluation();
    }

    @When("^Выбирает 'Расчет НМЦК' \"(.*)\" из выпадающего списка$")
    public static void selecteSignNMCK(String val) throws IOException {
        ProcurementPage.selectValuation(val);
    }

    @When("^Клик на поле 'Закон'$")
    public static void clickOrdinance() throws InterruptedException, IOException {
        sleep(1000);
        ProcurementPage.clickordinance();
    }

    @When("^Выбирает 'Закон' \"(.*)\"$")
    public static void selecteOrdinance(String val) throws IOException {
        ProcurementPage.selectordinance(val);
    }

    @When("^Заполняет поле \"(.*)\"$")
    public static void fillSumma(String sum) throws InterruptedException, IOException {
        sleep(1000);
        ProcurementPage.fillsumma(sum);
    }

    @When("^Заполняет следующее поле 'Сумма в рублях'$")
    public static void fillSummanxt() throws InterruptedException, IOException {
        sleep(1000);
        ProcurementPage.fillsummanxt("50000");
    }

    @When("^Клик на кнопку 'Сохранить'$")
    public static void sаve() throws InterruptedException, IOException {
        sleep(1000);
        ButtonsUtil.clickSpanButton("Сохранить");

    }

    @When("^Кликает на кнопку 'Добавить'$")
    public static void clickAdd() throws InterruptedException, IOException {
        sleep(1000);
        ButtonsUtil.clickSpanButton("add");
    }

    @When("^Клик на кнопку 'Новая закупка'$")
    public static void newIpurchase() throws IOException, InterruptedException {
        sleep(2000);
        ProcurementPage.clickNewZakupka();
    }

    @Then("^Проверяет, что форма закрылась$")
    public static void estCloseWindow() throws InterruptedException, IOException {
        sleep(4000);
        TestHelper.testCloseWindowCreatInit("Новая инициатива");
    }

    @When("^Кликает на календарь$")
    public static void clickCalendar() throws InterruptedException, IOException {
        sleep(1000);
        ProcurementPage.clickCalendar("29");
        sleep(1000);
    }

    @When("^Проверка на закрытие формы 'Форма создания'$")
    public static void closeForm() throws IOException {
        ProcurementPage.testCloseForm();
    }

    @When("^Перенос карточки на след этап$")
    public static void transferCardZakupki() throws AWTException, InterruptedException {
        sleep(3000);
        ProcurementPage.tranfer(1,2);
        sleep(3000);
    }

}

