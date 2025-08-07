CREATE TABLE IF NOT EXISTS usersDemo (
    id int primary key,
    created_at timestamp not null default CURRENT_TIMESTAMP,
    created_by varchar(255) not null,
    updated_at timestamp null,
    updated_by varchar(255) null
);

CREATE TABLE IF NOT EXISTS groupsDemo (
    id int primary key,
    created_at timestamp not null default CURRENT_TIMESTAMP,
    created_by varchar(255) not null,
    updated_at timestamp null,
    updated_by varchar(255) null
);