テーブル作成
CREATE TABLE items(
    id Integer PRIMARY KEY, 
    category_id Integer FOREIGN KEY,
    name text,
    price Integer
);

CREATE TABLE categories(
    id Integer PRIMARY KEY,
    name text
);

CREATE TABLE employees(
    id Integer PRIMARY KEY,
    name text,
    email text,
    start_date date,
    end_date date
);

CREATE TABLE populations(
    id serial PRIMARY KEY,
    prefecture_code char(2),
    generation_code char(1),
    gender_code char(1),
    population Integer 
);

CREATE TABLE generations(
    code char(1),
    label text
);

CREATE TABLE genders(
    code char(1) PRIMARY KEY,
    name varchar(1)
);

CREATE TABLE prefectures(
    code varchar(2) PRIMARY KEY,
    region_code varchar(2),
    name text,
    area DOUBLE PRECISION
);

CREATE TABLE regions(
    code varchar(2) PRIMARY KEY,
    name text
);

問題１
INSERT INTO items (
  id , category_id,name,price
) VALUES (
  13, 1, '鰯', 150
);

INSERT INTO items (
  id , category_id,name,price
) VALUES (
  14, 2, '羊',650
);

問題２
UPDATE items
SET price = price * 0.9;

問題３
DELETE FROM employees
WHERE end_date <= '2013-03-31';

問題４
SELECT *
FROM employees
WHERE end_date IS NULL
ORDER BY start_date ASC
LIMIT 1;

問題５
SELECT regions.name, prefectures.name
FROM prefectures
JOIN regions
ON prefectures.region_code = regions.code
ORDER BY prefectures.code;


問題６
SELECT SUM(population) AS population
FROM populations;


問題7
SELECT prefectures.name, genders.name, SUM(populations.population)
FROM populations


問題８
