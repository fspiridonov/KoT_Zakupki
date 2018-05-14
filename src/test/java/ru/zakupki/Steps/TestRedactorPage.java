package ru.zakupki.Steps;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.TestHelper;
import ru.zakupki.Pages.PackagePage;
import ru.zakupki.Pages.ProcurementPage;
import ru.zakupki.Pages.RedactorPage;

import java.io.IOException;

import static java.lang.Thread.sleep;


public class TestRedactorPage {

    public static String street = "Мясницкая улица"; //Название улицы
    public static String shortStreet = "Ул"; //Два первых символа названия улицы для сортировки и ее проверки
    //   public static String[] importance = {"Важная", "МВК", "Обычная"}; //Типы статусов инициатив
    public static String[] importance = {"Важная"}; //Типы статусов инициатив


    @When("^Клик на последний элемент этапа 'Формирование комплекта документов'$")
    public static void Rationale() throws InterruptedException, IOException {
        RedactorPage.clicklastelem();
    }

    @When("^Клик на редактирование закупки$")
    public static void edit() throws InterruptedException, IOException {
        sleep(4000);
        ButtonsUtil.clickSpanButton("edit");
    }

    @When("^Клик на второе редактирование закупки$")
    public static void edit2() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.clickedit();
    }

    @When("^Заполняет поле 'Сумма'$")
    public static void FillSumma() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.fillsumma("100000");
    }

    @When("^Заполняет второе поле 'Сумма' за следующий год$")
    public static void FillSummanxt() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.fillsummanxt("1000");
    }

    @When("^Клик на поле 'Статья'$")
    public static void clickArticle() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.clickarticle();
    }

    @When("^Клик на второе поле 'Статья'$")
    public static void clickArticleNXT() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.clickarticlenxt();
    }

    @When("^Выбираем статью из выпадающего списка$")
    public static void SelectArticle() throws IOException {
        RedactorPage.selectarticle();
    }

    @When("^Выбираем статью из выпадающего списка второго$")
    public static void SelectArticleTwo() throws IOException {
        RedactorPage.selectarticleNXT();
    }


    @When("^Клик на кнопку 'Сохранить '$")
    public static void Seve() throws InterruptedException, IOException {
        sleep(4000);
        ButtonsUtil.clickSpanButton("Сохранить");
    }

    @When("^Заполняем поле Наименование$")
    public static void name() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.fillname(PackagePage.timeNameVar);
    }

    @When("^Заполняем поле Обоснование$")
    public static void Justification() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.fillreason(PackagePage.timeNameVar);
    }

    @When("^Заполняем поле Ответственный$")
    public static void fio() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.fillfio("Иван Иванович Иванов");
    }

    @When("^Клик на поле Способ расчета НМЦК$")
    public static void ClickDesignNMCK() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.clickvaluation();
    }

    @When("^Выбирает Расчет НМЦК \"(.*)\" из выпадающего списка$")
    public static void SelecteSignNMCK(String val) throws IOException {
        RedactorPage.selectvaluation(val);
    }

    @When("^Клик на поле Тип закупки")
    public static void ClickType() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.clicktype();
    }

    @When("^Выбираем Тип закупк \"(.*)\" из выпадающего списка")
    public static void SelecteType(String val) throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.selecttype(val);
    }

    @When("^Клик на поле закон$")
    public static void ClickOrdinance() throws InterruptedException, IOException {
        sleep(4000);
        RedactorPage.clickordinance();
    }

    @When("^Выбираем закон \"(.*)\" из выпадающего списка$")
    public static void SelecteOrdinance(String val) throws IOException {
        RedactorPage.selectordinance(val);
    }
}

