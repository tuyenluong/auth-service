DROP TABLE IF EXISTS usersDemo, groupsDemo;

CREATE TABLE IF NOT EXISTS `users` (
    id int primary key,
    name varchar(255) not null,
    password varchar(255) not null,
    created_at timestamp not null default CURRENT_TIMESTAMP,
    created_by varchar(255) not null,
    updated_at timestamp null,
    updated_by varchar(255) null
);

CREATE TABLE IF NOT EXISTS `groups` (
    id int primary key,
    created_at timestamp not null default CURRENT_TIMESTAMP,
    created_by varchar(255) not null,
    updated_at timestamp null,
    updated_by varchar(255) null
);