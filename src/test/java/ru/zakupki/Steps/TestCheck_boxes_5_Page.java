package ru.zakupki.Steps;

import cucumber.api.java.en.When;
import ru.zakupki.Pages.Check_Boxes_4_Page;
import ru.zakupki.Pages.Check_Boxes_5_Page;

import java.io.IOException;

public class TestCheck_boxes_5_Page {

    @When("^Клик на чек-бокс 5 \"(.*)\"$")
    public static void clickCheckBox(String val) throws IOException {
        Check_Boxes_5_Page.clickCheckBox(val);
    }

    @When("^Выбор блока \"(.*)\" и заполнение поля \"(.*)\" со значением \"(.*)\"$")
    public static void clickInput1(String blok, String input, String string) throws IOException {
        Check_Boxes_5_Page.clickInputDate(blok, input, string);
    }
//
//    @When("^Ввод реестрового номера контракта$")
//    public static void inpitReestNum(String num){
//
//    }

}
