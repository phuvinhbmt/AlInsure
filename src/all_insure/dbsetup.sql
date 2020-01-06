--CUSTOMER
select * from customer;   
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(1, 'Markus', 'Anthony', 'ant110', '123', '1970-01-12', 'man@gmail.com', 041531432, true);
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(5, 'Markus', 'Eric', 'markec', 'qwerty', '1990-11-02', 'markec@gmail.com', 0213211243, false);
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(7, 'Dan', 'Tran', 'baque', 'baque', '1975-04-30', 'dtran1975@gmail.com', 0616166161, true);
insert into customer(id, fname, lname, username, password, dob, email, phone, gender)
 values(8, 'Tiger', 'Tran', 'fountainFalley', 'usa', '1931-02-03', 'fountainFalley@gmail.com', 0243234325, true);


insert into insurance values(1, 'Home', '1H', 102.02);
insert into insurance values(1, 'Car', '3Car', 52.12);
insert into insurance values(1, 'Content', '4Con', 122.89);

--request 
select * from customer;
select * from staff;