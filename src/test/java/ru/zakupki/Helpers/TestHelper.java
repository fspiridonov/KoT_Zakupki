package ru.zakupki.Helpers;

import com.codeborne.selenide.*;
import org.openqa.selenium.*;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;


import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Random;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.io.File;

import static com.codeborne.selenide.Condition.disappear;
import static com.codeborne.selenide.Condition.not;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.actions;
import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import static ru.zakupki.Helpers.LoggerConsole.Logg;
import static ru.zakupki.Helpers.LoggerConsole.LoggNotError;
import static ru.zakupki.Helpers.StorageString.contentOfWorks.cWork;

public class TestHelper {

    public static void assertScreen() {
//        Делает скриншот с именем файла AssertionError, каждый раз затирает старый
        String name = "AssertionError_" + String.valueOf(System.currentTimeMillis());
        screenshot(name);
        System.out.println("Скриншот состояния во время упавшей проверки: " + name);
    }

    public static void loadFile(String file) {
//        Загружаю файл file кнопкой
//        $(By.xpath("//h5[text()='Загрузить файл']/ancestor::div[3]//input[@type='file']")).sendKeys("C:\\Users\\mdivani_MG\\Documents\\mgtniip\\KoT\\src\\test\\repository\\Files\\" + file);

        $(By.xpath("//input[@type='file']")).uploadFile(new File("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file));

    }
    public static void loadFilenoedit(String file) throws AWTException {
//        Загружаю Нередактируемый файл
//        $(By.xpath("//h5[text()='Загрузить файл']/ancestor::div[3]//input[@type='file']")).sendKeys("C:\\Users\\mdivani_MG\\Documents\\mgtniip\\KoT\\src\\test\\repository\\Files\\" + file);
 //       $(By.xpath("//input[@aria-label='Нередактируемый файл']")).sendKeys("src\\test\\repository\\Files\\" + file);
 //       $(By.xpath("//input[@aria-label='Нередактируемый файл']")).click();
//

        $(By.xpath("//input[@name='file_1']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);

    }
    public static void loadFileedit(String file) {
//        Загружаю Редактируемый файл
//        $(By.xpath("//h5[text()='Загрузить файл']/ancestor::div[3]//input[@type='file']")).sendKeys("C:\\Users\\mdivani_MG\\Documents\\mgtniip\\KoT\\src\\test\\repository\\Files\\" + file);
        $(By.xpath("//input[@name='file_1_copy']")).uploadFile(new File("src\\test\\repository\\Files\\" + file));
    }
    public static void loadFilenoedittz(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_40']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);

    }
    public static void loadFileedittz(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_40_copy']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);

    }
    public static void loadFilenoeditnmck(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_14']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }
    public static void loadFileeditnmck(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_14_copy']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }

    public static void loadFilenoeditncommision(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_11']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }
    public static void loadFileeditncommision(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_11_copy']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }
    public static void loadFilenoeditpzpg(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_42']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }
    public static void loadFileeditpzpg(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_42_copy']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }
    public static void loadFilenoeditprocontr(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_7']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }
    public static void loadFileeditprocontr(String file) throws AWTException {
//        Загружаю Нередактируемый файл
        $(By.xpath("//input[@name='file_7_copy']")).sendKeys("C:\\Users\\Boriskin_SA\\Downloads\\Telegram Desktop\\KoTClone\\KoTClone\\src\\test\\repository\\Files\\" + file);
    }

    public static void scrollToBottom(String columnNum, String columnType) throws AWTException {
//        Скроллинг в самый низ колонки
//        columnNum - номер колонки по id(например, инициатива - 0)
//        columnType - тип колонки еще раз для подсчета созданных в ней инициатив/запросов и т д (параметр data-bem)
//        Для запроса columnType = RequestShow
        sleep(1000); //Чтобы успело подгрузиться
        int size = $$(By.xpath("//td[@id='kot_id_" + columnNum + "']//div[contains(@data-bem, '" + columnType + "')]")).size(); //количество всех инициатив

        SelenideElement column = $(By.xpath("//td[@id='kot_id_" + columnNum + "']//div[contains(@class,'b-flex-column')]"));
        org.openqa.selenium.Point from = column.getLocation(); // для получение координат элемента
        int x = from.getX(); //x элемента
        int y = from.getY(); //y элемента

        Robot robot = new Robot();
        robot.setAutoDelay(500);
        robot.mouseMove(x + 20, y + 200);
        robot.mouseWheel(size * 500);
        robot.waitForIdle(); // Ждет пока исполнится вся цепочка действий
    }

    public static void T08_hideAndShowElement() {
        executeJavaScript("console.log('Hello')");
    }


    public static void sizeInfoPanel(int size) {
        // проверка работы фильтра
        String xpath = "//div[@data-object='initiative']"; // список инициатив
        $(new By.ByCssSelector(""));

        String xpath2 = "//*[@text-anchor='start' and @font-weight='bold' and @aria-hidden='true']"; // колличество инициатив в информационной верхней понели числового значения списков
        try {
            ElementsCollection collect = $$(By.xpath(xpath));
            // хочу сделать через get
            ElementsCollection collect2 = $$(By.xpath(xpath2));
            assertTrue(collect.size() == collect2.size());
        } catch (AssertionError err) {
            TestHelper.assertScreen();
            throw err;
        }
    }

    public static void testTabEquality() {//пример get
        ElementsCollection topCollect = $$(By.xpath("//th[text()='name']/ancestor::table[@class='b-mAppTable b-mAppBookparkon.fuel_types']//div[contains(@class, 'dataField')]"));
        ElementsCollection bottomCollect = $$(By.xpath("//th[text()='name']/ancestor::table[@class='b-mAppTable ']//div[contains(@class, 'dataField')]"));
        for (int i = 0; i < topCollect.size(); i++) {
            topCollect.get(i).click();
//            String elem = topCollect.get(i).getValue();
            try {
                sleep(300);
                assertEquals(topCollect.get(i).getText(), bottomCollect.get(1).getText());
            } catch (AssertionError err) {
                TestHelper.assertScreen();
                throw err;
            }

        }
    }

    public static void sizeInfoPanelTest(String form, String str) throws IOException {
//        альтернатива
        String timeNameVar = "Инициатива №" + String.valueOf(System.currentTimeMillis());
        switch (str) {
//                Два массива для инициатив каждой из улицы чтобы после проверки инициатив, если что то пойдет не так, все равно был свободный массив
            case "Инициатива":
                //               listOfAllInitiatives.add(timeNameVar);
                break;
            case "Корректировка":
//                listlistOfAllAdjustment.add(timeNameVar);
                break;
            case "Согласование":
//                listOfAllHarmonization.add(timeNameVar);
                break;
            case "Утвержденные":
//                listOfAllApproved.add(timeNameVar);
                break;
            case "Реализация":
//                listOfAllImplementation.add(timeNameVar);
                break;

        }
        FillUtil.workDescription(form, timeNameVar);
    }

//    public static String fillReconciliationDate() {
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy");
//        Date date = new Date();
//        String StringDate = simpleDateFormat.format(date);
//        return StringDate;
//    }

    public static void clickLastCheckBox(String step, String checkName) {
        //Кликает выбранный чексбокс в последнем созданном документе
        //step - номер шага: 0-Инициатива, 1-Корректировка, 2-Согласование, 3-Утвержденние, 5-Реализация
        //checkbox - имя самого чекбокса

        $(By.xpath("//div[@class='b-checkbox-task__checkbox i-bem b-checkbox-task__checkbox_js_inited b-checkbox-task__checkbox_state-" + step + "']/ancestor::li/span[text()= '" + checkName + "']")).shouldHave();
        $$(By.xpath("//span[text()='" + checkName + "']/ancestor::li[@class='b-checkbox-task i-bem b-checkbox-task_js_inited b-checkbox-task_state-none']/div[@class='b-checkbox-task__checkbox i-bem b-checkbox-task__checkbox_js_inited b-checkbox-task__checkbox_state-0']")).last().click();
    }

    public static void dragAndDrop(String idDrag, String idDrop) throws AWTException {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_F11);
        sleep(2000);
        WebElement x1 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" +idDrag + "\"}}']/div/div[@data-bem]/div[last()]/div[2]"));
        WebElement x2 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" +idDrop + "\"}}']/div/div[@data-bem]/div[last()]/div[2]"));
//        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()-2]")).click();
//        sleep(1500);
//        actions().sendKeys(Keys.ESCAPE).build().perform();
//        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()]")).click();
//        sleep(1000);
//        actions().sendKeys(Keys.ESCAPE).build().perform();
//        sleep(2000);
//        Point X = x1.findElement(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()]/div[1]")).getLocation();
//        Point Y = x2.findElement(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()]")).getLocation();
//        sleep(1000);
//        robot.mouseMove(X.getX() + 60, Y.getY() + 250);
//        robot.mousePress(MouseEvent.BUTTON1_MASK);
//        robot.setAutoDelay(1000);
//        robot.mouseMove(X.getX() + 325, Y.getY() - 1);
//        robot.setAutoDelay(1000);
//        robot.mouseMove(X.getX() + 350, Y.getY() + 250);
//       robot.mouseMove(X.getX()+350, Y.getY()+250);
//        robot.setAutoDelay(1000);
//        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
//        robot.waitForIdle();
        actions().click(x1).click(x2).perform();
        robot.setAutoDelay(1500);
        try { $(By.xpath("//div[@class='b-block modal-dialog i-bem b-block_js_inited']//button[@aria-hidden='true']")).click();
        } catch (Error e){}

        $(By.xpath(".//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div[@data-bem]/div[last()]/div[2]")).click();
        robot.setAutoDelay(1500);
        try { $(By.xpath("//div[@class='b-block modal-dialog i-bem b-block_js_inited']//button[@aria-hidden='true']")).click();
        } catch (Error e){}

        Dimension fromSize = x1.getSize();
        Dimension toSize = x2.getSize();
        int xCentreFrom = fromSize.width / 2;
        int yCentreFrom = fromSize.height / 2;
        int xCentreTo = toSize.width / 2;
        int yCentreTo = toSize.height / 2;
        Point fromLocation  = x1.getLocation();
        Point toLocation = x2.getLocation();
        toLocation.x += xCentreTo;
        toLocation.y += yCentreTo;
        fromLocation.x += xCentreFrom;
        fromLocation.y += yCentreFrom;
        robot.mouseMove(fromLocation.x, fromLocation.y);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.setAutoDelay(1000);
        robot.mouseMove(((toLocation.x - fromLocation.x)/2)+fromLocation.x,((toLocation.y - fromLocation.y)/2)+fromLocation.y);
        robot.mouseMove(toLocation.x,toLocation.y);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
        robot.setAutoDelay(1000);
    }

    public static void dragAndDropPackage(String idDrag, String idDrop) throws AWTException {
        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_F11);
        sleep(2000);
        WebElement x1 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()-2]"));
        WebElement x2 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div[3]/div[last()-2]"));

        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()-2]")).click();
        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div[3]/div[last()-2]")).click();
        Dimension fromSize = x1.getSize();
        Dimension toSize = x2.getSize();
        int xCentreFrom = fromSize.width / 2;
        int yCentreFrom = fromSize.height / 2;
        int xCentreTo = toSize.width / 2;
        int yCentreTo = toSize.height / 2;
        Point fromLocation  = x1.getLocation();
        Point toLocation = x2.getLocation();
        toLocation.x += xCentreTo;
        toLocation.y += yCentreTo;
        fromLocation.x += xCentreFrom;
        fromLocation.y += yCentreFrom;
        robot.mouseMove(fromLocation.x, fromLocation.y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.setAutoDelay(1000);
        robot.mouseMove(((toLocation.x - fromLocation.x)/2)+fromLocation.x,((toLocation.y - fromLocation.y)/2)+fromLocation.y);
        robot.mouseMove(toLocation.x,toLocation.y);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.setAutoDelay(1000);
    }

    public static void downDragAndDropPackage(String idDrag, String idDrop, String point) throws AWTException {
        sleep(2000);
        WebElement x1 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()]"));
        WebElement x2 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()]"));
        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()-2]")).click();
        sleep(1500);
        actions().sendKeys(Keys.ESCAPE).build().perform();
        //td[@data-bem='{"c-kanban__column":{"kot_id":"4"}}']/div/div/div[last()]
        sleep(1000);
        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()-2]")).click();
        sleep(1000);
        actions().sendKeys(Keys.ESCAPE).build().perform();
        sleep(2000);
        Point X = x1.findElement(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()]")).getLocation();
        Point Y = x2.findElement(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()]")).getLocation();
        sleep(1000);
        Robot robot = new Robot();
        // координаты: берёт элемент
        robot.mouseMove(X.getX() + 60, Y.getY() + 205);
        //robot.mouseMove(X.getX()+60, Y.getY()+205);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.setAutoDelay(1000);
        switch (point) {
            case "на 4 шага":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.mouseMove(X.getX() - 1000, Y.getY() + 150);

                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            case "на 3 шага":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.mouseMove(X.getX() - 690, Y.getY() + 50);

                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            case "на 2 шага":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.mouseMove(X.getX() - 450, Y.getY() + 190);

                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            case "на 1 шаг":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.mouseMove(X.getX() - 250, Y.getY() + 150);


                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            default:
        }
        robot.setAutoDelay(1000);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
        robot.waitForIdle();
        sleep(2000);

    }

    public static void downDragAndDrop(String idDrag, String idDrop, String point) throws AWTException {
        sleep(2000);
        WebElement x1 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()]"));
        WebElement x2 = $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()]"));
        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()]")).click();
        sleep(1500);
        actions().sendKeys(Keys.ESCAPE).build().perform();
        //td[@data-bem='{"c-kanban__column":{"kot_id":"4"}}']/div/div/div[last()]
        sleep(1000);
        $(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()]")).click();
        sleep(1000);
        actions().sendKeys(Keys.ESCAPE).build().perform();
        sleep(2000);
        Point X = x1.findElement(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrag + "\"}}']/div/div/div[last()]")).getLocation();
        Point Y = x2.findElement(By.xpath("//td[@data-bem='{\"c-kanban__column\":{\"kot_id\":\"" + idDrop + "\"}}']/div/div/div[last()]")).getLocation();
        sleep(1000);
        Robot robot = new Robot();
        // координаты: берёт элемент
        robot.mouseMove(X.getX() + 60, Y.getY() + 205);
        //robot.mouseMove(X.getX()+60, Y.getY()+205);
        robot.mousePress(MouseEvent.BUTTON1_MASK);
        robot.setAutoDelay(1000);
        switch (point) {
            case "на 4 шага":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 1000, Y.getY() + 150);

                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            case "на 3 шага":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 690, Y.getY() + 150);

                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            case "на 2 шага":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 450, Y.getY() + 150);

                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            case "на 1 шаг":
//                robot.mouseMove(X.getX()-900, Y.getY()+150);

                robot.mouseMove(X.getX() - 680, Y.getY() - 1);
                robot.setAutoDelay(1000);
                // координаты: куда переносит элемент
                robot.mouseMove(X.getX() - 250, Y.getY() + 150);

                //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
                //robot.mouseMove(X.getX()-250, Y.getY()+150);
                robot.setAutoDelay(1000);
                robot.mouseRelease(MouseEvent.BUTTON1_MASK);
                robot.waitForIdle();
                sleep(2000);
                break;

            default:
        }
//        robot.mouseMove(X.getX()-325, Y.getY()-1);
//        robot.setAutoDelay(1000);
//        // координаты: куда переносит элемент
//        robot.mouseMove(X.getX()-690, Y.getY()+150);
//
        //robot.mouseMove(X.getX()-690, Y.getY()+150); - из реализации в корректировку
        //robot.mouseMove(X.getX()-250, Y.getY()+150);
        robot.setAutoDelay(1000);
        robot.mouseRelease(MouseEvent.BUTTON1_MASK);
        robot.waitForIdle();
        sleep(2000);
//        x1.dragAndDropTo("#kot_id_2 > div > div.c-button-new > button");
    }

    public static void testOpenWindows(String nameWin) throws IOException {
        try {
            $(By.xpath("//form[@action='/initiative-create']//div[text()='" + nameWin + "']")).should(visible);
            LoggNotError("Открылось форма '" + nameWin + "' после клика на кнопку");
        } catch (Error e) {
            Logg("Не открылось окно '" + nameWin + "' после клика на кнопку ");
        }
    }


    public static void testCloseWindowCreatInit(String nameWin) throws IOException {
        try {
            $(By.xpath("//form[@action='/initiative-create']//div[text()='" + nameWin + "']")).shouldNot(visible);
            LoggNotError("Закрылась форма '" + nameWin + "' после клика на кнопку");
        } catch (Error e) {
            Logg("Не закрылось окно '" + nameWin + "' после клика на кнопку ");
        }

    }


    public static void testOpenWindowReq(String nameWin) throws IOException {
        try {
            $(By.xpath("//form[@action='/request-create']//h3[text()='" + nameWin + "']")).should(Condition.exist);
            LoggNotError("Открылось форма '" + nameWin + "'");
        } catch (Error e) {
            Logg("Не открылось форма '" + nameWin + "' после клика на кнопку / Не открылось форма '" + nameWin + "' после перемещения");
        }
    }

    public static void testCloseWindowCreatReq(String nameWin) throws IOException {
        try {
            $(By.xpath("//form[@action='/request-create']//h3[text()='" + nameWin + "']")).waitUntil(not(visible), 10000);
            LoggNotError("Закрылось форма '" + nameWin + "' после клика на кнопку");
        } catch (Error e) {
            Logg("Не закрылось форма '" + nameWin + "' после клика на кнопку");
        }
    }

    public static void testOpenWindowsDnd(String nameWin) {

        if ($(By.xpath("//form/div/div/h3[text()='" + nameWin + "'] | //form/div/div[text()='" + nameWin + "']")).exists()) {
            $(By.xpath("//form/div/div/h3[text()='" + nameWin + "'] | //form/div/div[text()='" + nameWin + "']")).should(Condition.exist);
        } else {
            Logg("Не открылось окно '" + nameWin + "' после перетаскивания");
        }
    }

    public static void printReport(String trueXpath, String textReport) {
        try {
            $(By.xpath("" + trueXpath + "")).shouldHave();
        } catch (Error e) {
            assertScreen();
            Logg("" + textReport + "");
        }
    }

    public static void random(int random) {
        Random r = new Random();
        int Low = 10;
        int High = 10000;
        int Result = r.nextInt(High - Low) + Low;
        random = Result;
    }

    public static void nameDocument() throws AWTException, IOException {
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        $(By.xpath("//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited c-process-card_focused']")).doubleClick();
        sleep(1000);
        actions().sendKeys(Keys.ESCAPE).build().perform();
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
//        String nameDoc = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']")).getText();
    }

    public static void namePackage() throws AWTException, IOException {
        WebElement text1 = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']"));
        $(By.xpath("//div[@class='c-process-card drag-drop i-bem c-process-card_js_inited c-process-card_focused']")).doubleClick();
        cWork = text1.getText();
        ButtonsUtil.clickSpanButton("Отмена");
//        String nameDoc = $(By.xpath("//label[text()='Содержание работ']/ancestor::div[1]/div[@class='b-flex-row i-bem b-flex-row_js_inited']")).getText();
    }


    //бесконечный цикл. вводим улицу до тех пор, пока не появится список улиц
    public static void RandomString() throws IOException {
        for (; ; ) {
            String[] oneList = {"б", "в", "г", "д", "ж", "з", "к", "л", "м", "н", "п", "р", "с", "т"};
            String[] twoList = {"а", "е", "и", "о", "у", "я"};
            int ranPos = (int) (Math.random() * oneList.length);
            int ranPos1 = (int) (Math.random() * twoList.length);
            String RanStr = oneList[ranPos];
            String RanStr1 = twoList[ranPos1];
            WebElement street = $(By.xpath("//label[text()='Улица']/..//input[@class='b-combobox__input b-input form-control checkInput i-bem b-combobox__input_js_inited']"));
            sleep(3000);
            try {
                actions().click(street).sendKeys(RanStr, RanStr1).perform();
                $(By.xpath("//label[text()='Улица']/..//ul[@class='b-combobox__list dropdown-menu i-bem b-combobox__list_js_inited']")).should(visible);
                LoggerConsole.LoggNotError("Произошло заполнение значения в поле 'Улица'");
                break;
            } catch (AssertionError err) {
                $(By.xpath("//label[text()='Улица']/..//input[@class='b-combobox__input b-input form-control checkInput i-bem b-combobox__input_js_inited']")).click();
                actions().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
                actions().sendKeys(Keys.DELETE).build().perform();
            }
        }
    }

    public static void errorCrarh() {
        try {
            $(By.xpath("//form//div[@class='messenger error'] | //div[@class='messenger error']")).should(disappear);
        } catch (Error e) {
            $(By.xpath("//form//div[@class='messenger error'] | //div[@class='messenger error']")).waitUntil(Condition.visible, 2000);
            Logg("Выводится строка ошибки");
        }
    }

    //проверка на колличество чек-боксов

}

