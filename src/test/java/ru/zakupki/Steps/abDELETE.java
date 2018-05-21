package ru.zakupki.Steps;

import cucumber.api.java.en.When;
import ru.zakupki.Pages.RedactorPage;

import java.io.IOException;

import static java.lang.Thread.sleep;


public class abDELETE {

    @When("^удалить$")
    public static void delete() throws IOException, InterruptedException {
        RedactorPage.clicklastelem();
        RedactorPage.clickDelete();
    }
}
