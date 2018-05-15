package ru.zakupki.Steps;

import cucumber.api.java.ca.I;
import cucumber.api.java.en.When;
import ru.zakupki.Helpers.ButtonsUtil;
import ru.zakupki.Helpers.TestHelper;
import ru.zakupki.Pages.AutorizationPage;
import ru.zakupki.Pages.RequestPage;

import java.io.IOException;

import static java.lang.Thread.sleep;

public class TestAutorizationPage {

    @When("^вводим логин \"(.*)\"$")
    public static void loginL(String log) throws IOException, InterruptedException {
        AutorizationPage.fillLogin(log);
        sleep(1000);
    }

    @When("^вводим пароль \"(.*)\"$")
    public static void loginP(String pas) throws IOException, InterruptedException {
        AutorizationPage.fillPassword(pas);
        sleep(1500);
        ButtonsUtil.clickSpanButton("Войти");
    }

    @When("^Выход из системы$")
    public static void logOut() throws IOException {
        AutorizationPage.exit();
    }

    @When("Stop test")
    public static void stop() throws IOException {
        AutorizationPage.exit1();
    }
}
