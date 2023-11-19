-- --------------------------------------------------------

--
-- Test data for table role
--

REPLACE INTO role VALUES (1, 'ROLE_ADMIN');

-- --------------------------------------------------------

--
-- Test data for table users
--

REPLACE INTO users VALUES (1, 'admin', '$2a$10$sr8g0Ty9X4E43nAvQxbC8O5lgwo8v/aIQ/kd1MXpwwin8sWWl4NsG', 'admin@mail.com', '253-00-90');

-- --------------------------------------------------------

--
-- Test data for table user_role
--

REPLACE INTO user_role VALUES (1, 1);

-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Banks
--
REPLACE INTO banks VALUES (1, 'Сбербанк', '045004641', 'https://sberbank.ru');
REPLACE INTO banks VALUES (2, 'ВТБ', '045004788', 'https://vtb.ru');
REPLACE INTO banks VALUES (3, 'Тинькофф', '044525974', 'https://tinkoff.ru');
REPLACE INTO banks VALUES (4, 'Альфа', '044525593', 'https://alfabank.ru');

-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Branches
--
REPLACE INTO branches VALUES (1, 1, 'Отделение 8080', '100100100', '196135, Санкт-Петербург Московский пр., д.198, лит. А', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');
REPLACE INTO branches VALUES (2, 1, 'Отделение 8081', '100100101', '196136, Санкт-Петербург Московский пр., д.200, лит. Б', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');
REPLACE INTO branches VALUES (3, 2, 'Отделение 5800', '100100102', '196111, Санкт-Петербург Московский пр., д.1', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');
REPLACE INTO branches VALUES (4, 2, 'Отделение 5800', '100100103', '196112, Санкт-Петербург Московский пр., д.2', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');
REPLACE INTO branches VALUES (5, 3, 'Отделение 6680', '100100104', '196113, Санкт-Петербург Московский пр., д.5', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');
REPLACE INTO branches VALUES (6, 3, 'Отделение 6680', '100100105', '196114, Санкт-Петербург Московский пр., д.6', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');
REPLACE INTO branches VALUES (7, 4, 'Отделение 7080', '100100106', '196115, Санкт-Петербург Московский пр., д.7', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');
REPLACE INTO branches VALUES (7, 4, 'Отделение 7080', '100100107', '196116, Санкт-Петербург Московский пр., д.8', 'Будни: с 11:00 до 19:00 Суббота: с 11:00 до 16:00 Воскресенье:Выходной', '8 800 500 80 88', 'client@bankorange.ru');

-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Currencies
--
REPLACE INTO currencies VALUES (1, '978', 'EUR', 'Евро');
REPLACE INTO currencies VALUES (2, '840', 'USD', 'Доллар США');
REPLACE INTO currencies VALUES (3, '643', 'RUB', 'Российский рубль');
REPLACE INTO currencies VALUES (4, '156', 'CNY', 'Китайский юань');

-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Rates
--
-- В Сбере отношение евро к доллару - 1.01, лимиты до миллиона
REPLACE INTO rates VALUES (1, 1, 1, 2, CURRENT_TIMESTAMP(), true, 999999, 999999, 1.01);
REPLACE INTO rates VALUES (2, 1, 1, 2, CURRENT_TIMESTAMP(), false, 999999, 999999, 0.88);
-- В Сбере отношение евро к рублю - 104.6, лимиты до миллиона
REPLACE INTO rates VALUES (3, 1, 1, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 104.6);
REPLACE INTO rates VALUES (4, 1, 1, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 99.6);
-- В Сбере отношение евро к юаню - 8.05, лимиты до миллиона
REPLACE INTO rates VALUES (5, 1, 1, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 8.05);
REPLACE INTO rates VALUES (6, 1, 1, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 7.54);
-- В Сбере отношение доллара к рублю - 98.90, лимиты до миллиона
REPLACE INTO rates VALUES (7, 1, 2, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 98.90);
REPLACE INTO rates VALUES (8, 1, 2, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 92.20);
-- В Сбере отношение доллара к юаню - 7.61, лимиты до миллиона
REPLACE INTO rates VALUES (9, 1, 2, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 7.61);
REPLACE INTO rates VALUES (10, 1, 2, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 6.98);
-- В Сбере отношение юаня к рублю - 13,15, лимиты до миллиона
REPLACE INTO rates VALUES (11, 1, 4, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 13.15);
REPLACE INTO rates VALUES (12, 1, 4, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 12.80);
---
-- В ВТБ отношение евро к доллару - 1.02, лимиты до миллиона
REPLACE INTO rates VALUES (13, 2, 1, 2, CURRENT_TIMESTAMP(), true, 999999, 999999, 1.02);
REPLACE INTO rates VALUES (14, 2, 1, 2, CURRENT_TIMESTAMP(), false, 999999, 999999, 0.89);
-- В ВТБ отношение евро к рублю - 104.7, лимиты до миллиона
REPLACE INTO rates VALUES (15, 2, 1, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 104.7);
REPLACE INTO rates VALUES (16, 2, 1, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 99.7);
-- В ВТБ отношение евро к юаню - 8.06, лимиты до миллиона
REPLACE INTO rates VALUES (17, 2, 1, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 8.06);
REPLACE INTO rates VALUES (18, 2, 1, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 7.55);
-- В ВТБ отношение доллара к рублю - 98.99, лимиты до миллиона
REPLACE INTO rates VALUES (19, 2, 2, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 98.99);
REPLACE INTO rates VALUES (20, 2, 2, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 92.29);
-- В ВТБ отношение доллара к юаню - 7.66, лимиты до миллиона
REPLACE INTO rates VALUES (21, 2, 2, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 7.66);
REPLACE INTO rates VALUES (22, 2, 2, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 7.03);
-- В ВТБ отношение юаня к рублю - 13,25, лимиты до миллиона
REPLACE INTO rates VALUES (23, 2, 4, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 13.25);
REPLACE INTO rates VALUES (24, 2, 4, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 12.85);
---
-- В Тинькофф отношение евро к доллару - 1.11, лимиты до миллиона
REPLACE INTO rates VALUES (25, 3, 1, 2, CURRENT_TIMESTAMP(), true, 999999, 999999, 1.11);
REPLACE INTO rates VALUES (26, 3, 1, 2, CURRENT_TIMESTAMP(), false, 999999, 999999, 0.98);
-- В Тинькофф отношение евро к рублю - 104.1, лимиты до миллиона
REPLACE INTO rates VALUES (27, 3, 1, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 104.1);
REPLACE INTO rates VALUES (28, 3, 1, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 99.1);
-- В Тинькофф отношение евро к юаню - 8.12, лимиты до миллиона
REPLACE INTO rates VALUES (29, 3, 1, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 8.12);
REPLACE INTO rates VALUES (30, 3, 1, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 7.66);
-- В Тинькофф отношение доллара к рублю - 98.95, лимиты до миллиона
REPLACE INTO rates VALUES (31, 3, 2, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 98.95);
REPLACE INTO rates VALUES (32, 3, 2, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 92.25);
-- В Тинькофф отношение доллара к юаню - 7.67, лимиты до миллиона
REPLACE INTO rates VALUES (33, 3, 2, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 7.67);
REPLACE INTO rates VALUES (34, 3, 2, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 7.11);
-- В Тинькофф отношение юаня к рублю - 13,45, лимиты до миллиона
REPLACE INTO rates VALUES (35, 3, 4, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 13.45);
REPLACE INTO rates VALUES (36, 3, 4, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 13.00);
---
-- В Альфа отношение евро к доллару - 1.20, лимиты до миллиона
REPLACE INTO rates VALUES (37, 4, 1, 2, CURRENT_TIMESTAMP(), true, 999999, 999999, 1.20);
REPLACE INTO rates VALUES (38, 4, 1, 2, CURRENT_TIMESTAMP(), false, 999999, 999999, 1.08);
-- В Альфа отношение евро к рублю - 105.1, лимиты до миллиона
REPLACE INTO rates VALUES (39, 4, 1, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 105.1);
REPLACE INTO rates VALUES (40, 4, 1, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 101.1);
-- В Альфа отношение евро к юаню - 8.01, лимиты до миллиона
REPLACE INTO rates VALUES (41, 4, 1, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 8.01);
REPLACE INTO rates VALUES (42, 4, 1, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 7.76);
-- В Альфа отношение доллара к рублю - 99.55, лимиты до миллиона
REPLACE INTO rates VALUES (43, 4, 2, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 99.55);
REPLACE INTO rates VALUES (44, 4, 2, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 93.85);
-- В Альфа отношение доллара к юаню - 7.87, лимиты до миллиона
REPLACE INTO rates VALUES (45, 4, 2, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 7.87);
REPLACE INTO rates VALUES (46, 4, 2, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 7.31);
-- В Альфа отношение юаня к рублю - 13,15, лимиты до миллиона
REPLACE INTO rates VALUES (47, 4, 4, 3, CURRENT_TIMESTAMP(), true, 999999, 999999, 13.15);
REPLACE INTO rates VALUES (48, 4, 4, 3, CURRENT_TIMESTAMP(), false, 999999, 999999, 12.90);

-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Savings_products
--
REPLACE INTO savings_products VALUES (1, 1, 'СБЕРегательный', 11.0, 1100000.00, 3, 'Сбер накопит лучше Вас!');
REPLACE INTO savings_products VALUES (2, 2, 'Вклад под 12%', 12.0, 1200000.00, 3, 'ВТБ накопит лучше Вас!');
REPLACE INTO savings_products VALUES (3, 3, 'Студенческий', 10.0, 200000.00, 3, 'Выгодные условия для студентов');
REPLACE INTO savings_products VALUES (4, 1, 'Валютный (USD)', 8.0, 10000.00, 2, 'Накопим баксов');
REPLACE INTO savings_products VALUES (5, 1, 'Валютный (EUR)', 8.0, 10000.00, 1, 'Подкопи и в Европу рвани!');
REPLACE INTO savings_products VALUES (6, 3, 'Выгодный', 13.0, 100000.00, 3, 'Тинькофф накопит лучше Вас!');

-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Cards_products
--
REPLACE INTO cards_products VALUES (1, 1, 'МиРРрр', false, false, true, false, 'https://sberbank.ru');
REPLACE INTO cards_products VALUES (2, 2, 'Карта', true, false, true, false, 'https://vtb.ru');
REPLACE INTO cards_products VALUES (3, 3, 'Студенческая', true, false, true, true, 'https://tinkoff.ru');
REPLACE INTO cards_products VALUES (4, 4, 'Мастер кард', true, false, true, false, 'https://alfabank.ru');
REPLACE INTO cards_products VALUES (5, 3, 'МИР Привилегия', true, false, true, false, 'https://tinkoff.ru');
REPLACE INTO cards_products VALUES (6, 3, 'МИР Привилегия +', true, false, true, false, 'https://tinkoff.ru');

-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Cards_products
--
REPLACE INTO promo VALUES (1, 1, 'Обезопасьте средства на счетах. Оформите
страховую программу «Защита счета»<br>
<ul>
<li>Защита от несанкционированного
списания средств, в том числе с
использованием ПИН-кода держателя
карты</li>
<li>Защита от хищения средств, полученных в
банкомате в результате разбоя, грабежа,
кражи</li>
<li>Страховое покрытие – на сумму 350 000
рублей. Действует по всему миру в течение
1 года</li>
<li>Стоимость страхования – 2 500 рублей в год</li></ul>', 'Защита банковского счета');

REPLACE INTO promo VALUES (2, 2, '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Получите первое зачисление заработной платы в период
с 1 января по 31 мая 2024 года и присоединитесь к программе лояльности «Мультибонус».<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Далее в течение трех месяцев подряд после получения первой заработной платы, при условии
совершения покупок на общую сумму от 20 тыс. рублей ежемесячно для карт в пакете «Мультикарта»
и 50 тыс. рублей ежемесячно для карт в пакете услуг «Привилегия-Мультикарта» и «Прайм», держателю
карты будет начислено двойное вознаграждение в размере 4% от суммы покупок в категориях «Супермаркеты
и доставка продуктов», «Кафе, рестораны, доставка еды, фастфуд», «Транспорт и такси», «Аптеки».<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;За покупки у партнеров банка можно получить до 50% кэшбэка.<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Обслуживание карты полностью бесплатное. Банк предоставляет возможность снимать наличные в сумме до 50 тыс.
рублей в месяц без комиссии в банкоматах сторонних банков.<br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Подробнее на сайте: <a href="https://www.vtb.ru/personal/karty/programma-loyalnosti/">https://www.vtb.ru/personal/karty/programma-loyalnosti/</a>', 'Двойной кэшбэк');

REPLACE INTO promo VALUES (3, 3, '&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;С 9 по 14 июня 2024 года в рамках акции "День России" в банке "Абсолют"
действует скидка 0,25 п.п. от действующей ставки. Акция распространяется на все ипотечные программы банка
кроме адресных предложений, не суммируется со скидкой при покупке недвижимости у действующего ипотечного заемщика банка.<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;С учетом скидки ставка по программе для сотрудников ИТ-компаний составит всего 4,25%, по "Семейной ипотеке"
- 5,74%, по Госпрограмме 2020-2023 - 7,1%, по собственным программам банка на покупку первичной и вторичной
недвижимости, в том числе коммерческой ипотеки и апартаментов, - от 10,79%.<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Остальные условия сохраняются. Минимальный первоначальный взнос -  10%. Возможно использование средств
материнского капитала на частичную оплату первоначального взноса. Срок кредитования - до 30 лет. Сумма кредитования - до
20 млн рублей по собственным программам банка, до 12 млн рублей в Москве и Санкт-Петербурге и 6 млн рублей в остальных
регионах по "Семейной ипотеке" и "Госпрограмме 2020-2024", до 18 млн рублей по ипотеке для ИТ-специалистов. Основной
заемщик может привлечь дополнительно до 3 созаемщиков.<br><br>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Для получения скидки необходимо в период действия специального предложения выйти на сделку и подписать кредитный
договор. Время рассмотрения заявки на кредит - от 20 минут. Выйти на ипотечную сделку при наличии готового
пакета документов можно в течение суток, а подать заявку на ипотеку – в офисе банка, партнеров или на сайте банка.', 'День России');