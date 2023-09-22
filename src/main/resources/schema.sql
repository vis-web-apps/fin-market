CREATE TABLE IF NOT EXISTS role (
                                    id int(11) NOT NULL IDENTITY PRIMARY KEY,
                                    name varchar(10) NOT NULL
);

CREATE TABLE IF NOT EXISTS users (
                                     id int(11) NOT NULL IDENTITY PRIMARY KEY,
                                     login varchar(20) NOT NULL,
                                     password varchar(100) NOT NULL,
                                     email varchar(30) NOT NULL,
                                     phone varchar(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS user_role (
                                         user_id int(11) NOT NULL,
                                         role_id int(11) NOT NULL,
                                         foreign key (user_id) references users(id),
                                         foreign key (role_id) references role(id),
                                         primary key (user_id, role_id)
);

CREATE TABLE IF NOT EXISTS banks (
                    id int(11) NOT NULL IDENTITY PRIMARY KEY,
                    name varchar(30) NOT NULL UNIQUE,
                    bic varchar(9) NOT NULL UNIQUE,
                    web_site varchar(30)
);

CREATE TABLE IF NOT EXISTS currencies (
                     id int(11) NOT NULL IDENTITY PRIMARY KEY,
                     iso_dig int(3),
                     iso_lat3 varchar(3),
                     name_rus varchar(30)
);

CREATE TABLE IF NOT EXISTS rates (
                     id int(11) NOT NULL IDENTITY PRIMARY KEY,
                     bank_id int(11) NOT NULL,
                     b_cur_id int(11) NOT NULL,
                     q_cur_id int(11) NOT NULL,
                     start_date_time timestamp NOT NULL,
                     is_buy_rate boolean default false,
                     limit_from decimal(10,2),
                     limit_to decimal(10,2),
                     rate decimal(10,2) NOT NULL,
                     foreign key (bank_id) references banks(id) ON DELETE CASCADE,
                     foreign key (b_cur_id) references currencies(id) ON DELETE CASCADE,
                     foreign key (q_cur_id) references currencies(id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS savings_products (
                    id int(11) NOT NULL IDENTITY PRIMARY KEY,
                    bank_id int(11) NOT NULL,
                    name varchar(50) NOT NULL,
                    rate decimal(10,2),
                    sum decimal(10,2),
                    cur_id  int(11) NOT NULL,
                    promo_info text,
                    foreign key (bank_id) references banks(id) ON DELETE CASCADE,
                    foreign key (cur_id) references currencies(id) ON DELETE CASCADE,
);

CREATE TABLE IF NOT EXISTS promo (
                     id int(11) NOT NULL IDENTITY PRIMARY KEY,
                     bank_id varchar(30) NOT NULL,
                     promo_text text NOT NULL,
                     promo_name varchar(30) NOT NULL,
                     foreign key (bank_id) references banks(id) ON DELETE CASCADE
);

