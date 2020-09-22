drop table tb_user purge;

create table tb_user(
no number primary key,
name varchar(12) not null,
addr varchar(50),
sal number(10,2));

create sequence no_seq increment by 1 start with 1 nocycle nocache;

insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '둘리', '서울시 강서구 염창동', 750000);
insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '강둘리', '서울시 강서구 목동', 750000);
insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '둘리짱', '서울시 강서구 염창동', 450000);
insert into tb_user(no, name, addr, sal) values(no_seq.nextval, '또치', '서울시 서초구 서초동', 550000);


select * from tb_user;