create database seleniumdb;

use seleniumdb;

create table login(
    username varchar(50),
    password varchar(50)
);

insert into login values('standard_user','secret_sauce');
insert into login values('locked_out_user','secret_sauce');
insert into login values('problem_user','secret_sauce');
insert into login values('performance_glitch_user','secret_sauce');
insert into login values('error_user','secret_sauce');
insert into login values('visual_user','secret_sauce');

select * from login;