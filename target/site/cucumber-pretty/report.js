$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stage#1Check-Boxes.feature");
formatter.feature({
  "line": 3,
  "name": "stage#1Check-Boxes",
  "description": "",
  "id": "stage#1check-boxes",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@stage#1Check-Boxes"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Авторизация",
  "description": "",
  "id": "stage#1check-boxes;авторизация",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "вводим логин \"mnn\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "вводим пароль \"1qaz@WSX\"",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "mnn",
      "offset": 14
    }
  ],
  "location": "TestAutorizationPage.loginL(String)"
});
formatter.result({
  "duration": 1409876871,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1qaz@WSX",
      "offset": 15
    }
  ],
  "location": "TestAutorizationPage.loginP(String)"
});
formatter.result({
  "duration": 7911721656,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Тестовый прогон",
  "description": "",
  "id": "stage#1check-boxes;тестовый-прогон",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 11,
      "value": "#    When Клик на чек-бокс \"Присвоить код КПГЗ\""
    },
    {
      "line": 12,
      "value": "#    When Клик на кнопкку \u0027Заполнить КПГЗ\u0027"
    },
    {
      "line": 13,
      "value": "#    When Заполняет поле \u0027Код КПГЗ\u0027"
    },
    {
      "line": 14,
      "value": "#    When Клик на кнопку \u0027Подтвердить\u0027"
    }
  ],
  "line": 16,
  "name": "Клик на чек-бокс \"Создание закупки и согласование с директором\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "Клик на кнопку \u0027Отправить на согласование\u0027",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 18,
      "value": "#    When Заполняет поле комментария"
    }
  ],
  "line": 19,
  "name": "Прикрепление нередактируемых файлов",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "Прикрепление редактируемых файлов",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "Клик на чек-бокс \"Создание закупки и согласование с директором\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Клик на кнопку \u0027Согласовать\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Прикрепление нередактируемых файлов",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Прикрепление редактируемых файлов",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "Клик на чек-бокс \"Формирование ТЗ\"",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Клик на кнопку \u0027Загрузить ТЗ\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "Заполняет поле комментария",
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 32,
  "name": "Клик на чек-бокс \"Формирование ТЗ\"",
  "keyword": "When "
});
formatter.step({
  "line": 33,
  "name": "Клик на кнопку \u0027Загрузить ТЗ\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "Прикрепление нередактируемых файлов \u0027Формирование ТЗ\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "Прикрепление редактируемых файлов \u0027Формирование ТЗ\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 36,
  "name": "Заполняет поле комментария",
  "keyword": "When "
});
formatter.step({
  "line": 37,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 39,
  "name": "Клик на чек-бокс \"Расчет НМЦК (метод составления смет)\"",
  "keyword": "When "
});
formatter.step({
  "line": 40,
  "name": "Клик на кнопку \u0027Загрузить рассчет НМЦК\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "Заполняет поле комментария",
  "keyword": "When "
});
formatter.step({
  "line": 42,
  "name": "Прикрепление нередактируемых файлов \u0027Расчет НМЦК\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "Прикрепление редактируемых файлов \u0027Расчет НМЦК\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 44,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 46,
  "name": "Клик на чек-бокс \"Ценовая комиссия\"",
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Клик на кнопку \u0027Согласовать\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 48,
  "name": "Заполняет поле комментария",
  "keyword": "When "
});
formatter.step({
  "line": 49,
  "name": "Прикрепление нередактируемых файлов \u0027Ценовая комиссия\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "Прикрепление редактируемых файлов \u0027Ценовая комиссия\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 51,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "Клик на чек-бокс \"Заявка на всключение в ПЗ и ПГ\"",
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Клик на кнопку \u0027Согласовать\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 55,
  "name": "Заполняет поле комментария",
  "keyword": "When "
});
formatter.step({
  "line": 56,
  "name": "Прикрепление нередактируемых файлов \u0027Заявка на всключение в ПЗ и ПГ\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 57,
  "name": "Прикрепление редактируемых файлов \u0027Заявка на всключение в ПЗ и ПГ\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 58,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 60,
  "name": "Клик на чек-бокс \"Проект контракта\"",
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Клик на кнопку \u0027Согласовать\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 62,
  "name": "Заполняет поле комментария",
  "keyword": "When "
});
formatter.step({
  "line": 63,
  "name": "Прикрепление нередактируемых файлов \u0027Проект контракта\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 64,
  "name": "Прикрепление редактируемых файлов \u0027Проект контракта\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 65,
  "name": "Клик на кнопку \u0027Подтвердить\u0027",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Создание закупки и согласование с директором",
      "offset": 18
    }
  ],
  "location": "TestCheck_boxes_1_Page.clickLast4KBox(String)"
});
formatter.result({
  "duration": 5951193096,
  "status": "passed"
});
formatter.match({
  "location": "TestCheck_boxes_1_Page.Send4approval()"
});
formatter.result({
  "duration": 1650912160,
  "status": "passed"
});
formatter.match({
  "location": "TestCheck_boxes_1_Page.LoadDontEditFile()"
});
formatter.result({
  "duration": 207314184,
  "status": "passed"
});
formatter.match({
  "location": "TestCheck_boxes_1_Page.LoadEditFile()"
});
formatter.result({
  "duration": 62802704,
  "status": "passed"
});
formatter.match({
  "location": "TestCheck_boxes_1_Page.ClickApprove()"
});
formatter.result({
  "duration": 48479159492,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Создание закупки и согласование с директором",
      "offset": 18
    }
  ],
  "location": "TestCheck_boxes_1_Page.clickLast4KBox(String)"
});
