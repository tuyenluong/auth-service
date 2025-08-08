CREATE TABLE IF NOT EXISTS `usersPre` (
    id int primary key,
    name VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    created_at timestamp not null default CURRENT_TIMESTAMP,
    created_by varchar(255) not null,
    updated_at timestamp null,
    updated_by varchar(255) null
);

CREATE TABLE IF NOT EXISTS `groupsPre` (
    id int primary key,
    created_at timestamp not null default CURRENT_TIMESTAMP,
    created_by varchar(255) not null,
    updated_at timestamp null,
    updated_by varchar(255) null
);