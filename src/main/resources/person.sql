create table Person (
    id bigint primary key auto_increment,
    name varchar(255),
    age varchar (255),
    address varchar (255)
);

insert into Person(name, age, address)
values ('김성인','41','인천');
insert into Person(name, age, address)
values ('홍길동','30','서울');
insert into Person(name, age, address)
values ('아무개','25','강원');
