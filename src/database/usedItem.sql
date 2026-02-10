drop database if exists usedItem;
create database usedItem;
use usedItem;
create table ItemList(
    orderNum int , 
    mname varchar(10),
    pname varchar(50),
	content varchar(100),
    price bigint ,
    pw varchar(10),
    phoneNum varchar(11),
    orderdate datetime default now(),
    sold bool default true
    );