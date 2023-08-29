-- --------------------------------------------------------

--
-- Тестовые данные для таблицы Banks
--
REPLACE INTO banks VALUES (1, 'Сбербанк', '045004641', 'https://sberbank.ru');
REPLACE INTO banks VALUES (2, 'ВТБ', '045004788', 'https://vtb.ru');
REPLACE INTO banks VALUES (3, 'Тинькофф', '044525974', 'https://tinkoff.ru');

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
-- В Сбере отношение рубля к юаню - 0,08, лимиты до миллиона
REPLACE INTO rates VALUES (11, 1, 3, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 0.08);
REPLACE INTO rates VALUES (12, 1, 3, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 0.07);
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
-- В ВТБ отношение рубля к юаню - 0,09, лимиты до миллиона
REPLACE INTO rates VALUES (23, 2, 3, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 0.09);
REPLACE INTO rates VALUES (24, 2, 3, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 0.08);
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
-- В Тинькофф отношение рубля к юаню - 0,08, лимиты до миллиона
REPLACE INTO rates VALUES (35, 3, 3, 4, CURRENT_TIMESTAMP(), true, 999999, 999999, 0.08);
REPLACE INTO rates VALUES (36, 3, 3, 4, CURRENT_TIMESTAMP(), false, 999999, 999999, 0.08);