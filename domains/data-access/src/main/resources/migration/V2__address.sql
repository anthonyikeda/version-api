create table address (
    address_id bigint primary key not null ,
    street_1 varchar(180),
    street_2 varchar(180),
    city varchar(100),
    state varchar(100),
    country varchar(100),
    zip_code varchar(30)
);


insert into address
    select customer_id as address_id,
        city
    from customer
    where city is not null;

alter table customer drop column city;
