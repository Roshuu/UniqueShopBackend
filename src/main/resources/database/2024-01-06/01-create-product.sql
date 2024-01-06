--liquibase formatted  sql
--changeset jj:1
create table product(
    id BIGINT not null auto_increment PRIMARY KEY,
    name varchar(255) not null ,
    category varchar(255) not null,
    description text not null,
    price decimal(9,2) not null,
    currency varchar(3) not null
)