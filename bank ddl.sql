create table clients(
id_client bigint not null primary key auto_increment,
name varchar(50) not null,
middle_name varchar(50) not null,
last_name varchar(50) not null
);

create table accounts(
id_account bigint not null primary key auto_increment,
account_number varchar(20) not null,
amount decimal(19,6)
);

create table client_account(
id_client_account bigint primary key auto_increment,
id_client bigint,
id_account bigint,
constraint fk_client foreign key (id_client)
references clients (id_client)
on delete cascade
on update cascade,
constraint fk_account foreign key (id_account)
references accounts (id_account)
on delete cascade
on update cascade
);

create table cards(
id_cards bigint not null primary key auto_increment,
card_number varchar(16),
id_client_account bigint,
constraint fk_client_account foreign key (id_client_account) 
references client_account (id_client_account)
on delete cascade
on update cascade
)