-- table customer 
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
    constraint CUSTOMER_PK primary key (id),
    constraint CUSTOMER_CHECK_Email check
);

-- table staff
create table Staff  (
    id decimal(12) not null, 
    fname varchar(50), 
    lname varchar(50),
    username varchar(50) not null ,
    password varchar(50) not null,
    dob DATE , 
    email varchar(50), 
    phone decimal(12),
    gender boolean, 
    constraint CUSTOMER_PK primary key (id),
    constraint CUSTOMER_CHECK_Email check
);

select * from staff;

--  insurance table
create table insurance(
    customer decimal(12) not null, 
    insurance_type varchar(15),
    insurance_id varchar(20) not null,
    price decimal(9,2),
    constraint home_pk primary key (customer, insurance_id),
    constraint home_fk foreign key (customer) references customer(id)
);

-- table card
create table Card (
    cnumber decimal(12),
    cvv smallint ,
    exp_date date ,
    customer_id decimal(12),
    holder varchar(50),
    constraint Card_PK primary key (cnumber, customer_id),
    constraint Card_fk foreign key (customer_id) references Customer(id)
);

--request 
create table request(
    customer decimal(12) not null,
    accepter decimal(12),
    phone decimal(12),
    email varchar(30), 
    address varchar(50),
);