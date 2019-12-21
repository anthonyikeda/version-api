create table customer (
    customer_id bigint NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY,
    first_name varchar(180),
    last_name varchar(180),
    city varchar(120)
);

insert into customer (first_name, last_name, city)
values ('Mary', 'Contrary', 'Antioch');

insert into customer(first_name, last_name, city)
values('Paul', 'Brosnan', 'Discovery Bay');

insert into customer(first_name, last_name, city)
values('Joan', 'Marshall', 'Terminous');

insert into customer(first_name, last_name, city)
values('Jessie', 'Quick', 'Rio Vista');

insert into customer(first_name, last_name, city)
values('Wally', 'West', 'Petaluma');
