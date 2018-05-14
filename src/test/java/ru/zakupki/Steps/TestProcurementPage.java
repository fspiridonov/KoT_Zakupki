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
   public static String shortStreet = "Ул"; //Два первых символа названия улицы для сортировки и ее проверки
//   public static String[] importance = {"Важная", "МВК", "Обычная"}; //Типы статусов инициатив
    public static String[] importance = {"Важная"}; //Типы статусов инициатив





    @When("^Заполняет поле 'Обоcнование'$")
    public static void Rationale () throws InterruptedException, IOException {
        ProcurementPage.fillreason(PackagePage.timeNameVar);
    }
    @When("^Заполняет поле 'Наименование'$")
    public static void FillName () throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.fillname(PackagePage.timeNameVar);
    }

    @When("^Клик на поле 'Выбираем поставщика'$")
    public static void ClickVendorSelection () throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.Clickvendorselection();
    }


        @When("^Выбираем поставщика \"(.*)\" из выпадающего списка$")
        public static void SelectVendor(String vend) throws IOException {
            ProcurementPage.selectvendor(vend);
        }
    @When("^Клик на поле 'Расчет НМЦК'$")
    public static void ClickDesignNMCK() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.clickvaluation();
    }
    @When("^Выбирает 'Расчет НМЦК' \"(.*)\" из выпадающего списка$")
    public static void SelecteSignNMCK(String val) throws IOException {
        ProcurementPage.selectvaluation(val);
    }
    @When("^Клик на поле 'Закон'$")
    public static void ClickOrdinance() throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.clickordinance();
    }

    @When("^Выбирает 'Закон' \"(.*)\"$")
    public static void SelecteOrdinance(String val) throws IOException {
        ProcurementPage.selectordinance(val);
    }

    @When("^Заполняет поле 'Сумма в рублях'$")
    public static void FillSumma () throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.fillsumma("1000");
    }

    @When("^Заполняет следующее поле 'Сумма в рублях'$")
    public static void FillSummanxt () throws InterruptedException, IOException {
        sleep(4000);
        ProcurementPage.fillsummanxt("1000");
    }

    @When("^Клик на кнопку 'Сохранить'$")
    public static void Seve () throws InterruptedException, IOException {
        sleep(4000);
        ButtonsUtil.clickSpanButton("Сохранить");
    }
    @When("^Кликает на кнопку 'Добавить'$")
    public static void ClickAdd () throws InterruptedException, IOException {
        sleep(4000);
        ButtonsUtil.clickSpanButton("add");
    }

    @When("^Клик на кнопку 'Новая закупка'$")
    public static void NewIpurchase () throws IOException {
        ButtonsUtil.clickSpanButton("Новая закупка");
    }

    @Then("^Проверяет, что форма закрылась$")
    public static void estCloseWindow() throws InterruptedException, IOException {

        sleep(5000);
        TestHelper.testCloseWindowCreatInit("Новая инициатива");
    }
    @When("^Кликает на календарь$")
    public static void ClickCalendar () throws InterruptedException, IOException {
        sleep(2000);
//        ProcurementPage.Clickcalendar("29");
        sleep(1000);

    }

}

