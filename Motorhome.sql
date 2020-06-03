SET GLOBAL time_zone = '+8:00';
DROP DATABASE IF exists NordicMotorhome;
CREATE database NordicMotorhome;
USE NordicMotorhome;
CREATE table motorhomes (
motorhome_id		int					NOT NULL 		PRIMARY KEY 		AUTO_INCREMENT,
manufacturer  		VARCHAR(20) 		NOT NULL,
model				VARCHAR(20)			NOT NULL,
year				INT 				NOT NULL,
seating				INT					NOT NULL,
beds				INT					NOT NULL,
mileage				DOUBLE				NOT NULL,
price				DOUBLE				NOT NULL
);
CREATE table customers (
customer_id			INT				   NOT NULL 		PRIMARY KEY 		AUTO_INCREMENT,
firstName           VARCHAR(20)        NOT NULL,
lastName            VARCHAR(20)        NOT NULL,
cprNr               BIGINT             DEFAULT NULL,
address				VARCHAR(30)		   NOT NULL,
phoneNumber 		BIGINT			   NOT NULL, 
email				VARCHAR(40)		   NOT NULL
);
CREATE table rentals (
rental_id			int					not null		PRIMARY KEY			AUTO_INCREMENT,
dateOfSale			date				not null,
motorhome_id		int					not null,					
saleAmount			double				not null,
returnDate			date				not null,
customer_id			INT					not null,
customerFirstName   varchar(20)			not null,
customerLastName	varchar(20)			not null,
customerAddress		varchar(40)			not null,
customerPhoNo		long				not null, 
customerEmail		varchar(30)			not null,
rental_active		boolean				not null
		/*FOREIGN KEY (customer_id) REFERENCES customers (customer_id),
		FOREIGN KEY (motorhome_id) REFERENCES motorhomes (motorhome_id)
	*/ 
);
create table users (
user_id		int 			not null 	primary key 	AUTO_INCREMENT,
full_name	varchar(90)		not null,
username	varchar(90)		not null,
password	varchar(45)		not null	
);	
INSERT INTO users VALUES 
(1, "Jakob Krogh", "krogh", "hej123")
/*INSERT INTO motorhomes VALUES 
(1,"Fiat","Carthago",2020,6,4,8.2,999.00),
(2,"Ford","Chausson",2020,5,4,9.1,895.00);
INSERT INTO customers VALUES
(1,"Jakob", "Krogh", 0306960123, "Alsvej 4C, 2970 Hørsholm",61278482,"jakob@volthers-krogh.dk"),
(2, "Viktor", "Petterson", 0606970345, "Sydhavnen 1,1 2450 Kbh SV", 32156743, "viggobp@msn.dk"); 
INSERT INTO rentals VALUES
(1, 20200520, 2, 6265.00, 20200527, 1, "Jakob", "Krogh", "Alsvej 4C, 2970 Hørsholm", 61278482, "jakob@volthers-krogh.dk", false),
(2, 20200601, 1, 13986.00, 20200615, 2, "Viktor", "Petterson", "Sydhavnen 1,1 2450 Kbh SV", 32156743, "viggobp@msn.dk", true); 
*/