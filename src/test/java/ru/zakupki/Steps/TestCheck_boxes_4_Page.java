package ru.zakupki.Steps;

import cucumber.api.java.en.When;
import ru.zakupki.Pages.Check_Boxes_4_Page;

import java.io.IOException;

public class TestCheck_boxes_4_Page {

    @When("^Клик на чек-бокс 4 \"(.*)\"$")
    public static void clickCheckBox(String val) throws IOException {
        Check_Boxes_4_Page.clickCheckBox(val);
    }

    @When("^Выбор поля \"(.*)\" и заполняем значения \"(.*)\"$")
    public static void clickInput(String input, String string) throws IOException {
        Check_Boxes_4_Page.clickInputDate(input, string);
    }
}
