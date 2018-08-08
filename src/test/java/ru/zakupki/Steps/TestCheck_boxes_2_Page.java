package ru.zakupki.Steps;


import cucumber.api.java.en.When;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.TestHelper;
import ru.zakupki.Pages.Check_Boxes_1_Page;
import ru.zakupki.Pages.Check_Boxes_2_Page;
import ru.zakupki.Pages.PackagePage;

import java.io.IOException;

import static java.lang.Thread.sleep;


public class TestCheck_boxes_2_Page {

    public static String street = "Мясницкая улица"; //Название улицы
    public static String shortStreet = "Ул"; //Два первых символа названия улицы для сортировки и ее проверки
    //   public static String[] importance = {"Важная", "МВК", "Обычная"}; //Типы статусов инициатив
    public static String[] importance = {"Важная"}; //Типы статусов инициатив


    @When("^Клик на чек-бокс 2 \"(.*)\"$")
    public static void clickLast4KBox(String val) throws InterruptedException, IOException {
        sleep(2000);
        Check_Boxes_2_Page.clicklast4Box(val);
    }

    @When("^Клик на кнопку 'Передать'$")
    public static void Clickadd() throws InterruptedException, IOException {
        Check_Boxes_1_Page.Clickadd();
    }
}

