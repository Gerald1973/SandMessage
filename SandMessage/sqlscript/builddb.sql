--Construction of the DB
CREATE schema sandmessage AUTHORIZATION DBA;
create table sandmessage.person 
(
	id  integer not null PRIMARY KEY,
	first_name varchar(64) not null,
	family_name varchar(64) not null,
	nick_name varchar(16) not null,
	email varchar(256) not null
);

create table sandmessage.message
(
	id integer not null primary key,
	text varchar(2048) not null,
	entered_time timestamp(3) not null,
	hidden_time timestamp(3) not null,
	fk_person integer not null,
	foreign key (fk_person) REFERENCES sandmessage.person (id)
);

insert into sandmessage.person(id,first_name,family_name,nick_name,email) values (1,'Gérald','Maréchal','gerald1973','gerald1973@gmail.com');



