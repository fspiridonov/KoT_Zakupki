@scenario#4_1

Feature: scenarion#4_1


  Scenario: Авторизация
    And вводим логин "test2"
    And  вводим пароль "123456"

  Scenario: Создание пакета
    When Создание нового пакета с помощью кнопки 'Создать пакет'

  Scenario:  Проверка чек-боксов созданного пакета
#    When проверка работы первых трёх чекбоксов этапа 'пакеты' при перенесённом запросе
#    When заполнение всех чекбоксов этапа реализации
    When входит в чек-бокс 'Дирекция ОДД после клика на кнопку Создать пакет
    When кликает на кнопку 'Не согласовано'
    When проверяет, что появилась в поле причины отказа появилась подсказка 'Необходимо ввести комментарий!'
    When logout

  Scenario: ▲▲▲▲▲▲▲ Последний шаг ▲▲▲▲▲▲▲
    When Stop test