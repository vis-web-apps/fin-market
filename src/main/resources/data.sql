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