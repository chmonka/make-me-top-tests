create table refresh_token_info
(
    token_id serial
        primary key,
    expiration_time timestamp not null,
    person_id integer not null,
    refresh_token varchar(255) not null
        constraint uk_oup7hjkovhulitaa425j4vh7j
            unique,
    role varchar(255) not null
);

create table role
(
    role_id serial
        primary key,
    name varchar(255) not null
        constraint uk_8sewwnpamngi6b1dwaa88askk
            unique
);

create table person_role
(
    person_id integer not null,
    role_id integer not null
        constraint fks7asxi8amiwjjq1sonlc4rihn
            references role,
    primary key (person_id, role_id)
);