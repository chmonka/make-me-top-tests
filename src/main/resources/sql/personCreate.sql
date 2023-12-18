create table person
(
    person_id integer not null
        primary key,
    first_name varchar(255) not null,
    last_name varchar(255) not null,
    max_explorers integer not null,
    patronymic varchar(255),
    registration_date timestamp not null
);

create table keeper
(
    keeper_id serial
        primary key,
    course_id integer not null,
    person_id integer
        constraint fk9shwnc978qh8rdc9lt5wm4hv0
            references person,
    start_date timestamp not null
);

create table explorer_group
(
    group_id serial
        primary key,
    course_id integer not null,
    keeper_id integer
        constraint fkh8hrr3jyoy8yfqf8p2a4s8myj
            references keeper
);

create table explorer
(
    explorer_id serial
        primary key,
    group_id integer
        constraint fkgic31gy5x0br4895manqegg74
            references explorer_group,
    person_id integer
        constraint fk22vbbq13nkvijuwnq9ber8h62
            references person,
    start_date timestamp not null
);

