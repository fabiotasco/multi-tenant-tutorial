create database vexty;
use vexty;
create table `users` (
    `id` int(11) not null auto_increment,
    `name` varchar(64) not null default '' collate 'utf8_general_ci',
    primary key (`id`)
);

create database vivest;
use vivest;
create table `users` (
    `id` int(11) not null auto_increment,
    `name` varchar(64) not null default '' collate 'utf8_general_ci',
    primary key (`id`)
);
