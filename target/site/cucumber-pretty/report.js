$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("stage#1.feature");
formatter.feature({
  "line": 3,
  "name": "stage#1",
  "description": "",
  "id": "stage#1",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@stage#1"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "Авторизация",
  "description": "",
  "id": "stage#1;авторизация",
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
  "duration": 271612276,
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
