--CARD 
select * from card;
drop table Card;
select * from staff;
select * from customer;
select * from card;
create table Card (
    cnumber decimal(12),
    cvv smallint ,
    exp_date date ,
    customer_id decimal(12),
    holder varchar(50),
    constraint Card_PK primary key (cnumber, customer_id),
    constraint Card_fk foreign key (customer_id) references Customer(id)
);

--CUSTOMER
select * from Customer;
create table Customer (
    id decimal(12) not null, 
    fname varchar(50), 
    lname varchar(50),
    username varchar(50) not null ,
    password varchar(50) not null,
    dob DATE , 
    email varchar(50), 
    phone decimal(12),
    gender boolean, 
    address varchar(50),
    constraint CUSTOMER_PK primary key (id)
);
select * from customer;   
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(1, 'Markus', 'Anthony', 'ant110', '123', '1970-01-12', 'man@gmail.com', 041531432, true);
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(5, 'Markus', 'Eric', 'markec', 'qwerty', '1990-11-02', 'markec@gmail.com', 0213211243, false);
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(7, 'Dan', 'Tran', 'baque', 'baque', '1975-04-30', 'dtran1975@gmail.com', 0616166161, true);
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(8, 'Tiger', 'Tran', 'fountainFalley', 'usa', '1931-02-03', 'fountainFalley@gmail.com', 0243234325, true);

-- CONTENT insurance

--version 2
create table content_insurance (
    customer decimal(12) not null, 
    content varchar(10) not null, --start with cont + number
    occupancy varchar(10), --1
    address varchar(50), --2
    mortage boolean, --3
    residence_place boolean, --4
    constraint content_PK primary key (customer, content),
    constraint content_FK foreign key (customer) references customer(id)
);
drop table content_insurance;
select * from CONTENT_INSURANCE;

--CAR insurance

--version 1
create table car_insurance (
    customer decimal(12) not null, 
    car varchar(10) not null, --start with car + number
    registered boolean, --1
    registration int, --1.1
    stateAddfress varchar(20), --2 
    cover_level varchar(20), --3
    accessories varchar(20), --4
    how_to_use varchar(20), --5
    parking varchar(20), --6
    status varchar(20), --7
    younger_driver boolean, --8
    constraint car_pk primary key (customer, car),
    constraint car_fk foreign key (customer) references customer(id)
);

--version 2
create table car_insurance (
    customer decimal(12) not null, 
    car varchar(10) not null, --start with car + number
    registered boolean,
    registration int,
    stateAddfress smallint, --0:NSW 6: northern ter
    cover_level smallint, --0: comprehensive. 1: 3rd party thefty. 2: 3rd party damage
    accessories smallint, --0: yes, 1: no, 2: unsure
    how_to_use smallint,
    parking smallint,
    status smallint,
    younger_driver boolean,
    constraint car_pk primary key (customer, car),
    constraint car_fk foreign key (customer) references customer(id)
);
drop table car_insurance;

--HOME INSURANCE
--version 1
create table home_insurance (
    customer decimal(12) not null, 
    home varchar(10) not null, --start with home + number
    price decimal(9,2),
    constraint home_pk primary key (customer, home),
    constraint home_fk foreign key (customer) references customer(id)
);
--version 2
create table home_insurance (
    customer decimal(12) not null, 
    home varchar(10) not null, --start with home + number
    insurance_type smallint, --1
    stateAddfress smallint, --2.1
    address varchar(50), --2.2
    mortage boolean, --3
    residence_place boolean, --4
    activity boolean, --5
    home_type smallint, --6
    material smallint, --7
    built_year smallint, --8
    theft boolean, --9
    start_date date -- 10
    constraint home_pk primary key (customer, home),
    constraint home_fk foreign key (customer) references customer(id)
);

--INSURANCE TABLE 
create table insurance(
    customer decimal(12) not null, 
    insurance_type varchar(15),
    insurance_id varchar(20) not null,
    price decimal(9,2),
    constraint home_pk primary key (customer, home),
    constraint home_fk foreign key (customer) references customer(id)
);