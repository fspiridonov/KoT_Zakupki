@stage#1_6Check-Boxes

Feature: stage#1_6Check-Boxes

#  Scenario: Авторизация
#    When вводим логин "mnn"
#    And вводим пароль "1qaz@WSX"

  Scenario: Тестовый прогон

#    When Клик на чек-бокс "Присвоить код КПГЗ"
    When Клик на чек-бокс
    When Клик на кнопкку 'Заполнить КПГЗ'
    When Заполняет поле 'Код КПГЗ'
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Отправить на согласование'
#    When Заполняет поле комментария
    When Прикрепление нередактируемых файлов
#    When Прикрепление редактируемых файлов
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Согласовать'
    When Прикрепление нередактируемых файлов
#    When Прикрепление редактируемых файлов
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Загрузить ТЗ'
#    When Заполняет поле комментария
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Загрузить ТЗ'
    When Прикрепление нередактируемых файлов 'Формирование ТЗ'
#    When Прикрепление редактируемых файлов 'Формирование ТЗ'
#    When Заполняет поле комментария
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Загрузить рассчет НМЦК'
#    When Заполняет поле комментария
    When Прикрепление нередактируемых файлов 'Расчет НМЦК'
#    When Прикрепление редактируемых файлов 'Расчет НМЦК'
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Согласовать'
#    When Заполняет поле комментария
    When Прикрепление нередактируемых файлов 'Ценовая комиссия'
#    When Прикрепление редактируемых файлов 'Ценовая комиссия'
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Согласовать'
#    When Заполняет поле комментария
    When Прикрепление нередактируемых файлов 'Заявка на всключение в ПЗ и ПГ'
#    When Прикрепление редактируемых файлов 'Заявка на всключение в ПЗ и ПГ'
    When Клик на кнопку 'Подтвердить'

    When Клик на чек-бокс
    When Клик на кнопку 'Согласовать'
#    When Заполняет поле комментария
    When Прикрепление нередактируемых файлов 'Проект контракта'
#    When Прикрепление редактируемых файлов 'Проект контракта'
    When Клик на кнопку 'Подтвердить'



