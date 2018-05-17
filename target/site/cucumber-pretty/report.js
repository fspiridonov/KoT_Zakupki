$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stage#Edit.feature");
formatter.feature({
  "line": 3,
  "name": "stage#Edit",
  "description": "",
  "id": "stage#edit",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@stage#Edit"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Авторизация",
  "description": "",
  "id": "stage#edit;авторизация",
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
  "name": "вводим пароль \"1qaz@WS\"",
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
  "duration": 1260112935,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1qaz@WS",
      "offset": 15
    }
  ],
  "location": "TestAutorizationPage.loginP(String)"
});
formatter.result({
  "duration": 1273371868,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Тестовый прогон",
  "description": "",
  "id": "stage#edit;тестовый-прогон",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "Клик на последний элемент этапа \u0027Формирование комплекта документов\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "Клик на редактирование закупки",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Заполняет поле \u0027Сумма\u0027",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Клик на поле \u0027Статья\u0027",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 14,
      "value": "#    When Выбираем статью из выпадающего списка"
    },
    {
      "line": 15,
      "value": "#"
    },
    {
      "line": 16,
      "value": "#    When Заполняет второе поле \u0027Сумма\u0027 за следующий год"
    },
    {
      "line": 17,
      "value": "#    When Клик на второе поле \u0027Статья\u0027"
    },
    {
      "line": 18,
      "value": "#    When Выбираем статью из выпадающего списка второго"
    },
    {
      "line": 19,
      "value": "# Аукцион в электронной форме, Закупка малого объема, Запрос котировок, Запрос предложений, Контракт, залючаемый с ед. поставщиком, Открытый конкурс"
    }
  ],
  "line": 20,
  "name": "Клик на кнопку \u0027Сохранить \u0027",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 21,
      "value": "#    When проверяет, что редактируемые данные изменились"
    }
  ],
  "line": 22,
  "name": "Клик на второе редактирование закупки",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Заполняем поле Наименование",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "Заполняем поле Обоснование",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "Заполняем поле Ответственный",
  "keyword": "When "
});
formatter.step({
  "line": 26,
  "name": "Клик на поле Способ расчета НМЦК",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 27,
      "value": "#    When Выбирает Расчет НМЦК \"Затратный метод\" из выпадающего списка"
    }
  ],
  "line": 28,
  "name": "Клик на поле Тип закупки",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 29,
      "value": "#    When Выбираем Тип закупк \"Открытый конкурс\" из выпадающего списка"
    }
  ],
  "line": 30,
  "name": "Клик на поле закон",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 31,
      "value": "#    When Выбираем закон \"223 - ФЗ\" из выпадающего списка"
    }
  ],
  "line": 32,
  "name": "Клик на кнопку \u0027Сохранить \u0027",
  "keyword": "When "
});
formatter.match({
  "location": "TestRedactorPage.Rationale()"
});
formatter.result({
  "duration": 4631810088,
  "status": "passed"
});
formatter.match({
  "location": "TestRedactorPage.edit()"
});
formatter.result({
  "duration": 2718825209,
  "status": "passed"
});
formatter.match({
  "location": "TestRedactorPage.FillSumma()"
});
formatter.result({
  "duration": 24836205020,
  "status": "passed"
});
formatter.match({
  "location": "TestRedactorPage.clickArticle()"
});
formatter.result({
  "duration": 3137277719,
  "status": "passed"
});
formatter.match({
  "location": "TestRedactorPage.Seve()"
});
formatter.result({
  "duration": 2622146839,
  "status": "passed"
});
formatter.match({
  "location": "TestRedactorPage.edit2()"
});
